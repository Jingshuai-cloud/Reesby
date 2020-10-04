package com.Reesby.CRUD.service;

import com.Reesby.CRUD.model.Candidate;
import com.Reesby.CRUD.model.Education;
import com.Reesby.CRUD.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EducationService {
    @Autowired
    EducationRepository educationRepository;
    public void save(Education education){
        educationRepository.save(education);
    }

    public List<Education> getAllEducation(){
        List<Education> educations= new ArrayList<Education>();
        educationRepository.findAll().forEach(education -> educations.add(education));
        return educations;
    }
}
