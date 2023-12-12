package InterfaceDemo;

public class ClientMovies {


    public static void main(String[] args) {
        Movies hollyActionMovie = new HollyActionMovies("Avathar ", 2022, 136, "James Cameroon");
        Movies tollyActionMovie = new TollyActionMovies("Athadu", 2005, 150, "Thrivikram Srinivas");
        Movies hollyComedyMovie = new HollyComedyMovies("Hang-Over",2009,123,"Todd Phillips");
        Movies tollyComedyMovie = new TollyComedyMovies("JaathiRathnalu",2021,120,"Anudeep");


        tollyActionMovie.getMovieDetails();
    }
}

