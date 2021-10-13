import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> SubChapters;

    public Chapter(String name){
        this.name=name;
        this.SubChapters = new ArrayList<>();
    }

    public int createSubChapter(String subchap){
        SubChapter newSubChapter = new SubChapter(subchap);
        this.SubChapters.add(newSubChapter);
        return SubChapters.indexOf(newSubChapter);
    }

    public SubChapter getSubChapter(int index){
        return this.SubChapters.get(index);
    }

    public void print() {
    }
}
