package Iterator;

import java.util.List;

public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;
    private int position;

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < movies.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Больше никаких фильмов для итерации.");
        }
        return movies.get(position++);
    }
}
