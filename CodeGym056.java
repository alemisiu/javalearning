public class CodeGym056 {
    public static int A = 5;
    public int B = 2;
    public static int C = A * new CodeGym056().B;

    public static void main(String[] args) {
        A = 15;
        System.out.println("C: " + C);
    }
}


