package com.angiehempkmeier.studydiary.usecases;

import com.angiehempkmeier.studydiary.entities.StudyLog;

import java.util.Date;

public interface CreateStudyLogUseCase {
    StudyLog createStudyLog(Date date, String description);


}
