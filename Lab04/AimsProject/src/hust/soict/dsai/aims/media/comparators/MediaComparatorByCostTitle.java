package hust.soict.dsai.aims.media.comparators;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media a, Media b) {
        return Comparator.comparingDouble(Media::getCost)
                .reversed()
                .thenComparing(Media::getTitle)
                .compare(a, b);
    }
}
