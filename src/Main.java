public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}