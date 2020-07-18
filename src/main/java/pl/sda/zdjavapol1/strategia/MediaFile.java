package pl.sda.zdjavapol1.strategia;

public class MediaFile {

    private PlayBehavior behavior;
    private ViewBehavior viewBehavior;
    // ...

    public void play() {
        if (behavior != null) {
            behavior.play();
        } else {
            System.out.println("media file not supported to play");
        }
    }

    public void view() {
        if (viewBehavior != null) {
            viewBehavior.view();
        } else {
            System.out.println("media file not supported to view");
        }
    }

    public void setBehavior(PlayBehavior behavior) {
        this.behavior = behavior;
    }

    public void compress() {
        // TODO
    }

    // ...
}
