package hotel;


public class Person {

    private String name;
    private String surname;
    private long number;

    public Person(String name, String surname, long number) {
        this.name = name;
        this.surname = surname;
        this.number = number;

    }

    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }

    public long getNumber() {
        return number;
    }

}
