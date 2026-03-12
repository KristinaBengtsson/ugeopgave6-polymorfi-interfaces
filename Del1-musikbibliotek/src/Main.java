public class Main {
    public static void main(String[] args) {
//Opret songs, podcasts og audiobooks
        Song song1 = new Song("Triple Spin", "Lana", 136);
        Song song2 = new Song("Absorb", "N", 161);
        Song song3 = new Song("Figid Room", "Surkit", 149);

        Podcast podcast1 = new Podcast("From another angle", "Misty Blue", 6658);
        Podcast podcast2 = new Podcast("Never before and forever", "Henrik Wolter", 7184);

        Audiobook audiobook1 = new Audiobook("The Thursday Murder Club", "Richard Osman", 36085);
        Audiobook audiobook2 = new Audiobook("Guldfuglen", "Marie Lopuise Toksvig", 40256);

//Lav en afspiller og tilføj elementerne
        MediaPlayer player = new MediaPlayer();
        player.add(song1);
        player.add(song2);
        player.add(song3);
        player.add(podcast1);
        player.add(podcast2);
        player.add(audiobook1);
        player.add(audiobook2);

        player.printPlaylist();
        player.playAll();
        System.out.println("Samlet spilletid: " + player.getTotalDuration());
    }
}

        /*
//Opret mindst seks mediaelementer af alle tre typer. Gem dem i en ArrayList<Playable>.
//Kald playAll() og print den samlede spilletid.
 forventet output:
        System.out.println("=== Playlist " + " \"antal\" " + " elementer) ===");
        System.out.println("track nummer (1). " + " \"Title\" " + " - " + "min:sek");
        System.out.println("track nummer (2). " + " \"Title\" " + " - " + "min:sek");
        System.out.println("track nummer (3). " + " \"Title\" " + " - " + "min:sek");
        System.out.println("...");
        System.out.println();
        song1.play();
        podcast1.play();
        audiobook2.play();
        System.out.println("...");
        System.out.println();
        System.out.println("Samlet spilletid: " + "t:min:sek");
    }*/

