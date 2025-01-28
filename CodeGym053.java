public class CodeGym053 {
    

        public static int plus(int a, int b) {
            //tutaj wpisz swój kod
            return a +b ;
        }
        public static int minus(int a , int b){
            return a - b;
        }
        public static int multiply(int a, int b){
            return a * b;
        }
        public static double divide(int a, int b){
            if (b ==0){
                throw new IllegalArgumentException("Nie można dzielić przez zero");
                
            }
            return (double) a / b;
        }   
        public static double percent(int a, int b){
            return (double) a * b / 100;
        }
    
        public static void main(String[] args) {
    
        }
    }
