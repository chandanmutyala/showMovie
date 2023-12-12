package InterfaceDemo;

public class HollyComedyMovies extends HollyWood {
    private final String movieName;
    private final int movieYear;
    private final float movieDuration;
    private final String movieDirector;


    public HollyComedyMovies(String movieName, int movieYear, float movieDuration, String movieDirector) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDuration = movieDuration;
        this.movieDirector = movieDirector;
    }

    @Override
    public void getMovieDetails() {
        super.getMovieDetails();
        System.out.println("Movie Name: " + movieName);
        System.out.println("Year: " + movieYear);
        System.out.println("Duration: " + movieDuration + " minutes");
        System.out.println("Director: " + movieDirector);
    }
}
