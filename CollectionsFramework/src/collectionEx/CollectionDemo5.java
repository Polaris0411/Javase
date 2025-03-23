package collectionEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo5 {

    public static void main(String[] args) {

        // 1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");
        coll.add("D");

        // 2.获取迭代器对象
        // 迭代器就好比是一个箭头，默认指向集合的开始位置，即第一个元素之前
        Iterator<String> it = coll.iterator();
        // 3.利用循环不断的去获取集合中的每一个元素
        while (it.hasNext()) {
            // 4.next方法的两件事情：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }

        // 当上面循环结束之后，迭代器的指针已经指向了最后没有元素的位置


    }
}
