import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Integer> set1 = new TreeSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        System.out.println(symmetricDifference(set,set1));


    }
    public static Set<Integer> symmetricDifference(Set<Integer> set, Set<Integer> set1){
        Set<Integer> set2 = new TreeSet<>();
        for (Integer integer : set) {
            for (Integer integer1 : set1) {
                if(!set.contains(integer1)){
                    set2.add(integer1);
                } else if (!set1.contains(integer)) {
                    set2.add(integer);

                }

            }

        } return set2;


    }
}