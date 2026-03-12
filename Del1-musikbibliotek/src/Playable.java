public interface Playable {
    //Polymorfi
    // Alle klasser der implementerer Playable SKAL have disse metoder.

    void play();
    String getTitle();
    int getDurationSeconds();
}
