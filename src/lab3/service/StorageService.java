package lab3.service;

import lab3.model.Professor;
import lab3.model.Person;
import lab3.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StorageService {

    private List<Professor> profesori;
    private List<Student> studenti;

    public StorageService() {
        this.profesori = new ArrayList<>();
        this.studenti = new ArrayList<>();
    }

    public List<Professor> getProfesori() {
        return profesori;
    }

    public void addProfesor(Professor p){
        this.profesori.add(p);
    }

    public void setProfesori(List<Professor> profesori) {
        this.profesori = profesori;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void addStudent(Student p){
        this.studenti.add(p);
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public Student getStudentByName(String name){
        for(Student student : studenti){
            if(student.getName().equals(name))
                return student;
        }
        return null;
    }

    public Professor getProfessorByName(String name){
        for(Professor professor : profesori){
            if(professor.getName().equals(name))
                return professor;
        }
        return null;
    }

    public Person getPersonByName(String name){
        Person p = getProfessorByName(name);
        if (p == null){
            p = getStudentByName(name);
        }
        return p;
    }
}
