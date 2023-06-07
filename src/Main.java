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
        int age = 19;
        if (age > 18) {
            System.out.println("Если возраст человека рвен " + age + " он совершенно летний");
        } else {
            System.out.println("Если возраст человека рвен " + age + " он не совершенно летний");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int outStreet = 7;
        if (outStreet > 5) {
            System.out.println("На улице " + outStreet + " градусов, можно тдти без шапки");
        } else {
            System.out.println("На улице " + outStreet + " градусов, нужно надеть шапку");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 67;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " , то нужно заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 59;
        if (age <2) {
            System.out.println("Еси возрест человека " + age + ", то ему надо спать");
            }
        if (age>2 && age<6) {
            System.out.println("Если возраст человека " + age + ", то ему надо в детский сад");
        }
        if (age>=7 && age <=18) {
            System.out.println("Если возраст человека " +age + ", то ему надо в школу ");
        }
        if (age>=18 && age<=24){
            System.out.println("Если возрасть человека " + age + ", то ему надо в университет");
        }
        if (age>= 24 && age <=60 ){
            System.out.println("Если возрат человека " + age + ", то ему надо на работу");
        }
        else
            System.out.println("Если возраст человека " + age + ", то ему можно отдохнуть");

        }

    public static void task5() {
        System.out.println("Задача 5");
        int ageBaby = 15;
        if (ageBaby <5){
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему нельзя кататься на атракционе");
        }
        if (ageBaby==5 || ageBaby<14){
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то он может кататься на атракционе");
        }
        if (ageBaby >14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то он может кататься без сопровождения взрослого");
        }


    }

    public static void task6() {
        System.out.println("Задача 6");
        int mestVVagone = 102;
        int mestSidya = 60;
        if (mestSidya <= 60 && mestSidya >= 60) {
            System.out.println("Есть сидячие места");
        } else {
            System.out.println(" Нет сидячих мест");
        }
        if (mestVVagone > 102) {
            System.out.println("Вагон полностью забит");
        }


    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 3;
        int two = 4;
        int three = 5;
        int maxNumber = 0;
        if (one >=two && three<= one) {
            maxNumber = one;
        } else if (two >= one && three<= two) {
        maxNumber = two;}
       else maxNumber = three;
        System.out.println(" Максимальное число -> " +maxNumber);

        }
    }



























