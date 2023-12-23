package hust.soict.dsai.aims.media;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable{
	private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    public CompactDisc(String title, float cost) {
        super(title, cost);
    }
    
    public CompactDisc(String title, String category, float cost) {
        super(title,category, cost);
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks.addAll(tracks);
    }

    public boolean addTrack(Track track) {
        if (tracks.contains(track)) {   // Check if the track is already right in
            System.out.println("Track already existed");
            return false;
        } else {    // If the track has not been existed, add it
            tracks.add(track);
            System.out.println("Track added successfully");
            return true;
        }
    }

    public boolean removeTrack(Track track) {
        if (!tracks.contains(track)) {  // Check if there is such a track
            System.out.println("No such track found");
            return false;
        } else {
            tracks.remove(track);   // If it does exist, remove it
            System.out.println("Track removed successfully");
            return true;
        }
    }

    public void play() throws PlayerException {
        int size = tracks.size();
        JPanel layout = new JPanel(new GridLayout(size, 1));
        if (this.getLength() < 0) {
            throw new PlayerException("ERROR : CD length is non-positive");
        }
        for (Track track : tracks) {
            if (track.getLength() > 0) {
                // create Label
                JLabel text = new JLabel("CD - Title : " + track.getTitle() + " Length : " + track.getLength());

                layout.add(text);
            } else
                throw new PlayerException("ERROR : Disc length is non-positive");
        }
        JDialog dialog = new JDialog();
        dialog.setSize(300, 200);
        dialog.add(layout);
        dialog.setTitle("Play CD");
        dialog.setVisible(true);
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int getLength() {
        int length = 0;
        for (Track track : tracks) {    // Iterate over the track list
            length += track.getLength();    // Sum up the track lengths
        }
        return length;
    }

    @Override
    public String toString() {
        return String.format("CD - %s - %s - %s - %d: $%f",
                getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }
}
