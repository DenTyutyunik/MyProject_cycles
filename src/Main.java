public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.printf("%s год является високосным\n", i);
            }
        }
        System.out.println();

        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 8");
        double moneyHoldEveryMonth = 29000;
        double moneyIsHold = 0;
        for (int i = 1; i <= 12; i++) {
            moneyIsHold += moneyHoldEveryMonth;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, moneyIsHold);
        }
        System.out.println();

        System.out.println("Task 9");
        moneyIsHold = 0;
        double monthPercent = 1.01;

        for (int i = 1; i <= 12; i++) {
            moneyIsHold = (moneyIsHold + moneyHoldEveryMonth) * monthPercent;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", i, moneyIsHold);
        }
        System.out.println();

        System.out.println("Task 10");
        int result;
        for (int i = 1; i <= 10; i++) {
            result = i * 2;
            System.out.printf("2 * %s = %s\n", i, result);
        }
    }
}