package filereader;

//Release_Date,Title,Overview,Popularity,Vote_Count,Vote_Average,Original_Language,Genre,Poster_Url
public class Movie {
    private String releaseDate;
    private String title;
    private String overview;
    private String popularity;
    private String voteCount;
    private String voteAverage;
    private String originalLanguage;
    private String genre;
    private String posterUrl;

    public Movie(String releaseDate, String title, String overview, String popularity, String voteCount, String voteAverage, String originalLanguage, String genre, String posterUrl) {
        this.releaseDate = releaseDate;
        this.title = title;
        this.overview = overview;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
        this.originalLanguage = originalLanguage;
        this.genre = genre;
        this.posterUrl = posterUrl;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getGenre() {
        return genre;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "releaseDate='" + releaseDate + '\'' +
                ", title='" + title + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity='" + popularity + '\'' +
                ", voteCount='" + voteCount + '\'' +
                ", voteAverage='" + voteAverage + '\'' +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", genre='" + genre + '\'' +
                ", posterUrl='" + posterUrl + '\'' +
                '}';
    }
}
