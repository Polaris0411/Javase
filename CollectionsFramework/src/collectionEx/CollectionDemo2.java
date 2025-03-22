package collectionEx;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        // 1.创建集合的对象
        Collection<Student> coll = new ArrayList<>();

        // 2.创建三个学生对象
        Student t1 = new Student("张三",23);
        Student t2 = new Student("李四",24);
        Student t3 = new Student("王五",25);

        // 3.把学生对象添加到集合中
        coll.add(t1);
        coll.add(t2);
        coll.add(t3);

        // 4.判断集合中某一个学生对象是否包含
        Student t4 = new Student("张三",23);
        // 如果同姓名和同年龄，就认定为是同一个学生
        // 因为contains方法在底层依赖equals方法判断对象是否一致的
        // 如果存的是自定义方法，没有重写equals方法，那么默认使用object类中的equals方法进行判断，而object类中equals方法，依赖地址值进行判断。
        // 需求：如果同姓名和同年龄，就认为是同一个学生。
        // 所以，需要在自定义的javabean类中，重写equals方法就可以了
        System.out.println(coll.contains(t4)); // true


    }
}
