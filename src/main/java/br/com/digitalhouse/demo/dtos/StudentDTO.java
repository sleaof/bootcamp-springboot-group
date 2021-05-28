package br.com.digitalhouse.demo.dtos;

import java.util.ArrayList;
import java.util.List;

public class StudentDTO {

    private String name;
    private List<SubjectDTO> subjects = new ArrayList<>();

    public StudentDTO(String name, List<SubjectDTO> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }
}
