public class Audiobook extends MediaItem implements Playable{
    String author;

    public Audiobook(String title, String author, int durationSeconds){
        super(title, durationSeconds);
        this.author = author;
    }
    public void play(){
        System.out.println("Afspiller lydbog: \"" + this.getTitle() + "\" af " + author + " (" + this.getDurationSeconds() + ")");
    }
}
