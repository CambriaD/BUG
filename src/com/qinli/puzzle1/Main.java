package com.qinli.puzzle1;


/**
 * @Author Cambria
 * @creat 2021/2/3 23:29
 */
public class Main {
    static Student[] students = new Student[3];

    public static void main(String[] args) {

        students[1].name = "法外狂徒张三";
        students[1].age = 20;
        students[2].name = "李四";
        students[2].age = 21;
        students[3].name = "王五";
        students[3].age = 19;

        return;
    }

    static void printStu(){
        for (Student student : students) {
            System.out.println("姓名：" + student.name);
            System.out.println("年龄：" + student.age);
        }
    }
}
