package hust.soict.dsai.aims.media;

import javax.swing.JDialog;
import javax.swing.JLabel;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable {

	private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play() throws PlayerException {
        // TODO Auto-generated method stub
        if (this.getLength() > 0) {
            JDialog dialog = new JDialog();
            dialog.setSize(300, 200);

            // create Label
            JLabel text = new JLabel("Track - Title : " + this.getTitle() + " Length : " + this.getLength());
            dialog.add(text);
            dialog.setTitle("Play Track");
            dialog.setVisible(true);
        } else
            throw new PlayerException("ERROR : Track length is non-positive");
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Track)) return false;
        // 2 tracks are considered as identical if they have the same length and title
        return (((Track) o).getTitle().equals(title)
                && ((Track) o).getLength() == length);
    }
}
