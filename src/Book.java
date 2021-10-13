import java.util.ArrayList;
import java.util.List;

public class Book {

    private String Title;
    private List<Author> Authors;
    private List<Chapter> Chapters;

    // Constructor
    public Book(String name){
        this.Title=name;
        this.Authors=new ArrayList<>();
        this.Chapters=new ArrayList<>();
    }

    public int createChapter(String chap){
        Chapter newChapter = new Chapter(chap);
        this.Chapters.add(newChapter);
        return Chapters.indexOf(newChapter);
    }

    public Chapter getChapter(int index){
        return this.Chapters.get(index);
    }

    public void addAuthor(Author name){
        this.Authors.add(name);
    }

    public void print() {
    }
}
