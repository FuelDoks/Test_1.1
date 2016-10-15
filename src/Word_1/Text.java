package Word_1;

/**
 * Created by Dick_in_your_hand on 14.10.2016.
 */
import java.io.*;
public class Text {

    public static void main(String args[])  throws IOException {
        FileInputStream in  = null;
        FileOutputStream   out = null;


        
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c =in.read())   !=  -1) {
                out.write(c);
            }
        }finally {
            if (in  !=null) {
                in.close();
            }
            if (out !=null) {
                out.close();
            }
        }

    }

}
