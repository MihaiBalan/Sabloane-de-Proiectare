import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{

    private final String url;

    public Image(String url){
        this.url=url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return this;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void render() {
        System.out.println("Image with name: " + this.url);
    }

}
