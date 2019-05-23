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
        public int getId(){
            
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

}
