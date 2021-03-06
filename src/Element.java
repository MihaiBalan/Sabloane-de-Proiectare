public interface Element {

    void add(Element e);

    void remove(Element e);

    Element get(int index);

    void accept(Visitor v);

    void render();
}

