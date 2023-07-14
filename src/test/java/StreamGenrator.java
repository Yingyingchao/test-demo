import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamGenrator {

    @Test
    public void genrator1(){
        String [] arr = {"莉莉","andi","jack"};
        Stream<String>  stream = Stream.of(arr);
        stream.forEach(s -> System.out.println(s));
    }

    @Test
    public void genrator2(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("123");
        Stream<String> stream = list.stream();
        stream.forEach(a -> System.out.println(a));
    }
}
