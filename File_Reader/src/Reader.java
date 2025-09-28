import java.io.FileNotFoundException;
import java.io.FileReader; //File reader package
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\Workspace\\Java\\Learning\\Java\\File_Reader\\example.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int data = 0;
        try {
            data = fr.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Read and print each character
        while (data != -1) {
            System.out.print((char) data);
            try {
                data = fr.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            fr.close(); //Close the file to release resources
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
