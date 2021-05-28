package br.com.digitalhouse.demo.services;

import br.com.digitalhouse.demo.dtos.ResponseStudentDTO;
import br.com.digitalhouse.demo.dtos.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public interface StudentApprovedService {

    public ResponseStudentDTO studentApproved(StudentDTO studentDTO);
}
