package Iterator;

public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < movies.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Больше никаких фильмов для итерации.");
        }
        return movies[position++];
    }
}
