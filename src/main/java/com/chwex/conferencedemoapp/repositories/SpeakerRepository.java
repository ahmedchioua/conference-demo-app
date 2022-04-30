package com.chwex.conferencedemoapp.repositories;

import com.chwex.conferencedemoapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
