public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

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
        int age = 20;
        System.out.print("Если возраст человека равен " + age + " , то ему нужно ходить ");
        boolean kinderGarten = age >= 2 && age <= 6;
        boolean school = age >= 7 && age <= 18;
        boolean university = age >= 18 && age <= 24;
        boolean work = age >= 24 ;
        if (kinderGarten) {
            System.out.println("в детский сад");
        }
        if (school) {
            System.out.println("в школу");
        }
        if (university) {
            System.out.println("в университет");
        }
        if (work) {
            System.out.println("на работу");
        }


    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 6;
        System.out.print("Если возраст ребенка равен " + age + ", то ему ");
        boolean attraction = age <= 5;
        boolean attractionAccompanied = age > 5 && age < 14;
        boolean attractionWithoutAccompanied = age > 14;
        if (attraction) {
            System.out.println("нельзя кататься на аттракционе");
        }
        if (attractionAccompanied) {
            System.out.println("можно кататься на аттракционе в сопровождении ");
        }
        if (attractionWithoutAccompanied) {
            System.out.println("можно без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int standingPlace = 42;
        int seatPlace = 60;
        int allPlace = 102;
        int passengers = 103;
        if (passengers < allPlace) {
            System.out.println("Место в вагоне есть");
        } else {
            System.out.println("Вагон уже полностью забит!");
        }
            if (passengers <= seatPlace) {

            System.out.println("Есть место сидячее");
        }
        if (passengers > seatPlace && passengers < allPlace) {
            System.out.println("Есть место стоячее");
        }

    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 7;
        int two = 1;
        int three = 2;


        if (one > two && one > three) {
        System.out.println("Число 1");
        } else {
        if (two > three) {

            System.out.println("Число 2");
        }else
            System.out.println("Число 3");
    }







}

}

