package com.angiehempkmeier.studydiary.usecases;

import com.angiehempkmeier.studydiary.adapters.input.CreateStudyLogRequest;
import com.angiehempkmeier.studydiary.entities.StudyLog;

import java.util.Date;

public interface CreateStudyLogUseCase {
    StudyLog execute(CreateStudyLogRequest request);


}
