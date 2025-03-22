package collectionEx;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

    public static void main(String[] args) {

        // 目的：为了学习Collection接口里的方法
        // 自己做练习按以前方法创建对象
        Collection<String> coll = new ArrayList<>();

        // 1.添加元素
        // 细节1: 如果往List系列集合添加数据，方法永远返回true，因为List系列允许元素重复
        // 细节2：如果往Set系列集合添加数据，如果当前添加元素不存在，方法返回true，如果已存在，返回false，因为Set系列的集合不允许重复
        coll.add("A");
        coll.add("B");
        coll.add("C");
        System.out.println(coll);

        // 2.清空
//        coll.clear();
//        System.out.println(coll);

        // 3.删除
        // 细节1：因为Collection里面定义的共性方法，所以不能通过索引进行删除，只能通过元素的对象进行删除
        // 细节2：方法会有一个布尔类型的返回值，删除成功返回true，删除失败返回false
        // 如果要删除的元素不存在，就会删除失败
        System.out.println(coll.remove("A"));
        System.out.println(coll);

        // 4.判断元素是否包含
        // 细节：底层是依赖equals方法判断是否存在
        // 所以，如果集合中存储的是自定义方法，也想通过contains方法来判断是否包含，在javabean类中，一定要重写equals方法。
        boolean result1 = coll.contains("B");
        System.out.println(result1);

        // 5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2); //false

        // 6.获取集合的长度
        coll.add("D");
        int size = coll.size();
        System.out.println(size);
    }
}
