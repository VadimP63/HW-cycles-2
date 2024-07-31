public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total += salary;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(" " + start);
            start = start + 1;
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Task 3");
        int population = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            population = population + (population / 1000) * (birthrate - mortality);
            year += 1;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

        System.out.println("Task 4");
        int deposit = 15000;
        month = 0;
        while (deposit < 12_000_000) {
            deposit *= 1.07;
            month +=1;
            System.out.println("Месяц " + month + " накоплено " + deposit);
        }

        System.out.println("Task 5");
        deposit = 15000;
        month = 0;
        while (deposit < 12_000_000) {
            deposit *= 1.07;
            month +=1;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + " накоплено " + deposit);
            }
        }

        System.out.println("Task 6");
        year = 9;
        deposit = 15000;
        month = 0;
        for (int i = 0; i <= year * 12 ; i++) {
            deposit *= 1.07;
            month +=1;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + " накоплено " + deposit);
            }
        }

        System.out.println("Task 7");
        int day = 5;
        while (day < 31) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        }

        System.out.println("Task 8");
        int todayYear = 2024;
        int lastYear = todayYear - 200;
        int futureYear = todayYear + 100;
        for (int i = lastYear; i < futureYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}