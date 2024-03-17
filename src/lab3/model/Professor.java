package lab3.model;

public class Professor extends Person{

    private String course;
    private int year;

    public Professor(String name, String phone_number, String email_address, String course, int year) {
        super(name, phone_number, email_address);
        this.course = course;
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "name: '" + getName() + "'\n" +
                "phone number: '" + getPhone_number() + "'\n" +
                "email: '" + getEmail_address() + "'\n" +
                "course: '" + course + "'\n" +
                "year: '" + year + "'\n";
    }

}
