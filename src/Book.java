import java.util.ArrayList;
import java.util.List;

public class Book extends Section {

    private List<Author> Authors;

    public Book(String title) {
        super(title);
        this.Authors=new ArrayList<>();
    }

    public void addAuthor(Author name){
        this.Authors.add(name);
    }

    public void addContent(Element e) {
        super.add(e);
    }

    public void render(){
        System.out.println("Book: "+ title +"\n");
        System.out.println("Authors:");
        for(Author A:Authors)
            A.print();
        System.out.print("\n");
        super.printAux();
    }

}
