package com.myanatomy.notesapp.model;

import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.TextIndexed;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "notes")
public class Note {
  @Id
  private String id;

  @NotBlank(message="Title should not be blank.")
  @Size(max=200, message="Title must be under 200 characters")
  @TextIndexed
  private string Title;

  @TextIndexed                 // Enables full-text search on this field
  private String content;

  private String aiSummary;

  private List<String> tags= new ArrayList<>();

  @CreadtedDate
  private LocalDateTime createdAt;

  @LastModifiedDate
  private LocalDateTime updatedAt;
}