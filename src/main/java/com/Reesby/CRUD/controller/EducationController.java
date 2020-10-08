package com.Reesby.CRUD.controller;

import com.Reesby.CRUD.model.Candidate;
import com.Reesby.CRUD.model.Education;
import com.Reesby.CRUD.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/edu")
public class EducationController {
    @Autowired
    EducationService educationService;
    @PostMapping
    public String saveEducation(@RequestBody Education education){

        educationService.save(education);
        return "save success";
    }

    @GetMapping
    public @ResponseBody
    List<Education> getAllEducation(){
        return educationService.getAllEducation();
    }


}
