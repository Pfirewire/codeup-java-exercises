package movies;

public class MoviesArray {
    private Movie[] movieList;

    public MoviesArray(){
        movieList = new Movie[]{
                new Movie("Citizen Kane", "drama"),
                new Movie("Casablanca", "drama"),
                new Movie("The Godfather", "drama"),
                new Movie("Gone With The Wind", "drama"),
                new Movie("Lawrence Of Arabia", "drama"),
                new Movie("The Wizard Of Oz", "musical"),
                new Movie("The Graduate", "drama"),
                new Movie("On The Waterfront", "drama"),
                new Movie("Schindler's List", "drama"),
                new Movie("Singin' In The Rain", "musical"),
                new Movie("It's A Wonderful Life", "drama"),
                new Movie("Sunset Boulevard", "drama"),
                new Movie("The Bridge On The River Kwai", "drama"),
                new Movie("Some Like It Hot", "drama"),
                new Movie("Star Wars", "scifi"),
                new Movie("All About Eve", "drama"),
                new Movie("The African Queen", "drama"),
                new Movie("Psycho" , "horror"),
                new Movie("Chinatown", "drama"),
                new Movie("One Flew Over The Cuckoo's Nest", "drama"),
                new Movie("The Grapes Of Wrath", "drama"),
                new Movie("2001: A Space Odyssey", "scifi"),
                new Movie("The Maltese Falcon", "drama"),
                new Movie("Raging Bull", "drama"),
                new Movie("E.T. The extra-terrestrial", "scifi"),
                new Movie("Dr. Strangelove", "drama"),
                new Movie("Bonnie And Clyde", "drama"),
                new Movie("Apocalypse Now", "drama"),
                new Movie("Mr. Smith Goes to Washington", "drama"),
                new Movie("The Treasure Of The Sierra Madre", "drama"),
                new Movie("Annie Hall", "comedy"),
                new Movie("The Godfather Part II", "drama"),
                new Movie("High Noon", "drama"),
                new Movie("To Kill A Mockingbird", "drama"),
                new Movie("It Happened One Night", "drama"),
                new Movie("Midnight Cowboy", "drama"),
                new Movie("The Best Years Of Our Lives", "drama"),
                new Movie("Double Indemnity", "drama"),
                new Movie("Doctor Zhivago", "drama"),
                new Movie("North By Northwest", "drama"),
                new Movie("West Side Story", "musical"),
                new Movie("Rear Window", "drama"),
                new Movie("King Kong", "horror"),
                new Movie("The Birth Of A Nation", "drama"),
                new Movie("A Streetcar Named Desire", "drama"),
                new Movie("A Clockwork Orange", "scifi"),
                new Movie("Taxi Driver", "drama"),
                new Movie("Jaws", "horror"),
                new Movie("Snow White And The Seven Dwarfs", "animated"),
                new Movie("Butch Cassidy And The Sundance Kid", "drama"),
                new Movie("The Philadelphia Story", "drama"),
                new Movie("From Here To Eternity", "drama"),
                new Movie("Amadeus", "drama"),
                new Movie("All Quiet On The Western Front", "drama"),
                new Movie("The Sound Of Music", "musical"),
                new Movie("M*A*S*H", "comedy"),
                new Movie("The Third Man", "drama"),
                new Movie("Fantasia", "animated"),
                new Movie("Rebel Without A Cause", "drama"),
                new Movie("Raiders Of The Lost Ark", "drama"),
                new Movie("Vertigo", "drama"),
                new Movie("Tootsie", "comedy"),
                new Movie("Stagecoach", "drama"),
                new Movie("Close Encounters Of The Third Kind", "scifi"),
                new Movie("The Silence Of The Lambs", "horror"),
                new Movie("Network", "drama"),
                new Movie("The Manchurian Candidate", "drama"),
                new Movie("An American In Paris", "drama"),
                new Movie("Shane", "drama"),
                new Movie("The French Connection", "drama"),
                new Movie("Forrest Gump", "drama"),
                new Movie("Ben-Hur", "drama"),
                new Movie("Wuthering Heights", "drama"),
                new Movie("The Gold Rush", "drama"),
                new Movie("Dances With Wolves", "drama"),
                new Movie("City Lights", "drama"),
                new Movie("American Graffiti", "drama"),
                new Movie("Rocky", "drama"),
                new Movie("The Deer Hunter", "drama"),
                new Movie("The Wild Bunch", "drama"),
                new Movie("Modern Times", "drama"),
                new Movie("Giant", "drama"),
                new Movie("Platoon", "drama"),
                new Movie("Fargo", "drama"),
                new Movie("Duck Soup", "comedy"),
                new Movie("Mutiny On The Bounty", "drama"),
                new Movie("Frankenstein", "horror"),
                new Movie("Easy Rider", "drama"),
                new Movie("Patton", "drama"),
                new Movie("The Jazz Singer", "drama"),
                new Movie("My Fair Lady", "musical"),
                new Movie("A Place In The Sun", "drama"),
                new Movie("The Apartment", "drama"),
                new Movie("Goodfellas", "drama"),
                new Movie("Pulp Fiction", "drama"),
                new Movie("The Searchers", "drama"),
                new Movie("Bringing Up Baby", "drama"),
                new Movie("Unforgiven", "drama"),
                new Movie("Guess Who's Coming To Dinner", "drama"),
                new Movie("Yankee Doodle Dandy", "musical")
        };
    }

    public MoviesArray(Movie[] movieList) {
        this.movieList = movieList;
    }

    public Movie[] getMovieList() {
        return movieList;
    }

    public void setMovieList(Movie[] movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie movie) {
        Movie[] newMovieList = new Movie[movieList.length + 1];
        for(int i = 0; i < movieList.length; i++) {
            newMovieList[i] = movieList[i];
        }
        newMovieList[newMovieList.length - 1] = movie;
        movieList = newMovieList;
    }

}
