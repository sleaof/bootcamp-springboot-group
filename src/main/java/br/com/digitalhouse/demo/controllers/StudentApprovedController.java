package br.com.digitalhouse.demo.controllers;


import br.com.digitalhouse.demo.dtos.ResponseStudentDTO;
import br.com.digitalhouse.demo.dtos.StudentDTO;
import br.com.digitalhouse.demo.services.StudentApprovedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentApprovedController {

    @Autowired
    public StudentApprovedService studentApprovedService;

    @PostMapping("/final")
    public ResponseEntity<ResponseStudentDTO> studentData(@RequestBody StudentDTO studentDTO){
        return new ResponseEntity<>(studentApprovedService.studentApproved(studentDTO), HttpStatus.OK);
    }

}
