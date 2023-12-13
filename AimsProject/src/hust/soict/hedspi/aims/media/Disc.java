package hust.soict.hedspi.aims.media;

public class Disc extends Media implements Playable {
    private String director;
    private int length;

    // Getter
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    // Constructor
    public Disc() {
    }

    public Disc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }    
    
    // isMatch method
    public boolean isMatch(String title){
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }
    
    @Override
    public String toString(){
        return super.toString()
                + " - " + director
                + " - " + length
                + ": " + String.format("%.2f $", getCost());
    }

    @Override
    public void play() {
        
    }
}
