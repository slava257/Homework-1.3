public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("задача 1");
        int apple = 222222;
        System.out.println("Значение переменной apple с типом int "+apple);
        byte apricot = 5;
        System.out.println("Значение переменной apricot с типом byte "+apricot);
        short avocado = 11111;
        System.out.println("Значение переменной avocado с типом short "+avocado);
        long banana = 88_888_888_888L;
        System.out.println("Значение переменной banana с типом long "+banana);
        float bergamot = 0.7777F;
        System.out.println("Значение переменной bergamot с типом float "+bergamot);
        double cashew = 125.8888888;
        System.out.println("Значение переменной cashew с типом double "+cashew);
        //задача2
        System.out.println("задача 2 ");
        float peanut = 27.12F;
        System.out.println("арахиса" +peanut+ "кг");
        long coconut = 987_678_965_549L;
        System.out.println("кокоса" +coconut+ "кг");
        double beet = 2.786;
        System.out.println("свеклы" +beet+ "кг");
        boolean weightComparison = false;
        System.out.println("арбуз меньше " +weightComparison+ " свеклы");
        short rice = 569;
        System.out.println("риса " +rice+ " кг");
        short tomatoes = -159;
        System.out.println("помидор " +tomatoes+ " кг");
        short pumpkin = 27897;
        System.out.println("тыквы " +pumpkin+ " кг");
        byte greenBean = 67;
        System.out.println("стручковой фасоли " +greenBean+ " кг");
        //Задача 3
        System.out.println(" задача 3");
        byte classroom1 =23;
        byte classroom2 =27;
        byte classroom3 =30;
        short justAPieceOfPaper =480;
        int forEachStudent = justAPieceOfPaper / (classroom1 + classroom2 + classroom3);
        System.out.println("На каждоо ученика рассчитано " +forEachStudent+ " листов бумаги");
        System.out.println("на каждого ученика рассчитано " +justAPieceOfPaper / (classroom1+classroom2+classroom3)+ " листов бумаги");
        //Задача 4
        System.out.println("задача 4 ");
        byte bottles =16;
        byte minutes =2;
        byte in2Minutes =16;
        int inOneMinute = bottles/minutes;
        byte minutes1 =20;
        int machinePerformance1 =minutes1*inOneMinute;
        byte day =24;
        byte oneHour =60;
        int minutesPerDay =day*oneHour;
        int machinePerformance2 = minutesPerDay*inOneMinute;
        int threeDays = day*3;
        int minutesInThreeDays = threeDays*oneHour;
        int machinePerformance3 = minutesInThreeDays*inOneMinute;
        int hoursPerMouth = day*30;
        int minutesPerMonth = hoursPerMouth*oneHour;
        int machinePerformance4 =minutesPerMonth*inOneMinute;
        System.out.println("за " +minutes1+ " машина произвела бутылок " +machinePerformance1+ " штук");
        System.out.println("за " +minutesPerDay+ " машина произвела бутылок " +machinePerformance2+ " штук");
        System.out.println("за " +threeDays+ " машина произвела бутылок " +machinePerformance3+ " штук");
        System.out.println("за " +hoursPerMouth+ " машина произвела бутылок " +machinePerformance4+ " штук");
        //Задача 5
        System.out.println("задача 5");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int goesOneClass = whitePaint+brownPaint;
        int classesAtSchool = totalPaint/goesOneClass;
        int allWhitePaint = classesAtSchool*whitePaint;
        int allBrownPaint = classesAtSchool*brownPaint;
        System.out.println("В школе, где "+classesAtSchool+" классов, нужно "+allWhitePaint+" банок белой краски и "+allBrownPaint+" банок коричневой краски");
        System.out.println("в школе, где "+totalPaint/(whitePaint+brownPaint)+" классов, нужно "+(totalPaint/(whitePaint+brownPaint))*whitePaint+" банок белой краски и "+(totalPaint/(whitePaint+brownPaint))*brownPaint+" банок коричневой краски");
        //Задача 6
        System.out.println("задача 6");
        byte bananas = 5;
        byte weightOfOneBanana =80;
        int weight5Bananas = bananas*weightOfOneBanana;
        short milk100ml = 2;
        byte weightMilk100Ml = 105;
        int milk200ml = weightMilk100Ml*milk100ml;
        byte iceCreamSundae = 2;
        byte weightOf1Briquette = 100;
        int weightOf2Briquettes = iceCreamSundae*weightOf1Briquette;
        byte rawEggs = 4;
        byte weightOf1Egg = 70;
        int weight4Eggs = rawEggs*weightOf1Egg;
        int sportsBreakfastWeight =weight5Bananas+milk200ml+weightOf2Briquettes+weight4Eggs;
        float oneKilogram =1000f;
        float breakfastInKilograms = sportsBreakfastWeight/oneKilogram;
        System.out.println("Общий вес спорт-завтрака "+sportsBreakfastWeight+" гр, а в келограммах "+breakfastInKilograms );
        //Задача 7
        System.out.println("задача 7");
        byte overweightAthleteInKilograms = 7;
        short Kilogram = 1000;
        int overweightAthleteInGrams = overweightAthleteInKilograms*Kilogram;
        short anAthleteLosesGramsPerDay1 = 250;
        short anAthleteLosesGramsPerDay2 = 500;
        int daysToResult1 = overweightAthleteInGrams/anAthleteLosesGramsPerDay1;
        int daysToResult2 =overweightAthleteInGrams/anAthleteLosesGramsPerDay2;
        int averageNumberOfDays = (daysToResult1+daysToResult2)/2;
        System.out.println("Если спортсмен будеть терять каждый день по "+anAthleteLosesGramsPerDay1+" грамм, то потребуется "+daysToResult1+" дней, а если спортсмне будет терять "+anAthleteLosesGramsPerDay2+" грамм в день, то на это уйдет "+daysToResult2+" дней");
        System.out.println("в среднем спортсмену потребуется "+averageNumberOfDays+" день, чтобы добиться результата похудения");
        //Задача 8
        System.out.println("задача 8");
        byte oneYear = 12;
        int mashaSalary = 67760;
        float tenPercentForMasha =(float) mashaSalary/100*10;
        int denisSalary =83690;
        float tenPercentForDenis =(float) denisSalary/100*10;
        int christinaSalary =76230;
        float tenPercentForChristina =(float) christinaSalary/100*10;
        float mashaSalaryIncrease = mashaSalary+tenPercentForMasha;
        float denisSalaryIncrease = denisSalary+tenPercentForDenis;
        float christinaSalaryIncrease = christinaSalary+tenPercentForChristina;
        float mashaAnnualSalaryAfterPromotion = mashaSalaryIncrease*oneYear;
        float denisAnnualSalaryAfterPromotion = denisSalaryIncrease*oneYear;
        float christinaAnnualSalaryAfterPromotion =christinaSalaryIncrease*oneYear;
        int mashaAnnualSalary = mashaSalary*oneYear;
        int denisAnnualSalary = denisSalary*oneYear;
        int christinaAnnualSalary = christinaSalary*oneYear;
        float mashaAnnualSalaryDifference = mashaAnnualSalaryAfterPromotion-mashaAnnualSalary;
        float denisAnnualSalaryDifference = denisAnnualSalaryAfterPromotion-denisAnnualSalary;
        float christinaAnnualSalaryDifference = christinaAnnualSalaryAfterPromotion-christinaAnnualSalary;
        System.out.println("Маша теперь получает "+mashaSalaryIncrease+" рублей.Годовой доход вырос на "+mashaAnnualSalaryDifference+" рублей");
        System.out.println("Денис теперь получает "+denisSalaryIncrease+" рублей.Годовой доход вырос на "+denisAnnualSalaryDifference+" рублей");
        System.out.println("Кристина теперь получает "+christinaSalaryIncrease+" рублей.Годовой доход вырос на "+christinaAnnualSalaryDifference+" рублей");

    }
}