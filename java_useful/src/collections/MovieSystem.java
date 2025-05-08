package collections;

import java.util.ArrayList;

public class MovieSystem {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList();
        movies.add(new Movie("범죄도시4",5));
        movies.add(new Movie("기생충",5));
        movies.add(new Movie("올드보이",4));
        movies.add(new Movie("귀궁",3));
        movies.add(new Movie("최악의악",3));
        for (int i =0;i<movies.size();i++){
            System.out.println(movies.get(i).getTitle());
        }

        
    }
}

class Movie {
    private String title;
    private int rating;

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}