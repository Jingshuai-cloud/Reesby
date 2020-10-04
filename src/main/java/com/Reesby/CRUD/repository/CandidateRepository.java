package com.Reesby.CRUD.repository;

import com.Reesby.CRUD.model.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, String> {
    public Candidate findByCandidateId(String candidateId);
}
