//Superclass / Parentclass
public abstract class MediaItem{
//Fungerer som en fælles baseklasse
    private String title;
    private int durationSeconds;

//Konstruktør som tager title og durationSeconds
    public MediaItem(String title, int durationSeconds){
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

//getters
    public String getTitle() {
        return title;
    }
    public int getDurationSeconds() {
        return durationSeconds;
    }
//ToString
    @Override
    public String toString() {
        return super.toString();
    }
}