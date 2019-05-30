package hotel;

public class Person {

    private int id;
    private String name;
    private String surname;
    private int number;

    public Person(int id, String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.id = id;

    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }

    public int getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;

    }

    public void setNumber(int number) {
        this.number = number;

    }
}
