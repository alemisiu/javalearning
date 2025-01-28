import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGym051 {
 public static String readString() throws Exception {
    
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(br.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(br.readLine());
    }
}