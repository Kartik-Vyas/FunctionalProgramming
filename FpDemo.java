import java.util.ArrayList;
import java.util.List;

public class FpDemo {
    public static void main(String[] args) {
        List<String> s = List.of("apple","ball","cat","dog");
        s.stream().forEach(element -> System.out.println(element));
     }
}
