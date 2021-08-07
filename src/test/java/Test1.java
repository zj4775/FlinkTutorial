import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * description :
 *
 * @author : jie
 * @date : 2021/7/11 5:16 下午
 */
public class Test1 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);


        list.stream().forEach(e-> System.out.println(e));

        System.out.println("\n\n\n");
        Collections.shuffle(list);

        list.stream().forEach(e-> System.out.println(e));


    }
}
