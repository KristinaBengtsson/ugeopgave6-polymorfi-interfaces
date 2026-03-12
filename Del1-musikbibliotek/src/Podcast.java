public class Podcast extends MediaItem implements Playable{
    private String host;

    public Podcast(String title, String host, int durationSeconds){
        super(title, durationSeconds);
        this.host = host;
    }
    public void play(){
        System.out.println("Afspiller podcast: \"" + this.getTitle() + "\" med " + host + " (" + this.getDurationSeconds() + ")");
    }
}
