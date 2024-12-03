package com.example;

public class App {

    public static final MediaPlayerProxy MediaPlayerProxy = new MediaPlayerProxy();
    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        MediaPlayerProxy.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        MediaPlayerProxy.playMedia();
    }

}
