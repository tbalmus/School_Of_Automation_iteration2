package OOPTask;

public class Item {

    private long id;
    private String title;
    private int price;
    private Type type;

    public Item(long id, String title, int price, Type type) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.type = type;

        setId(id);
        setTitle(title);
        setPrice(price);
        setType(type);
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
