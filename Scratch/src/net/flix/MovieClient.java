package net.flix;

class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Titanic");
        movie1.setReleaseYear(1997);  // autoboxing means I can pass int for an Integer
        movie1.setRevenue(750_000_000.0);  // I can pass double for a Double
        movie1.setRating(Rating.PG_13);
        movie1.setGenre(Genre.DRAMA);
        System.out.println(movie1);  // toString() automatically called

        Movie movie2 = new Movie("Mario", 2023, 500_000_000.0, Rating.PG, Genre.ACTION);
        System.out.println(movie2);

        Movie movie3 = new Movie("White Roses", Genre.ROMANCE);
        System.out.println(movie3);
    }
}