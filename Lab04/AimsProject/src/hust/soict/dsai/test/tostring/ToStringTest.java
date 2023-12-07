package hust.soict.dsai.test.tostring;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;

public class ToStringTest {
    public static void main(String[] args) {
        List<Media> ms = new ArrayList<>();
        ms.add(new CompactDisc(1, "Some CD", "Cartoon", 1f, 2, "Peter"));
        ms.add(new DigitalVideoDisc("Thomas", "Action film", "Some DVD", 9f));
        ms.add(new Book(0, "Some book", "History book", 10f));
        for (Media m : ms) {
            System.out.println(m.toString());
        }
    }
}