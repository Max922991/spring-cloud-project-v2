package org.example.passportservice.repositories;

import org.example.passportservice.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepositories extends JpaRepository<Passport, Long> {
}
