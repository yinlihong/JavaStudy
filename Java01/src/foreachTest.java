import java.util.concurrent.ForkJoinPool;

/**
 * Created By yinlihong on 2018/7/13 15:24.
 */
public class foreachTest {
    public static void main(String[] args) {
        //test2();
        test6();
    }
    public static void test1 (){
        for (int i = 0; i < 5; i++) {
            //5.fori
            System.out.println("我爱你中国！");
        }
        for (int i = 5; i > 1; i++) {
            System.out.println(i);
        }
    }
    public static void test2 (){
        //输出200-300内十位为7
        for(int i=200;i<300;i++){
            //if(i/10==27)
            if(i/10%10==7) {
                System.out.println(i);
            }
        }
    }
    public static void test3 (){
        //用for循环打印出0-100之间既不是7的倍数并且也不包含7的数
        for (int i = 0; i < 100; i++) {
            if(i%7!=0&&(i/10!=7)&&(i%10!=7)){
                System.out.println(i);
            }
        }
    }
    public static void test4 (){
        //获取[0-10]范围的数
        //[0-1] double类型
        int num = (int)(Math.random()*10);//获取0到几就乘以几
        System.out.println(num);
        //获取[10-20]=> -10 => [0-10] => [0-10]+10
        int num1 = (int)(Math.random()*10)+10;
        //获取[24-67]
        int num2 = (int)(Math.random()*43)+24;//乘以两个数之间的差再加上范围的低值
        }

    public static void test5 (){
        //用for打印10个随机数(10-30)，求最大值和最小值
        int min=31;
        int max=9;
        for (int i = 0; i < 10 ; i++) {
            int rand = (int) (Math.random() * 20) + 10;
            if (rand<min){
                min=rand;
            }
            if (rand>max){
                max=rand;
            }
            System.out.print(rand+" ");
        }
        System.out.println("min:"+min+" max:"+max);
    }
    public static void test6 (){
        for (int i = 0; i <3 ; i++) {
          for(int j = 0; j < (3-i);j++){
              System.out.print(i+1+" ");
          }
            System.out.println();
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j <= i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
