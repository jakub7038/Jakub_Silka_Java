import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        obiekt[] tab = new obiekt[]{
                new obiekt(1),
                new obiekt(2),
                new obiekt(3),
                new obiekt(4),
                new obiekt(5),
                new obiekt(6)
        };

        List<obiekt> list = Arrays.asList(tab);
        List<obiekt> arraylist = new ArrayList<>(list);
        List<obiekt> sublist = list.subList(2, 4);
        arraylist.removeAll(sublist);

        System.out.println(sublist);
        System.out.println(list);
        System.out.println(arraylist);
    }
}