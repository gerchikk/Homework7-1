import org.w3c.dom.ls.LSOutput;

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

    public static void task1() {
        System.out.println("Задача 1");
        int i = 0;
        int total = 0;
        int salary = 15_000;
        int accumulation = 2_459_000;
        while (total < accumulation) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int k = 10; k >= 1; k = k - 1) {
            System.out.print(k + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int born = 17;
        int death = 8;
        int population = 12_000_000;
        int statistic = 1000;
        int i = 0;
        while (i < 10) {
            population = population + population / statistic * (born - death);
            i = i + 1;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        float procent = 0.07f;
        int i = 0;
        float total = 15_000;
        int totalContribution = 12_000_000;
        while (total < totalContribution) {
            total = total + total * procent;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        float procent = 0.07f;
        int i = 0;
        float total = 15_000f;
        int totalContribution = 12_000_000;
        while (total < totalContribution) {
            total = total + total * procent;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        float procent = 0.07f;
        int i = 0;
        int monthInYear = 12;
        int year = 9;
        int totalMonth = monthInYear * year;
        float total = 15_000f;
        int finishContribution = 9;
        while (i <= totalMonth) {
            total = total + total * procent;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int i = 0;
        int numberOfFriday = 3;
        int daysOfMonth = 31;
        while (i < daysOfMonth) {
            i++;
            if (i == numberOfFriday || (i - 3) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + " число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int start = 1823;
        int end = 2123;
        int timeOfComet = 79;
        int i = 0;
        while (i < end) {
            i = i + timeOfComet;
            if (i >= start && i <= end) {
                System.out.println("Год пролета кометы - " + i);
            }
        }
    }
}