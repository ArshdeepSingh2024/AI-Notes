package com.myanatomy.notesapp.repository;

import com.myanatomy.notesapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * UserRepository — Data access for User documents.
 *
 * Spring Data generates all SQL/MongoDB queries from method names:
 * findByEmail("a@b.com") -> db.users.find({ email: "a@b.com" })
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
