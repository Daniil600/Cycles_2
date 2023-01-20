public class Main {
    public static void main(String[] args) {

        task1();

        System.out.println();

        task2();

        System.out.println();
        System.out.println();

        task3();

        System.out.println();

        task4();

        System.out.println();

        task5();

        System.out.println();

        task6();

        System.out.println();

        task7();

        System.out.println();

        task8();


    }

    public static void task1() {
        System.out.println("Задание #1");
        int total = 0;
        int sallary = 15_000;
        int i = 1;
        while (total < 2_459_000) {
            total += sallary;
            System.out.println("Накопленно средств: " + total + " за " + i + " месяцев");
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задание #2");
        int i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
    }

    public static void task3() {
        System.out.println("Задание #3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 10;


        int avgFertility = fertility - mortality;

        for (int i = 1; i <= year; i++) {
            int count = 0;
            count = mortality * (population / 1000);
            population += count;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {

        System.out.println("Задание #4");
        int sallary = 15_000;
        int i = 1;
        int capitall = 0;
        while (capitall < 12_000_000) {
            double procent = 0;
            procent = ((double) (capitall * 0.07));
            capitall += sallary + procent;
            System.out.println("На " + i + " месяц на счету " + capitall);
            i++;
        }
    }

    public static void task5() {
        System.out.println("Задание #5");
        int sallary = 15_000;
        int i = 1;
        int capitall = 0;
        while (capitall < 12_000_000) {
            double procent = 0;
            procent = ((double) (capitall * 0.07));
            capitall += sallary + procent;
            if (i % 6 == 0) {
                System.out.println("На " + i + " месяц на счету " + capitall);
            }
            i++;
        }
    }

    public static void task6() {
        System.out.println("Задание #6");
        int sallary = 15_000;
        int capitall = 0;

        for (int i = 1; i < (12 * 9); i++){
            double procent = 0;
            procent = ((capitall * 0.07));
            capitall += sallary + procent;
            if (i % 6 == 0){
                System.out.println("На " + i + " месяц на счету " + capitall);
            }
        }
    }

    public static void task7(){
        int dayX = 6;
        for (;dayX < 30; dayX +=7){
            System.out.println("Сегодня " + dayX + "-е пятница - отчетный день!!");
        }
    }

    public static void task8(){
        int startYear = 1896;
        for( int i = 0; i <= 300; i++) {
            if (i % 79 == 0) {
                System.out.println(startYear);
            }
            startYear += 1;
        }
    }
}
