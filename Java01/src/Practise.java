import jdk.management.resource.internal.TotalResourceContext;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 * Created By yinlihong on 2018/7/13 16:46.
 */
public class Practise {
    public static void main(String[] args) {
        test4();
    }

    //九九乘法表
    public static void test1() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                //System.out.print((i + 1) + "*" + (j + 1)+ "=" + (i + 1) * (j+1)+"  ");
                System.out.printf("%d*%-1d=%-2d ",(i+1),(j+1),(i + 1) * (j+1));
                //System.out.printf("%-10s","abc");输出10列 左对齐 负号表示左对齐
                //System.out.printf("%8d",123);//输出8列 右对齐
            }
            System.out.println();
        }
    }
    //计算班级平均分及成绩在85分以上的人数
    public static void test2 (){
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("请输入第"+i+"个班级的成绩：");
            int totalscore = 0;
            int num = 0;
            for (int j = 1; j < 5; j++) {
                System.out.print("第"+j+"个学员的成绩：");
                int score = scanner.nextInt();
                totalscore += score;
                if(score > 85){
                    num++;
                }
            }
            System.out.println("第"+i+"个班级参赛学员的平均分为:"+(1.0*totalscore/4));
            System.out.println("第"+i+"个班层级在85分以上的共有"+num+"人");
        }
    }
    //专卖店买衣服
    public static void test3(){
        Scanner scanner = new Scanner(System.in);
        int totalnum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("欢迎光临第"+i+"家专卖店");
            for (int j = 1; j < 4; j++) {
                System.out.print("要离开吗？(y/n)");
                String answer = scanner.next();
                if("y".equals(answer)){
                    System.out.println("离店结账");
                    break;
                }
                else{
                    System.out.println("买了一件衣服");
                    totalnum++;
                }
            }
            }
        System.out.println("总共买了"+totalnum+"件衣服");
    }
    //最大公约数和最小公倍数
    public static void test4(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r;
        do{
            r = a%b;
            if(r!=0){
                a = b;
                b = r;
                r = a%b;
            }
        }while (r!=0);
        System.out.println("最大公约数为:"+b);
    }
}
