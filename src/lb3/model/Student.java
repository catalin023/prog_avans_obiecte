package lb3.model;

public class Student extends Person{

    private int student_number;
    private float average_mark;

    private int clasa;


    public Student(String name, String phone_number, String email_address, int student_number, float average_mark, int clasa) {
        super(name, phone_number, email_address);
        this.student_number = student_number;
        this.average_mark = average_mark;
        this.clasa = clasa;
    }

    public int getStudent_number() {
        return student_number;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    public float getAverage_mark() {
        return average_mark;
    }

    public void setAverage_mark(float average_mark) {
        this.average_mark = average_mark;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    @Override
    public String toString() {
        return "name: '" + getName() + "'\n" +
                "phone number: '" + getPhone_number() + "'\n" +
                "email: '" + getEmail_address() + "'\n" +
                "student number: '" + student_number + "'\n" +
                "average mark: '" + average_mark + "'\n" +
                "class: '" + clasa + "'\n";
    }
}
