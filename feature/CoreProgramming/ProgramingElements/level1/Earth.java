public class Earth {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert km to miles (1 km = 0.621371 miles)
        double radiusMiles = radiusKm * 0.621371;

        // Volume in cubic miles
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm +
                        " and cubic miles is " + volumeMiles
        );
    }
}
