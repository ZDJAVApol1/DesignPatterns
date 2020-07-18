package pl.sda.zdjavapol1.strategia;

public class MediaFileProgram {


    public static void main(String[] args) {

//        String mediaType = "audio";
//        MediaFile mediaFile;
//
//        if ("audio".equals(mediaType)) {
//            mediaFile = new Audio();
//            mediaFile.play();
//        } else if ("video".equals(mediaType)) {
//            mediaFile = new Video();
//            mediaFile.play();
//        }

        MediaFile mediaFile = new MediaFile();
        mediaFile.setBehavior(new VideoBehavior());
        mediaFile.play();

        mediaFile.setBehavior(new AudioBehavior());
        mediaFile.play();

        mediaFile.setBehavior(new GifBehavior());
        mediaFile.play();

        mediaFile.setBehavior(null);
        mediaFile.play();
    }
}
