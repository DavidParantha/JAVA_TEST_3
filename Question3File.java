package dev.underthis.Abstraction.test3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class Question3File {
    public static void main(String... args) {
        File paths = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);
        File path = new File(FilePaths.SAMPLE_FOLDER_ABSOLUTE_PATH);
        String msg = """
                Today I started learning Java File I/O.
                It was a bit confusing, but I'm getting the hang of it.
                I successfully created and copied a file!
                """;
        if (path.exists() && path.isFile()) {
            System.out.println("File appended successfully");
            try (FileOutputStream fos = new FileOutputStream(path, true);) {//append = true means
                fos.write(msg.getBytes());
            } catch (IOException e) {
            
                throw new RuntimeException(e);
            }
        }
        else {
            System.out.println("File doesnt exist");
        }


    }

}
