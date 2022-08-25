package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Input inputter = new Input();
        boolean userContinue = true;
        int userChoice;
        MoviesArray moviesArray = new MoviesArray();
        Movie[] movieList;
        do{
            movieList = moviesArray.findAll();
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie to the list\n");
            userChoice = inputter.getInt(0, 6, "Enter your choice: ");
            switch (userChoice) {
                case 0:
                    userContinue = false;
                    break;
                case 1:
                    for(Movie movie : movieList) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                    System.out.printf("%n%n");
                    break;
                case 2:
                    for(Movie movie : movieList) {
                        if(movie.getCategory().equals("animated")){
                            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                        }
                    }
                    System.out.printf("%n%n");
                    break;
                case 3:
                    for(Movie movie : movieList) {
                        if(movie.getCategory().equals("drama")){
                            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                        }
                    }
                    System.out.printf("%n%n");
                    break;
                case 4:
                    for(Movie movie : movieList) {
                        if(movie.getCategory().equals("horror")){
                            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                        }
                    }
                    System.out.printf("%n%n");
                    break;
                case 5:
                    for(Movie movie : movieList) {
                        if(movie.getCategory().equals("scifi")){
                            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                        }
                    }
                    System.out.printf("%n%n");
                    break;
                case 6:
                    Movie userMovie = new Movie();
                    userMovie.setName(inputter.getString("Enter the name of your movie: "));
                    userMovie.setCategory(inputter.getString("Enter the category of your movie: "));
                    moviesArray.addMovie(userMovie);
                default:
                    break;
            }
        } while(userContinue);
    }
}
