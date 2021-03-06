import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    public String title;
    private List<Element> children;

    public Section(String title){
        this.title=title;
        this.children=new ArrayList<>();
    }

    @Override
    public void add(Element e) {
        this.children.add(e);
    }

    @Override
    public void remove(Element e) {
        this.children.remove(e);
    }

    @Override
    public Element get(int index) {
        return this.children.get(index);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
        for(Element e: children)
        {
            e.accept(v);
        }
    }

    public void printAux(){
        for(Element E:children)
            E.render();
    }

    @Override
    public void render() {
        System.out.println("Section: " + this.title);
    }
}
