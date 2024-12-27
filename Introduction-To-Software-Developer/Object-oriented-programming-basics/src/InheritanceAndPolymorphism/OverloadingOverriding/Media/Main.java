package InheritanceAndPolymorphism.OverloadingOverriding.Media;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Hujan", "TereLiye", 356);
        Movie movie = new Movie("Inception", "Christopher Nolan", 148);
        Music music = new Music("Hypeboy", "Newjeans", "pop");

        MediaLibrary mediaLibrary = new MediaLibrary();
        Media addedBook = mediaLibrary.addMedia(book);
        Media addedMovie = mediaLibrary.addMedia(movie);
        Media addedMusic = mediaLibrary.addMedia(music);

        mediaLibrary.playMedia(addedBook);
        mediaLibrary.playMedia(addedMovie);
        mediaLibrary.playMedia(addedMusic);

    }
}
