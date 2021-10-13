import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> Images;
    private List<Paragraph> Paragraphs;
    private List<Table> Tables;

    public SubChapter(String name){
        this.name=name;
        this.Images = new ArrayList<>();
        this.Paragraphs = new ArrayList<>();
        this.Tables = new ArrayList<>();
    }

    public void createNewParagraph(String paragraph){
        Paragraph newParagraph = new Paragraph(paragraph);
        this.Paragraphs.add(newParagraph);
    }

    public void createNewImage(String image){
        Image newImage = new Image(image);
        this.Images.add(newImage);
    }

    public void createNewTable(String table){
        Table newTable = new Table(table);
        this.Tables.add(newTable);
    }

    public void print() {
        System.out.print("Subchapter: "  + name + "\n");
        for(Paragraph p: Paragraphs)
            System.out.print("Paragraph: " + p.getText() + "\n");
        for(Image i: Images)
            System.out.print("Image with name: " + i.getImageName() + "\n");
        for(Table t: Tables)
            System.out.print("Table with Title: " + t.getTitle() + "\n");
    }
}
