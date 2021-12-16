import java.io.*;

public class Main {
    public static void main(String[] args) {
        byte[] outData = "Value 1;Value 2;Value 3\n".getBytes();
        byte[] outData2 = "100;200;123\n".getBytes();
        byte[] outData3 = "300;400;500\n".getBytes();
        try (FileOutputStream out = new FileOutputStream("src/test.csv")) {
            out.write(outData);
            out.write(outData2);
            out.write(outData3);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream in = new BufferedInputStream(new FileInputStream("src/test.csv"))) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char)x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
