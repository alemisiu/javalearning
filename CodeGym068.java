import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeGym068 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        

        int[] tablica = new int[15];
        for (int i = 0; i < 15; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }
        int sumaNieparzyste= 0;
        int sumaParzyste = 0;


        for(int i = 0; i<15;i++){
            if(i % 2 == 0){
                sumaParzyste += tablica[i];
        }else{
            sumaNieparzyste += tablica[i];
        }
    }
    if(sumaParzyste > sumaNieparzyste){
        System.out.println("Więcej ludzi mieszka w domach o parzystych numerach");
}else if(sumaNieparzyste > sumaParzyste){
    System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach");
}
}
}