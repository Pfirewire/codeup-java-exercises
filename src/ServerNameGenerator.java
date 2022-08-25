import java.util.Arrays;


public class ServerNameGenerator {
    public String[] adjectives;
    public String[] nouns;

    public ServerNameGenerator() {
        adjectives = new String[]{"confused", "easy", "smoggy", "zany", "lonely", "fierce", "distinct", "amused", "bright", "prickly"};
        nouns = new String[]{"branch", "jelly", "rainbow", "tomato", "match", "dinner", "ocean", "eye", "scooter", "advertisement"};
    }

    public ServerNameGenerator(String[] adjectives, String[] nouns) {
        this.adjectives = adjectives;
        this.nouns = nouns;
    }

    public static String randomElement(String[] array) {
        return array[(int) (Math.random() * (array.length - 1))];
    }

    public static void main(String[] args) {
        ServerNameGenerator server = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s%n", server.randomElement(server.adjectives), server.randomElement(server.nouns));

    }
}
