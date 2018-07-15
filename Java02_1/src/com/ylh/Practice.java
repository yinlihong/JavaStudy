package com.ylh;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.awt.SunHints;

import java.nio.charset.Charset;
import java.security.Key;
import java.util.*;

/**
 * Created By yinlihong on 2018/7/14 15:57.
 */
public class Practice {
    public static void main(String[] args) {
        //UseRandom();
        //LongestWord();
        //Array();
        //NoRepeat();
        //PlayCards();
        playPoker();
    }

    /**
     * 1.定义一个方法，实现传入a,b,n得到n个a,b范围内的随机数
     */
    public static void UseRandom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入范围的最小值:");
        int a = scanner.nextInt();
        System.out.println("请输入范围的最大值:");
        int b = scanner.nextInt();
        System.out.println("请输入随机数的个数:");
        int n = scanner.nextInt();
        Random(a, b, n);

    }

    public static void Random(int a, int b, int n) {
        int[] rand = new int[n];
        for (int i = 0; i < n; i++) {
            rand[i] = (int) (Math.random() * (b - a) + a);
            System.out.print(rand[i] + " ");
        }
    }

    /**
     * 2.在一个已知的字符串中找最长单词，假定字符串中只含字母和空格，空格用来分隔不同单词
     */
    public static void LongestWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int maxlen = 0;
        String max = null;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].length() > maxlen) {
                maxlen = s1[i].length();
                max = s1[i];
            }
        }
        System.out.println("最长单词为:" + max);
    }

    /**
     * 3.控制台输入一个整数代表数组容量，并提示用户逐个输入元素存入数组
     * 请输入数组的容量:n
     * 请输入n个数组元素值
     * 您输入的数组为：
     */
    public static void Array() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组容量:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入n个数组元素的值:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("您输入的数组为:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    /**
     * 4.使用Scanner从键盘读取一行输入aaaabbbcccddd,去掉其中重复字符，打印出不同的那些字符，
     * 使用list集合保存无重复的结果
     */
    public static void NoRepeat() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        //Set 无重复无序 能自动判断是否已有重复元素 boolean add(E e)
        // 如果 set 中尚未存在指定的元素，则添加此元素（可选操作）。
        // 更确切地讲，如果此 set 没有包含满足 (e==null ? e2==null : e.equals(e2)) 的元素 e2，则向该 set 中添加指定的元素 e。
        // 如果此 set 已经包含该元素，则该调用不改变此 set 并返回 false。
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));//s.charAt(i)可以理解为s[i]但不能写成s[i]
        }
        List<Character> list = new LinkedList<>();
        list.addAll(characters);
        System.out.println(list);
    }

    /**
     * 5.Map练习
     * 统计字符串"abcdabcdabcdaaaddd"中每个字符出现的次数
     * 控制台打印结果
     * a出现5次
     * b出现3次
     * c出现3次
     * d出现5次
     */
    public static void charCount() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }

    /**
     * 模拟斗地主发牌
     */
    public static void PlayCards() {
        Map<Integer, LinkedList<String>> map = new HashMap<>();
        map.put(0, new LinkedList<>());
        map.put(1, new LinkedList<>());
        map.put(2, new LinkedList<>());
        map.put(3, new LinkedList<>());
        String[] cards = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "大王", "小王"};
        String[] arr = {"♥", "♠", "♦", "♣"};
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; (i < cards.length - 2 && j < 4) || (i < cards.length && j < 1); j++) {
                while (true) {
                    int key = (int) (Math.random() * 4);
                    LinkedList<String> linkedList = map.get(key);
                    if (key < 3 && linkedList.size() < 17) {
                        linkedList.addLast(i > 12 ? cards[i] : arr[j] + cards[i]);
                        map.put(key, linkedList);
                        break;
                    } else if (key == 3 && linkedList.size() < 3) {
                        linkedList.addLast(i > 12 ? cards[i] : arr[j] + cards[i]);
                        map.put(key, linkedList);
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
        for (LinkedList list : map.values()) {
            System.out.println(list);
        }
    }

    public static void playPoker() {
        //存放扑克的map key是下标 value是牌面
        Map<Integer, String> poker = new HashMap<>();
        //使用LinkedList存储下标
        LinkedList<Integer> indexList = new LinkedList<>();
        String[] str1 = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] str2 = {"♥", "♠", "♦", "♣"};
        int index = 0;//下标
        for(String s:str1){
            for(String s1:str2){
                String s3 = s1 + s;
                System.out.println(s3);
                poker.put(index,s3);
                indexList.add(index);
                index++;
            }
        }
        poker.put(index,"小王");
        indexList.add(index);
        index++;
        poker.put(index,"大王");
        indexList.add(index);
        System.out.println(poker);
        //创建三个人和底牌
        TreeSet<Integer> wang = new TreeSet<>();
        TreeSet<Integer> yin = new TreeSet<>();
        TreeSet<Integer> li = new TreeSet<>();
        TreeSet<Integer> diPai = new TreeSet<>();
        //洗牌 主要是将下标顺序打乱
        Collections.shuffle(indexList);
        //发牌 遍历打乱后的下标集合
        for (int i = 0; i < 17; i++) {
            wang.add(indexList.removeLast());
            yin.add(indexList.removeLast());
            li.add(indexList.removeLast());
        }
        //添加底牌
        diPai.addAll(indexList);
        showPoker(poker,"王",wang);
        showPoker(poker,"阴",yin);
        showPoker(poker,"李",li);
        showPoker(poker,"底牌",diPai);
    }
    //定义一个方法专门用来看牌
    public static void showPoker(Map<Integer,String> poker,String name,TreeSet<Integer>treeSet){
        System.out.println(name+"的牌是");
        for(Integer key:treeSet){
            String s = poker.get(key);
            System.out.print(s+" ");
        }
        System.out.println();
    }
}



