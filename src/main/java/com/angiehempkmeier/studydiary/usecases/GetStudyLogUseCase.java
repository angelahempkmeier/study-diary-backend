package com.angiehempkmeier.studydiary.usecases;

import com.angiehempkmeier.studydiary.entities.StudyLog;

import java.util.UUID;

public interface GetStudyLogUseCase {
    StudyLog getStudyLog(UUID id);

}
