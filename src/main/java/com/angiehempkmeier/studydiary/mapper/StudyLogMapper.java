package com.angiehempkmeier.studydiary.mapper;

import com.angiehempkmeier.studydiary.adapters.input.CreateStudyLogRequest;
import com.angiehempkmeier.studydiary.entities.StudyLog;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudyLogMapper {
    CreateStudyLogRequest entityToRequest(StudyLog studyLog);
    StudyLog requestToEntity(CreateStudyLogRequest studyLogRequest);
    @Mapping(target = "id", ignore = true)
    CreateStudyLogRequest createRequestWithoutId(StudyLog studyLog);
}
