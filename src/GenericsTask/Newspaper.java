package GenericsTask;

public class Newspaper {
    int index;
    String title;
    String editorChief;

    public Newspaper(String title, String editorChief) {
        this.index = hashCode();
        this.title = title;
        this.editorChief = editorChief;
    }

    @Override
    public String toString() {
        return "Newspaper {" +
                "index: " + index +
                ", title: '" + title + '\'' +
                ", editorChief: '" + editorChief + '\'' +
                '}';
    }
}
