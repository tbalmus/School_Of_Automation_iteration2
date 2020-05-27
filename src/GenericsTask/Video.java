package GenericsTask;

public class Video {
    int index;
    String title;
    String stageDirector;

    public Video(String title, String stageDirector) {
        this.index = hashCode();
        this.title = title;
        this.stageDirector = stageDirector;

    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Video{" +
                "index=" + index +
                ", title='" + title + '\'' +
                ", stageDirector='" + stageDirector + '\'' +
                '}';
    }
}
