package UserValidatorHomeW2;

public class MovieCreator {
    private static String defaultTitle;
    private static String defaultDirector;
    private static int defaultYearOfRelease;
    private static String defaultGenre;
    private static String defaultDistributor;

    public static Movie creatorMovie() {
        Movie   movie = new Movie();
        movie.setTitle(defaultTitle);
        movie.setDirector(defaultDirector);
        movie.setYearOfRealse(defaultYearOfRelease);
        movie.setGenre(defaultGenre);
        movie.setDistributor(defaultDistributor);
        return movie;

    }

    public static void setDefaultTitle(String defaultTitle) {
        MovieCreator.defaultGenre = defaultTitle;

    }

    public static void setDefaultDirector(String defaultDirector){
        MovieCreator.defaultDirector = defaultDirector;

    }

    public static void setDefaultYearOfRelease(int defaultYearOfRelease){
        MovieCreator.defaultYearOfRelease = defaultYearOfRelease;
    }

    public static void setDefaultGenre(String defaultGenre) {
        MovieCreator.defaultGenre = defaultGenre;
    }
    public static void setDefaultDistributor(String defaultDistributor){
        MovieCreator.defaultDistributor = defaultDistributor;
    }
}
