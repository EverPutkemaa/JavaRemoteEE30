package UserValidatorHomeW2;

public class Movie {
    private String title;
    private String director;
    private int yearOfRealse;
    private String genre;
    private String distributor;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfRealse() {
        return yearOfRealse;
    }

    public void setYearOfRealse(int yearOfRealse) {
        this.yearOfRealse = yearOfRealse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRealse=" + yearOfRealse +
                ", genre='" + genre + '\'' +
                ", distributor='" + distributor + '\'' +
                '}';
    }
}

