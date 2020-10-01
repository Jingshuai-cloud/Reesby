package com.Reesby.CRUD.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/demo")
@Tag(name = "contact", description = "the Demo API")
public class DemoController {

    @Operation(summary = "Find Contacts by name", description = "Name search by %name% format", tags = { "contact" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation") })
    @GetMapping
    public @ResponseBody String getDemo(){
        return "get method  invoked";
    }

    @Operation(summary = "Add a new contact", description = "", tags = { "contact" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Contact created"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "409", description = "Contact already exists") })
    @PostMapping
    public String postDemo(){
        return "post method  invoked";
    }

    @Operation(summary = "Deletes a contact", description = "contract delete", tags = { "contact" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "404", description = "Contact not found") })
    @DeleteMapping
    public String deleteDemo(){
        return "delete method  invoked";
    }

    @Operation(summary = "Update an existing contact", description = "contract update", tags = { "contact" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Contact not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception") })
    @PutMapping
    public String putDemo(){
        return "put method  invoked";
    }

}
