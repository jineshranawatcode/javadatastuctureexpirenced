package practise_1;

public class Book {

    private String firstName;
    private String lastName;
    private int id;

    public Book(String firstName, String lastName, int id) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public String getname(){
        return this.firstName;
    }
    public String getname2(){
        return this.lastName;
    }
    public int getId(){
        return this.id;
    }
    @Override
    public String toString() {
        return this.getname() + this.getname2() + getId();
    }
    }
