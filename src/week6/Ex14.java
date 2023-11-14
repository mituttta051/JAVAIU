package week6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex14 {
    public static void main(String[] args) throws IOException {
        File a = new File("C:/Users/amity/JAVAIU/src/week6/input.txt");
        File b= new File("output.txt");
        b.createNewFile();
//        FileInputStream a = new FileInputStream(inp);
//        FileOutputStream a = new FileOutputStream(out);
        byte[] buffer = new byte[1024];
        int bytesRead;
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);
            try {
                int n;
                // read() function to read the
                // byte of data
                while ((n = in.read()) != -1) {
                    // write() function to write
                    // the byte of data
                    out.write(n);
                }
            }
            finally {
                if (in != null) {

                    // close() function to close the
                    // stream
                    in.close();
                }
                // close() function to close
                // the stream
                if (out != null) {
                    out.close();
                }
            }

    }
}
