import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOPractice {

    public static List<String> readLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeLines(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteEntry(Path path, String name) {
        List<String> names = readLines(path);
        names.remove(name);
        writeLines(path, names);
    }

    public static void seeWhoWorksAtCodeup(List<String> list) {
        for(String name : list) {
            System.out.printf("%s works at Codeup%n", name);
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Path path = Paths.get("fileIO", "people.txt");

        // Read and sout names
        seeWhoWorksAtCodeup(readLines(path));

        // Write over names then sout them
        writeLines(path, Arrays.asList("Naz", "Aaron", "Frances", "Deshawn"));
        seeWhoWorksAtCodeup(readLines(path));

        // Delete deshawn then sout remaining names
        deleteEntry(path, "Deshawn");
        seeWhoWorksAtCodeup(readLines(path));
    }
}
