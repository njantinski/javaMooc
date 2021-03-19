
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

   
    public boolean equals(Object otherSong){
        if(this == otherSong){
            return true;
        }
        if(!(otherSong instanceof Song)){
            return false;
        }
        Song comparedSong = (Song) otherSong;
        return this.artist.equals(comparedSong.artist) &&
                this.name.equals(comparedSong.name) &&
                this.durationInSeconds == comparedSong.durationInSeconds;
    }
        

}
