public class Song extends MediaItem implements Playable{
       private String artist;

    public Song(String title, String artist, int durationSeconds){
        super(title, durationSeconds);
        this.artist = artist;
        }
       public void play(){
            System.out.println("Afspiller: \"" + this.getTitle() + "\" af " + artist + " (" + this.getDurationSeconds() + ")");
        }
    }
