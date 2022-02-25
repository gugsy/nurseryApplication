package com.nursery.nursery.controllers;

import com.nursery.nursery.model.Parent;
import com.nursery.nursery.service.ParentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("")
@RestController
@RequestMapping("/parent")
public class ParentController {

    @Autowired ParentService parentService;

    @GetMapping("/findParents")
    public ResponseEntity<List<Parent>> getAllTutors(@RequestParam(required = false)String name){
        try{
            List<Parent> parent =  parentService.findAllParents(name);
            return new ResponseEntity<>(parent, HttpStatus.OK);
        }
        catch (Exception e)
        {
            return   new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/createParent")
    public ResponseEntity<Parent> createTutor(@RequestBody Parent parent){
        try{
            Parent parent1 =parentService.createParent(parent);
            return new ResponseEntity<>(parent1,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

   //add parent to child

}
