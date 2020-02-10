import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sandbox {
    public static void main(String[] args) {
        newFile();
    }

    static void newFile() {
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        System.out.println(dataDirectory.toAbsolutePath());
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
                System.out.println("Created Directory");
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
                System.out.println("Created File");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
