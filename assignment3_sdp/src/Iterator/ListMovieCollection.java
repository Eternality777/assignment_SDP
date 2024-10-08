package Iterator;

import java.util.List;

public class ListMovieCollection {
    private List<String> movies;

    public ListMovieCollection(List<String> movies) {
        this.movies = movies;
    }

    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);
    }
}
