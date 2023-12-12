package InterfaceDemo;

public class TollyActionMovies extends TollyWood{
    private final String movieName;
    private final int movieYear;
    private final float movieDuration;
    private final String movieDirector;


    public TollyActionMovies(String movieName, int movieYear, float movieDuration, String movieDirector) {
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
