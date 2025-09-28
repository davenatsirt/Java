import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader object
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\Workspace\\Java\\Learning\\Java\\Buffered_Reader\\example.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String line;
        // User .readline() to read the file line by line
        while ((line = br.readLine())!=null){
            // Prints each line and keeps blank lines
            System.out.println(line);
            // Prints in a sentence form and remove unnecessary line breaks
            //System.out.print(line);
        }

        br.close();
    }
}

