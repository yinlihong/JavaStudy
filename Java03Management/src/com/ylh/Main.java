package com.ylh;

import java.util.*;
//要创建4个类而不是3个，一个父类，其他三个类均继承父类，但又有各自的行为
public class Main {
    //定义一个通用的map,key类型为Integer,value类型为Employee
    static HashMap<Integer,Employee> map = new HashMap<>();
    public static void main(String[] args) {
	// write your code here
        while(true) {
            print();
            choice();
        }
    }
    public static void print(){
        System.out.println("==========================");
        System.out.println("1.增加");
        System.out.println("2.删除");
        System.out.println("3.修改");
        System.out.println("4.根据ID查询");
        System.out.println("5.查所有");
        System.out.println("0.退出");
        System.out.println("==========================");
        System.out.println("请选择业务");
    }
    public static void choice () {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addEmp();
                break;
            case 2:
                delEmp();
                break;
            case 3:
                alterEmp();
                break;
            case 4:
                scanEmp();
                break;
            case 5:
                scanAll();
                break;
            case 0:
                System.out.println("感谢使用管理系统 欢迎下次再来哦");
                System.exit(0);//强制退出
            default:
                System.out.println("您要进行的操作不存在！");
        }
    }
    public static void addEmp () {
        System.out.println("---增加员工---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入员工编号：");
        int id = scanner.nextInt();
        System.out.print("请输入员工姓名:");
        String name = scanner.next();
        System.out.print("请输入员工职务(员工、经理、董事):");
        String job = scanner.next();
        System.out.println("请输入员工请假天数：");
        int holiday = scanner.nextInt();
        System.out.println("请输入员工基本工资：");
        double salary = scanner.nextDouble();
        //先创建一个Employee的对象employee并设为空，
        // 根据职位的不同重新设置employee,创建新的对象为其赋值
        Employee employee = null;
        switch (job) {
            case "员工":
                employee = new CommonEmployee();
                break;
            case "经理":
                employee = new ManagerEmployee();
                break;
            case "董事":
                employee = new DirectorEmployee();
                break;
            default:
                System.out.println("您输入的身份有误");
        }
        //新创建的对象里面没有值，要把输入的信息加进去
        employee.setID(id);
        employee.setName(name);
        employee.setHoliday(holiday);
        employee.setJob(job);
        employee.setSalary(salary);
        //在要显示的值的前后按下Enter自动出现加号及引号
        System.out.println("编号： " +
                employee.getID() +
                " 姓名： " +
                employee.getName() +
                " 职务： " +
                employee.getJob() +
                " 请假天数 : " +
                employee.getHoliday()+
                " 工资：" +
                employee.getSalary());
        //map的key值为id，id值各不相同，将各项值加入到map中
        map.put(id, employee);
    }
    public static void delEmp (){
        System.out.println("---删除员工---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入员工编号：");
        int id = scanner.nextInt();
        //map.containsKey()方法判断是否含有id值，不必再遍历
        if (map.containsKey(id)) {
            //将map中id项的信息删除
            map.remove(id);
            System.out.println("删除成功");
        }else{
            System.out.println("该员工不存在");
        }
    }
    public static void alterEmp (){
        System.out.println("---修改员工---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入员工编号：");
        int id = scanner.nextInt();
        if(map.containsKey(id)){
            //map.get(key)返回的是value值，可用此方法通过id获取employee的信息
            Employee employee = map.get(id);
            System.out.println("编号： " +
                    employee.getID() +
                    " 姓名： " +
                    employee.getName() +
                    " 职务： " +
                    employee.getJob() +
                    " 请假天数 : " +
                    employee.getHoliday()+
                    " 工资：" +
                    employee.getSalary());
        }
        System.out.println("---请按照提示输入修改信息---");
        System.out.print("请输入员工编号：");
        int id1 = scanner.nextInt();
        System.out.print("请输入员工姓名：");
        String name = scanner.next();
        System.out.print("请输入员工职务(员工、经理、董事)：");
        String job = scanner.next();
        System.out.println("请输入员工请假天数：");
        int holiday = scanner.nextInt();
        System.out.println("请输入员工基本工资：");
        double salary = scanner.nextDouble();
        Employee employee = null;
        switch (job) {
            case "员工":
                employee = new CommonEmployee();
                break;
            case "经理":
                employee = new ManagerEmployee();
                break;
            case "董事":
                employee = new DirectorEmployee();
                break;
            default:
                System.out.println("您输入的身份有误");
        }
        employee.setID(id1);
        employee.setName(name);
        employee.setHoliday(holiday);
        employee.setJob(job);
        employee.setSalary(salary);
        System.out.println("编号： " +
                employee.getID() +
                " 姓名： " +
                employee.getName() +
                " 职务： " +
                employee.getJob() +
                " 请假天数 : " +
                employee.getHoliday()+
                " 工资：" +
                employee.getSalary());
        map.put(id, employee);
    }
    public static void scanEmp (){
        System.out.println("---查找员工---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入员工编号：");
        int id = scanner.nextInt();
        if(map.containsKey(id)){
            Employee employee = map.get(id);
            System.out.println("编号： " +
                    employee.getID() +
                    " 姓名： " +
                    employee.getName() +
                    " 职务： " +
                    employee.getJob() +
                    " 请假天数 : " +
                    employee.getHoliday()+
                    " 工资：" +
                    employee.getSalary());
            System.out.println("查找成功");
        }
    }
    public static void scanAll (){
        //增强for循环
        //map.keySet()key的集合
   for(Integer id:map.keySet()){
       Employee employee = map.get(id);
       System.out.println("编号： " +
               employee.getID() +
               " 姓名： " +
               employee.getName() +
               " 职务： " +
               employee.getJob() +
               " 请假天数 : " +
               employee.getHoliday()+
               " 工资：" +
               employee.getSalary());
   }
    }
}
