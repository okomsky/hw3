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
        byte cat = 5;
        short dog = 2;
        int mouse = 1;
        long zebra = 16;
        float lion = 3;
        double giraffe = 8;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        System.out.println("Значение переменной dog с типом short равно " + dog);
        System.out.println("Значение переменной mouse с типом int равно " + mouse);
        System.out.println("Значение переменной zebra с типом long равно " + zebra);
        System.out.println("Значение переменной lion с типом float равно " + lion);
        System.out.println("Значение переменной giraffe с типом double равно " + giraffe);
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte a = 67;
        short b = 569;
        short c = -159;
        short d = 27897;
        long e = 987_678_965_549L;
        float f = 2.786f;
        float g = 27.12f;
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte людмилаПавловна = 23;
        byte аннаСергеевна = 27;
        byte екатеринаАндреевна = 30;
        short paper = 480;
        int paperForEachStudent = (short)  paper / (людмилаПавловна + аннаСергеевна + екатеринаАндреевна);
        System.out.println("На каждого ученика рассчитано " +paperForEachStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte machineProductivity = 16;
        int time = 2;
        int machineProductivityIn1minute = (byte) machineProductivity / time;
        time = 20;
        int machineProductivityA = machineProductivityIn1minute * time;
        System.out.println("За " + time + " минут машина произвела " + machineProductivityA + " штук бутылок");
        time = 60 * 24;
        int machineProductivityB = machineProductivityIn1minute * time;
        System.out.println("За " + time + " минут машина произвела " + machineProductivityB + " штук бутылок");
        time = time * 3;
        int machineProductivityC = machineProductivityIn1minute * time;
        System.out.println("За " + time + " минут машина произвела " + machineProductivityC + " штук бутылок");
        time = time * 10;
        int machineProductivityD = machineProductivityIn1minute * time;
        System.out.println("За " + time + " минут машина произвела " + machineProductivityD + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalCansOfPaint = 120;
        byte whiteCansFor1Classroom = 2;
        byte brownCansFor1Classroom = 4;
        int classroomCans = whiteCansFor1Classroom + brownCansFor1Classroom;
        int classrooms = totalCansOfPaint / classroomCans;
        int whiteCans = classrooms * whiteCansFor1Classroom;
        int brownCans = classrooms * brownCansFor1Classroom;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски" );
    }
    public static void  task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        short milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        int totalBananasWeight = bananas * bananaWeight;
        int totalMilkWeight =  milk * milkWeight;
        int totalIceCreamWeight = iceCream * iceCreamWeight;
        int totalEggsWeight = eggs * eggWeight;
        float grIntoKg = 1000F;
        System.out.println("Вес завтрака в граммах " + (totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight));
        System.out.println("Вес завтрака в килограммах " + ((totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight)/ grIntoKg));
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte loseWeight = 7;
        short loseWeightGr = 7 * 1000;
        short lostWeightInDayA = 250;
        short lostWeightInDayB = 500;
        System.out.println(loseWeightGr/lostWeightInDayA +" дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(loseWeightGr/lostWeightInDayB +" дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("Потребуется в среднем " + ((loseWeightGr/lostWeightInDayA)+(loseWeightGr/lostWeightInDayB))/2 + " день, чтобы добиться результата похудения");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaPastSalary = 67760;
        int denisPastSalary = 83690;
        int christinaPastSalary = 76230;
        float indexPercent = 1.1F;
        float mashaSalary = mashaPastSalary * indexPercent;
        float denisSalary = denisPastSalary * indexPercent;
        float christinaSalary = christinaPastSalary * indexPercent;
        float mashaAnnualSalary = mashaPastSalary * 12;
        float mashaNewAnnualSalary = mashaSalary * 12;
        float denisAnnualSalary = denisPastSalary * 12;
        float denisNewAnnualSalary = denisSalary * 12;
        float christinaAnnualSalary = christinaPastSalary * 12;
        float christinaNewAnnualSalary = christinaSalary * 12;
        System.out.println("Маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + (mashaNewAnnualSalary - mashaAnnualSalary) + " рублей");
        System.out.println("Денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + (denisNewAnnualSalary - denisAnnualSalary) + " рублей");
        System.out.println("Кристина теперь получает " + christinaSalary + " рублей. Годовой доход вырос на " + (christinaNewAnnualSalary - christinaAnnualSalary) + " рублей");
    }
}