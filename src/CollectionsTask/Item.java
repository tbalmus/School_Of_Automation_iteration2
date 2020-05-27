package CollectionsTask;

public class Item {

    private long id;
    private String title;
    private Type type;

    public Item(long id, String title, Type type) {
        this.id = id;
        this.title = title;
        this.type = type;
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
}