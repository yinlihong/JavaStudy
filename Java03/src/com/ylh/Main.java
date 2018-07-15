package com.ylh;
import java.util.*;
/**
 * 集合框架
 */
public class Main {
    public static void main(String[] args) {
	// write your code here
        //collection();
        //listUse();
        //set();
        //map();
        entrySet();
    }
    public static void collection (){
        //定义一个Collection集合
        Collection collection = new ArrayList();
        collection.add("张三");
        collection.add(20);
        collection.add("男");
        collection.remove(20);
        System.out.println(collection);//打印出带中括号的
        if(collection.isEmpty()){
            System.out.println("为空");
        }
        //输出集合大小
        System.out.println(collection.size());
        Collection collection1 = new ArrayList();
        //添加一个集合
        collection1.addAll(collection);//addAll 一个集合[]
        System.out.println(collection1);
        Collection collection2 = new ArrayList();
        collection2.add(collection);//add集合套集合[[]]
        System.out.println(collection2);
    }
    public static void iterator (){
        Collection collection = new ArrayList();
        //自动装箱 int - > Integer
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);//存的类型最好是一样的
        //集合iterator()方法获取迭代器
        //泛型<>又叫类型的参数，让类型参数化
        Iterator<Integer> iterator = collection.iterator();
        //iterator.hasNext();是否有当前对象
        //iterator.next();
        while (iterator.hasNext()){
            //获取集合中的元素
            //Integer integer = (Integer)iterator.next();//类型强转
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }
    public static void fX (){
        Collection<String> collection = new ArrayList<>();
        collection.add("123");//只能添加字符串
        Student<Integer> student = new Student<>();
        student.setName("张三");
        student.setT(23);
        student.show(45);
    }
    public static void listUse (){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //获取
        String s = list.get(1);
        System.out.println(s);
        //修改
        String s1 = list.set(1,"李四");//set返回修改之前的
        System.out.println(s1);
        //fori循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //增强for循环 foreach 左边变量 右边集合
        for (String s2:list){
            System.out.println(s2);
        }
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s2 = iterator.next();
            System.out.println(s2);
        }
    }
    public static void linkList (){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.addFirst("2");
        linkedList.addLast("3");
        //删除最后一个对象，并获得最后对象
        String s = linkedList.removeLast();
        System.out.println(s);
    }
    public static void set (){
        Set<String> set = new HashSet<>();
        set.add("c");
        set.add("d");
        set.add("g");
        set.add("a");
        set.add("h");
        set.add("e");
        set.add("a");
        set.add("z");
        System.out.println(set);//去重
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(11);
        treeSet.add(21);
        treeSet.add(14);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(2);
        System.out.println(treeSet);//有序
    }
    public static void map (){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王");
        map.put(4,"阴");
        System.out.println(map);//{key=value}
        //变量map
        //获取map的所有key集合，set集合
        Set<Integer> set = map.keySet();//keySet()获取map中的所有key
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            //获取key
            Integer key = iterator.next();
            //根据key获取value
            String value = map.get(key);
            System.out.println("key="+key);
            System.out.println("value="+value);

        }
    }
    public static void entrySet (){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王");
        map.put(4,"阴");
        //map内部接口Map.Entry实体，包含key,value
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        //获取迭代器
        Iterator<Map.Entry<Integer,String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            //获取每个实体
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println("key="+entry.getKey());
            System.out.println("value="+entry.getValue());
        }
    }
}
