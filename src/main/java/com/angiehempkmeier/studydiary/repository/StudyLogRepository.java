package com.angiehempkmeier.studydiary.repository;

import com.angiehempkmeier.studydiary.entities.StudyLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public abstract class StudyLogRepository implements JpaRepository<StudyLog, UUID> {
}
