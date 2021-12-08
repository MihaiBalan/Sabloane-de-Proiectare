public class Paragraph implements Element {
    private String text;

    public AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text=text;
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void render() {
        System.out.println("Paragraph: " + text);
    }

    public void setAlignStrategy(AlignStrategy textAlignment) {
        this.textAlignment = textAlignment;
    }
}
