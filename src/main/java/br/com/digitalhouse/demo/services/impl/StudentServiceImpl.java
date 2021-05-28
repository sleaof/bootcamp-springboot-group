package br.com.digitalhouse.demo.services.impl;

import br.com.digitalhouse.demo.dtos.ResponseStudentDTO;
import br.com.digitalhouse.demo.dtos.StudentDTO;
import br.com.digitalhouse.demo.dtos.SubjectDTO;
import br.com.digitalhouse.demo.services.StudentApprovedService;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentApprovedService {


    @Override
    public ResponseStudentDTO studentApproved(StudentDTO studentDTO) {

        ResponseStudentDTO responseStudent = new ResponseStudentDTO();

        responseStudent.setName(studentDTO.getName());
        responseStudent.setAvarage(getAvarege(studentDTO));
        responseStudent.setMsg(getMesage(studentDTO));

        return responseStudent;
    }

    public Double getAvarege(StudentDTO studentDTO){
        double average = 0.0;
        int i = 0;

        for(SubjectDTO s : studentDTO.getSubjects()){
            average += s.getGrade();
            i++;
        }

        return average/i;
    }

    public String getMesage(StudentDTO studentDTO){
        String msg = "";

        if(getAvarege(studentDTO) > 5){
            msg = "Aprovado :)";
            if(getAvarege(studentDTO) > 9){
                msg = "Parabéns, Aprovado";
            }
        }else msg = "Reprovado =/";

        return msg;
    }


}
