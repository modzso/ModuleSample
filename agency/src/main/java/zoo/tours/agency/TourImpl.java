package zoo.tours.agency;

import zoo.tours.api.Souvenir;
import zoo.tours.api.Tour;

public class TourImpl implements Tour {

    @Override
    public String name() {
        return "Behind the scenes";
    }

    @Override
    public int length() {
        return 120;
    }

    @Override
    public Souvenir getSouvenir() {
        Souvenir gift = new Souvenir();
        gift.setDescription("stuffed animal");
        return gift;
    }
}
