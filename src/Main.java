public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Task1");
        for(int i = 1; i <= 10;i = i + 1){
            System.out.println(i);
        }
    }
    public static void task2(){
        System.out.println("Task2");
        for(int i = 10; i > 0;i = i - 1){
            System.out.println(i);
        }
    }
    public static void task3(){
        System.out.println("Task3");
        for(int i = 1; i <= 17;i = i + 1){
            if(i % 2 == 0){System.out.println(i);}
        }
    }
    public static void task4(){
        System.out.println("Task4");
        for(int i = 10; i >= (- 10);i = i - 1){
            System.out.println(i);
        }
    }
    public static void task5(){
        System.out.println("Task5");
        for(int i = 1904; i <= 2096;i = i + 1){
            if (i % 4 == 0){System.out.println(i+" год является високосным");}
        }
    }
    public static void task6(){
        System.out.println("Task6");
        for(int i = 7; i <= 98;i = i + 7){
            System.out.println(i);
        }
    }
    public static void task7(){
        System.out.println("Task7");
        for(int i = 1; i <= 512;i = i * 2){
            System.out.println(i);
        }
    }
    public static void task8(){
        System.out.println("Task8");
        int money = 0;
        int moneyplus = 29000;
        for(int i = 1; i <= 12;i = i + 1){
            money = money + moneyplus;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ money +" рублей");
        }
    }
}