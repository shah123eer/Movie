import java.util.ArrayList;

class Movie {
    private String title;
    private int year;
    private String genre;
    private int rating;

    public Movie(String title, int year, String genre, int rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("M1", 2024, "Comedy", 67));
        movies.add(new Movie("M2", 2021, "Horror", 91));
        movies.add(new Movie("M3", 2023, "Si-fi", 99));

        System.out.println(movies.isEmpty());
        System.out.println();
        for (Movie temp : movies) {
            System.out.println(temp);
        }
        for (Movie temp : movies) {
            temp.setRating(temp.getRating() + 1);
        }
        System.out.println();
        for (Movie temp : movies) {
            System.out.println(temp);
        }
    }
}