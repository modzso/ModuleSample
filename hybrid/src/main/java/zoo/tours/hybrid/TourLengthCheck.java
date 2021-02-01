package zoo.tours.hybrid;

import zoo.tours.api.Tour;

import java.util.OptionalInt;
import java.util.ServiceLoader;

public class TourLengthCheck {

    public static void main(String[] args) {
        OptionalInt max = ServiceLoader.load(Tour.class)
                .stream().map(ServiceLoader.Provider::get)
                .mapToInt(Tour::length).max();

        max.ifPresent(System.out::println);

        OptionalInt min = ServiceLoader.load(Tour.class)
                .stream().map(ServiceLoader.Provider::get)
                .mapToInt(Tour::length).min();

        min.ifPresent(System.out::println);
    }
}
