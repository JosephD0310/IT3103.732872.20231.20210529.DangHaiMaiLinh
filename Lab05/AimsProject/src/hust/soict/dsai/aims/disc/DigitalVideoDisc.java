package hust.soict.dsai.aims.disc;

import javax.swing.JDialog;
import javax.swing.JLabel;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class DigitalVideoDisc extends Media implements Playable {
    public static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;

    public DigitalVideoDisc(String title) {
        super();
        setTitle(title);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, float cost) {
        super(title, cost);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        setCategory(category);
        setCost(cost);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this(category, title, cost);
        setDirector(director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(director, category, title, cost);
        setLength(length);
    }

    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: $%f", getTitle(), getCategory(), director, length, getCost());
    }

    public boolean isMatch(String title) {
        return getTitle().equals(title);
    }

    public void play() throws PlayerException {
        // TODO Auto-generated method stub
        if (this.getLength() > 0) {
            JDialog dialog = new JDialog();
            dialog.setSize(300, 200);

            // create Label
            JLabel text = new JLabel("DVD - Title : " + this.getTitle() + " Length : " + this.getLength());
            dialog.add(text);
            dialog.setTitle("Play DVD");
            dialog.setVisible(true);
        } else
            throw new PlayerException("ERROR : DVD length is non-positive");
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
}