package collectionEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {

    public static void main(String[] args) {

        // 注意点：
        // 1.报错NoSuchElementException
        // 2.迭代器遍历完毕，指针不会复位 想再遍历一遍只能重新创建一个迭代器
        // 3.循环中只能用一次next方法
        // 4.迭代器遍历时，不能用集合的方法进行增加或删除(暂时当做结论先行记忆)
        // 实在要删除，可以用迭代器的remove方法，没法增加

        Collection<String> coll = new ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");
        coll.add("D");
        coll.add("E");

        // 2.获取迭代器对象
        // 迭代器就好比是一个箭头，默认指向集合的开始位置，即第一个元素之前
        Iterator<String> it = coll.iterator();
        // 3.利用循环不断的去获取集合中的每一个元素
        while (it.hasNext()) {
            // 4.next方法的两件事情：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }

        // 注意点1：当上面的循环结束之后，迭代器的指针已经指向了最后没有元素的位置
//        System.out.println(it.next()); //NoSuchElementException

        // 注意点2：迭代器遍历完毕，指针不会复位
        System.out.println(it.hasNext());
        System.out.println(it.hasNext());
        System.out.println(it.hasNext());
        System.out.println(it.hasNext());

        // 要继续第二次遍历集合，只能再次获取新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()) {
            // 注意点3：循环中只能用一次next方法
            String str = it2.next();
            System.out.println(str);
//            System.out.println(it2.next()); // A C E
//            System.out.println(it2.next()); // B D 报错

            // 注意点4：迭代器遍历时，不能用集合的方法进行增加或删除
            if ("B".equals(str)) {
//                coll.remove("B");
                it2.remove();
            }
        }
        System.out.println(coll);
    }
}
