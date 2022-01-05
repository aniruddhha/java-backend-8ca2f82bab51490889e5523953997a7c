package collections;


import java.util.*;
import java.util.function.Consumer;

public class CollectionDemo {

    public List<String> listDemo() {

        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("pqr");
        names.add("lmn");
        names.add("xyz");
        names.add(null);
        names.add("xyz");

        Consumer<String> cls = new Consumer<String>() { // anonymous inner class -> traditional approach
            @Override
            public void accept(String s) {
                System.out.println("Name is " + s);
            }
        };
        names.forEach(cls);

        Consumer<String> fn = (String s) -> System.out.println(s); // functional interface -> java8 and above approach
        names.forEach(fn);

        return names;
    }

    public Set<String> setDemo() {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("pqr");
        set.add("lmn");
        set.add("xyz");
        set.add(null);
        set.add("xyz");

        set.forEach( (s) -> System.out.println(s) ); // lambda

        return set;
    }

    public Queue<String> queueDemo() {
        Queue<String> queue = new LinkedList<>();
        queue.add("abc");
        queue.add("pqr");
        queue.add("lmn");
        queue.add(null);
        queue.add("pqr");

        queue.forEach(System.out::println); // method reference

        return queue;
    }

    public static void main(String[] args) {
        CollectionDemo cdm = new CollectionDemo();
//        cdm.listDemo();
//        cdm.setDemo();
        cdm.queueDemo();
    }
}
