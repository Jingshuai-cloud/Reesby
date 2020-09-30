package com.Reesby.CRUD.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public @ResponseBody String getDemo(){
        return "get method  invoked";
    }

    @PostMapping
    public String postDemo(){
        return "post method  invoked";
    }

    @DeleteMapping
    public String deleteDemo(){
        return "delete method  invoked";
    }

    @PutMapping
    public String putDemo(){
        return "put method  invoked";
    }

}
