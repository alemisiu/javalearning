import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lista {
    public static void main(String[] args) {
        var myList = Arrays.asList(10, 20, 30);
        var lastElement = myList.getLast();
        System.out.println(myList);
        System.out.println(lastElement);
    }
}
