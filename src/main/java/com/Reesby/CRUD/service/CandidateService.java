package com.Reesby.CRUD.service;

import com.Reesby.CRUD.model.Candidate;
import com.Reesby.CRUD.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    public List<Candidate> getAllCandidate(){
        List<Candidate> candidates= new ArrayList<Candidate>();
        candidateRepository.findAll().forEach(candidate -> candidates.add(candidate));
        return candidates;
    }

    public Candidate getCandidateById(String id){
        return candidateRepository.findByCandidateId(id);
    }

    public void saveOrUpdate(Candidate candidate){
        candidateRepository.save(candidate);
    }

    public void deleteById(String id){
        candidateRepository.deleteById(id);
    }
}
