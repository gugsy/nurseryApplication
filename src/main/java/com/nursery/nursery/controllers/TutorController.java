package com.nursery.nursery.controllers;

import com.nursery.nursery.model.Tutor;
import com.nursery.nursery.service.TutorService;
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
@RequestMapping("/tutor")
public class TutorController {

    @Autowired
    TutorService tutorService;

    @GetMapping("/findTutors")
    public ResponseEntity<List<Tutor>> getAllTutors(@RequestParam(required = false)String employmentNumber){
        try{
            List<Tutor> tutor =  tutorService.findAllTutors(employmentNumber);
            return new ResponseEntity<>(tutor, HttpStatus.OK);
        }
        catch (Exception e)
        {
          return   new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/createTutor")
    public ResponseEntity<Tutor> createTutor(@RequestBody Tutor tutor){
        try{
            Tutor tutor1 =tutorService.createTutor(tutor);
            return new ResponseEntity<>(tutor1,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
