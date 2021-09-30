import java.util.ArrayList;
import java.util.List;

public class Book {

    private String Title;
    private String Table;
    private String Image;
    private List<String> Paragraphs;

    // Constructor
    public Book(String name){
        this.Title=name;
        this.Paragraphs=new ArrayList<>();
    }

    public void createNewParagraph(String paragraph){
        this.Paragraphs.add(paragraph);
    }

    public void createNewImage(String img){
        this.Image=img;
    }

    public void createNewTable(String tbl){
        this.Table=tbl;
    }

    public void print() {
        System.out.print("Book = "  + Title + "\n" +
                " Image = " + Image + "\n" +
                " Table = " + Table + "\n" +
                " Paragraphs = " + Paragraphs);
    }
}
