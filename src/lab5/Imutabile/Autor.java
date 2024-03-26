package lab5.Imutabile;

public class Autor {
    private String nume;
    private int age;

    public Autor(String nume, int age) {
        this.nume = nume;
        this.age = age;
    }

    public Autor(Autor autor) {
        this.nume = autor.getNume();
        this.age = autor.getAge();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                ", age=" + age +
                '}';
    }
}
