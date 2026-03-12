import java.util.ArrayList;

public class MediaPlayer {
    private ArrayList<Playable> playlist; //listen accepterer alt der er implemented playable

    public MediaPlayer(){
        playlist  = new ArrayList<>();
    }
    void add(Playable item){
        playlist.add(item);
    }
    void playAll(){
        for(Playable item : playlist){
            item.play(); // kalder play på alle elementer
        }
    }
    int getTotalDuration(){
        int total = 0;
        for(Playable item : playlist){
            total = total + item.getDurationSeconds();
        }
        return total;
    }
    void printPlaylist(){
            System.out.println("=== Playlist (" + playlist.size() + " elementer) ===");
            int i = 1;
            for(Playable item : playlist){
                System.out.println(i + ". \"" + item.getTitle() + "\" - " + item.getDurationSeconds());
                i++;
            }
        }
    }


