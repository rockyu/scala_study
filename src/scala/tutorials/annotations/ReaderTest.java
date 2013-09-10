package scala.tutorials.annotations;

public class ReaderTest {

    public static void main(String[] args) {
        try {
            Reader in = new Reader(args[0]);
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
