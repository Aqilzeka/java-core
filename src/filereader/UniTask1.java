package filereader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class UniTask1 {

    private static final String FILE_NAME = "mymoviedb.csv";


    public static void main(String[] args) {

        //Uncomment edib test ede bilersiz

//        fillEntity().forEach(System.out::println);

        // Field adlai yanliz
//        Objects.requireNonNull(fillEntity("Popularity")).forEach(System.out::println);
//        fillEntity(22,44).forEach(System.out::println);

    }

    public static List<Movie> fillEntity() {
        return readMovieFromCSV(FILE_NAME);
    }

    public static Stream<Object> fillEntity(String fieldName) {
        List<Movie> movies = readMovieFromCSV(FILE_NAME);

        switch (fieldName) {
            case "Release_Date":
                return movies.parallelStream().map(Movie::getReleaseDate);
            case "Title":
                return movies.parallelStream().map(Movie::getTitle);
            case "Overview":
                return movies.parallelStream().map(Movie::getOverview);
            case "Popularity":
                return movies.parallelStream().map(Movie::getPopularity);
            case "Vote_Count":
                return movies.parallelStream().map(Movie::getVoteCount);
            case "Vote_Average":
                return movies.parallelStream().map(Movie::getVoteAverage);
            case "Original_Language":
                return movies.parallelStream().map(Movie::getOriginalLanguage);
            case "Genre":
                return movies.parallelStream().map(Movie::getGenre);
            case "Poster_Url":
                return movies.parallelStream().map(Movie::getPosterUrl);
            default:
                return null;
        }
    }

    public static List<Movie> fillEntity(int startRow, int endRow) {
        return readMovieFromCSV(FILE_NAME).subList(startRow, endRow);
    }

    private static List<Movie> readMovieFromCSV(String fileName) {
        List<Movie> movies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine();
            String line = br.readLine();

            while (line != null) {

                String[] attributes = split(line);
                Movie movie = createMovie(attributes);
                movies.add(movie);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return movies;
    }

    private static String[] split(String sentence) {
        String[] splitWords = new String[15];
        int count = 0;
        int firstIndex = 0;

        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ',' && sentence.charAt(i + 1) != ' ') {
                String substring = sentence.substring(firstIndex, i);
                firstIndex = i + 1;
                splitWords[count] = substring;
                count++;
            }
        }
        splitWords[count] = sentence.substring(firstIndex);

        return splitWords;
    }

    private static Movie createMovie(String[] metadata) {
        String releaseDate = metadata[0];
        String title = metadata[1];
        String overview = metadata[2];
        String popularity = metadata[3];
        String voteCount = metadata[4];
        String voteAverage = metadata[5];
        String originalLanguage = metadata[6];
        String genre = metadata[7];
        String posterUrl = metadata[8];

        return new Movie(releaseDate, title, overview, popularity, voteCount,
                voteAverage, originalLanguage, genre, posterUrl);
    }

}

