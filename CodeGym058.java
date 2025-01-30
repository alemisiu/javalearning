public class CodeGym058 {

    public static void main(String[] args) {
        printIdea(new Idea());
    }
    public static void printIdea(Idea idea){
        System.out.println(idea.getOpis());
    }

    //tutaj wpisz swój kod
    public static class Idea {
        public String getOpis() {
            return "To jest opis.";
        }
}
}

