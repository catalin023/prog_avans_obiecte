package lab3;

import lab3.model.Person;
import lab3.model.Professor;
import lab3.model.Student;
import lab3.service.StorageService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        StorageService storageService = new StorageService();

        Person p;

        //easy testing
        storageService.addStudent(new Student("Alexandru", "04221551", "alexandru@gmail.com", 12, 8.5f,242));
        storageService.addProfesor(new Professor("Catalin", "07412501", "catalin@fmi.ro", "PAO", 2));
        while(true){
            System.out.println("Available commands: create, read, update, delete, quit");

            String comanda = s.nextLine().toLowerCase();
            System.out.println("Comand received: "+comanda);

            String name;
            String phone_number;
            String email;
            int student_number;
            float average_mark;
            int clasa;
            String course;
            int year;

            switch (comanda) {
                case "create":
                    System.out.println("Enter type of person:");
                    String personType = s.nextLine().toLowerCase();

                    switch (personType) {
                        case "student":
                            System.out.println("name:");
                            name = s.nextLine();

                            p = storageService.getPersonByName(name);
                            if(p != null) {
                                System.out.println("Already existing");
                                break;
                            }

                            System.out.println("phone number:");
                            phone_number = s.nextLine();
                            System.out.println("email:");
                            email = s.nextLine();
                            System.out.println("student number:");
                            student_number = s.nextInt();
                            System.out.println("average mark:");
                            average_mark = s.nextFloat();
                            System.out.println("class:");
                            clasa = s.nextInt();

                            Student student = new Student(name, phone_number, email, student_number, average_mark, clasa);
                            storageService.addStudent(student);
                            break;
                        case "professor":
                            System.out.println("name:");
                            name = s.nextLine();

                            p = storageService.getPersonByName(name);
                            if(p != null) {
                                System.out.println("Already existing");
                                break;
                            }

                            System.out.println("phone number:");
                            phone_number = s.nextLine();
                            System.out.println("email:");
                            email = s.nextLine();
                            System.out.println("course:");
                            course = s.nextLine();
                            System.out.println("year:");
                            year = s.nextInt();

                            Professor professor = new Professor(name, phone_number, email, course, year);
                            storageService.addProfesor(professor);
                            break;
                        default:
                            System.out.println("Command not recognised!");
                    }
                    System.out.println("Created!");
                    break;
                case "read":
                    System.out.println("Name:");
                    name = s.nextLine();
                    p = storageService.getPersonByName(name);
                    if(p != null){
                        System.out.println(p);
                    }else{
                        System.out.println("Not existing");
                    }
                    break;
                case "update":
                    System.out.println("Name:");
                    name = s.nextLine();
                    p = storageService.getPersonByName(name);
                    if(p == null) {
                        System.out.println("Not existing");
                        break;
                    }

                    System.out.println("name:");
                    name = s.nextLine();

                    Person checkPerson = storageService.getPersonByName(name);

                    if(checkPerson != null && checkPerson != p) {
                        System.out.println("Already existing");
                        break;
                    }

                    System.out.println("phone number:");
                    phone_number = s.nextLine();
                    System.out.println("email:");
                    email = s.nextLine();


                    if(p instanceof Professor){
                        System.out.println("course:");
                        course = s.nextLine();
                        System.out.println("year:");
                        year = s.nextInt();

                        ((Professor) p).setCourse(course);
                        ((Professor) p).setYear(year);
                    }else if(p instanceof Student){
                        System.out.println("student number:");
                        student_number = s.nextInt();
                        System.out.println("average mark:");
                        average_mark = s.nextFloat();
                        System.out.println("class:");
                        clasa = s.nextInt();

                        ((Student) p).setStudent_number(student_number);
                        ((Student) p).setAverage_mark(average_mark);
                        ((Student) p).setClasa(clasa);
                    }
                    p.setName(name);
                    p.setPhone_number(phone_number);
                    p.setEmail_address(email);
                    System.out.println("Updated!");
                    break;
                case "delete":
                    System.out.println("Name:");
                    name = s.nextLine();
                    p = storageService.getPersonByName(name);
                    if(p == null) {
                        System.out.println("Not existing");
                        break;
                    }
                    if(p instanceof Professor){
                        storageService.getProfesori().remove(p);
                    }else if(p instanceof Student){
                        storageService.getStudenti().remove(p);
                    }
                    System.out.println("Deleted!");
                    break;
                case "quit":
                    System.exit(0);
                default:
                    System.out.println("Command not recognised!");
            }
        }

    }

}
