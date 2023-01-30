public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int age = 40;
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {

            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }



    }
    public static void task2() {
        System.out.println("Задача 2");

        double outsideTemp = 4;
        System.out.print("На улице " + outsideTemp + " градусов, ");
        if (outsideTemp <= 5) {
            System.out.println("на улице холодно, нужно надеть шапку");

        } else {
            System.out.println("сегодня тепло, можно идти без шапки");
        }


    }
    public static void task3() {
        System.out.println("Задача 3");
        double speed = 80;
        System.out.print("Если скорость " + speed + " то ");
        if (speed <= 60) {
            System.out.println("можно ездить спокойно");
        } else {
            System.out.println("придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Звдача 4");

    }


}