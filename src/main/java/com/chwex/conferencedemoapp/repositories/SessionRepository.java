package com.chwex.conferencedemoapp.repositories;

import com.chwex.conferencedemoapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
