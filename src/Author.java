import java.util.ArrayList;

public class Author {
    private String Name;
    private String Surname;

    public Author(String name){
        this.Name=name;
        this.Surname="";
    }

    public Author(String name, String surname){
        this.Name=name;
        this.Surname=surname;
    }

    public void print() {
        System.out.println("Author: "+this.Name);
    }
}
