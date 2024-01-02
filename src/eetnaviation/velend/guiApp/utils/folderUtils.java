package eetnaviation.velend.guiApp.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class folderUtils {
    public static void DeleteFolder(String inputPath) {
        Path dir = Paths.get(inputPath); //path to the directory
        try {
            Files
                    .walk(dir) // Traverse the file tree in depth-first order
                    .sorted(Comparator.reverseOrder())
                    .forEach(path -> {
                        try {
                            System.out.println("Deleting: " + path);
                            Files.delete(path);  //delete each file or directory
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void CreateFolder(String directory) {
        System.out.println("Creating: " + directory);
        new File(directory).mkdirs();
    }
}
