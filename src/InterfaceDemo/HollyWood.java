package InterfaceDemo;

public abstract class HollyWood implements Movies {
    private final String section = "Hollywood";

    @Override
    public void getMovieDetails() {
        System.out.println("Movie Section: " + section);
    }
}