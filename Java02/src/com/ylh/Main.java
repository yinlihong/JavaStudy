package com.ylh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       //DayOfDate();
        test3();
    }
    public static void Sum(){
        //计算一个数组中所有元素的和
        //定义一个数组
        int[] array = {1,2,4,5,7};
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
    public static void test2(){
        int[] array1 = new int[20];//创建一个具有20个元素的数组
        double sum = 0;
        //随机20个数，范围[30-70)，存入到数组中并计算和
        for (int i = 0; i <20 ; i++) {
            //Math.random()返回的是double类型的值
            array1[i] = (int) (Math.random()*40+30);
            sum += array1[i];
            System.out.println(array1[i]);
        }
        System.out.println("数组元素的和为:"+sum);
    }
    public static void test3(){
        //随机20个数，范围[35-90)，求出数组元素最大值以及它对应的下标
        int[] a = new int[20];
        int max = 34;
        int index = 0;
        for (int i = 0; i <a.length ; i++) {
            a[i] = (int)(Math.random()*55+35);
            System.out.println(a[i]);
            if(a[i] > max){
                max = a[i];
                index = i;
            }
        }
        System.out.println("数组中最大的元素为:"+max);
        System.out.println("它所对应的下标为:"+index);
        bubbleSort(a);
    }
    public static void bubbleSort (int[] arr){
        //对上面的数组进行冒泡升序排序
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       /**
        * 法1
        * int c;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        */

        /**
         * 法二
         */
       int flag = 1;
        for (int i = 0; i < arr.length-1&&flag==1 ; i++) {
            flag = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                int temp = 0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void DayOfDate (){
        //控制台分别输入年份，月份，日期，计算出其为这一年的第几天
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份");
        int year= scanner.nextInt();
        System.out.println("请输入月份");
        int month=scanner.nextInt();
        System.out.println("请输入天数");
        int day=scanner.nextInt();
        int[] arr={0,31,0,31,30,31,30,31,31,30,31,30,31};
        int total=0;
        for (int i = 1; i < month; i++) {
            total+=arr[i];
        }

        if (judgeYear(year) && month > 2){
            total+=29;
        }else if (month > 2){
            total+=28;
        }

        total+=day;
        System.out.println(total);
    }

    /**
     * 判断一个年份是否是闰年
     * @param year:要判断的年份
     * @return true: 闰年，false：平年
     */
    public static boolean judgeYear(int year){
        if((0==year%400)||(0==(year%4))&&(0!=(year%100))){
            //只有字符串才用equals比较
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * 将字符串转成字符数组
     */
    public void test4(){
        //字符数组
        String str = "abcdef1234";
        //将字符串转成字符数组
        char[] chars = str.toCharArray();
        //打印
        for (int i = 0;i < chars.length ; i++) {
            System.out.println(chars[i]);
        }
    }
    /**
     * 查找字符串中的空格数
     */
    public static void test5 (){
       //String str = "I love ios, i want an iPhoneX";
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();//nextline()可以收空格
       char[] chars = str.toCharArray();
       int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (' '==chars[i]){
                //字符用等号比较，只有string用equals比较
                num++;
            }
        }
        System.out.println("字符串中的空格数为:"+num);
    }
}
