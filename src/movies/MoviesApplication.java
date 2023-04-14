package movies;
import util.Input;

public class MoviesApplication {

    public static void doExercise() {
        Input inputter = new Input();
        boolean userContinue = true;
        int userChoice;
        MoviesArray moviesArray = new MoviesArray();
        Movie[] movieList;
        do{
            movieList = moviesArray.getMovieList();
            System.out.println("""
                    0 - exit
                    1 - view all movies
                    2 - view movies in the animated category
                    3 - view movies in the drama category
                    4 - view movies in the horror category
                    5 - view movies in the scifi category
                    6 - add a movie to the list
                    """);
            userChoice = inputter.getInt(0, 6, "Enter your choice: ");
            switch (userChoice) {
                case 0:
                    userContinue = false;
                    break;
                case 1:
                    printMovies(movieList);
                    break;
                case 2:
                    printMovies(movieList, "animated");
                    break;
                case 3:
                    printMovies(movieList, "drama");
                    break;
                case 4:
                    printMovies(movieList, "horror");
                    break;
                case 5:
                    printMovies(movieList, "scifi");
                    break;
                case 6:
                    addMovie(moviesArray, inputter);
                    break;
                default:
                    break;
            }
        } while(userContinue);
    }

    public static void printMovies(Movie[] movieList, String category) {
        for(Movie movie : movieList) {
            if(movie.getCategory().equals(category)){
                System.out.printf("%50s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
        System.out.printf("%n------------------------------------------------------------------------------------------------------------------------%n");
    }

    public static void printMovies(Movie[] movieList) {
        for(Movie movie : movieList) {
            System.out.printf("%50s -- %s%n", movie.getName(), movie.getCategory());
        }
        System.out.printf("%n------------------------------------------------------------------------------------------------------------------------%n");
    }

    public static void addMovie(MoviesArray moviesArray, Input inputter) {
        Movie userMovie = new Movie();
        userMovie.setName(inputter.getString("Enter the name of your movie: "));
        userMovie.setCategory(inputter.getString("Enter the category of your movie: "));
        moviesArray.addMovie(userMovie);
    }

    public static void main(String[] args) {
        doExercise();
    }
}
