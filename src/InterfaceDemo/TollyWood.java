package InterfaceDemo;
public abstract class TollyWood implements Movies {
        private final String section = "Tollywood";

        @Override
        public void getMovieDetails() {
                System.out.println("Movie Section: " + section);
        }
}