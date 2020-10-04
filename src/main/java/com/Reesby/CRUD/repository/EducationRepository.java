package com.Reesby.CRUD.repository;

import com.Reesby.CRUD.model.Candidate;
import com.Reesby.CRUD.model.Education;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends CrudRepository<Education, String>  {
}
