public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задание 2.");

        int temperature = 4;
        if (temperature > 5) {
            System.out.println(" На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println(" На улице " + temperature + " градусов, нужно надеть шапку.");}


        System.out.println("Задание 3.");

        int speed = 59;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println(" Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        System.out.println("Задание 4.");

        int agePeople = 25;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println(" Если возраст человека " + agePeople + " то ему нужно ходить в детский сад.");
        }
        if (agePeople >= 7 && agePeople <= 17) {
            System.out.println(" Если возраст человека " + agePeople + " то ему нужно ходить в школу.");
        }
        if (agePeople >= 18 && agePeople <= 24) {
            System.out.println(" Если возраст человека " + agePeople + " то ему нужно ходить в университет.");
        }
        if (agePeople > 24) {
            System.out.println(" Если возраст человека " + agePeople + " то ему пора ходить на работу.");
        }

        System.out.println("Задание 5.");

        int ageKid = 15;
        if (ageKid < 5) {
            System.out.println(" Если возраст ребенка " + ageKid + " то ему нельзя кататься на аттракционе. ");
        }
        if (ageKid > 5 && ageKid < 14) {
            System.out.println(" Если возраст ребенка " + ageKid + " то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageKid > 14) {
            System.out.println(" Если возраст ребенка " + ageKid + " то ему можно кататься на аттракционе без сопровождения взрослого. ");
        }

        System.out.println("Задание 6.");

        int peoples = 40;
        int maxPlace = 102;
        int placeSit = 60;
        int placeStand;
        int placeSitRimmed;
        if (peoples > maxPlace) {
            System.out.println("Вагон полностью забит.");}
        else
            if (peoples >= placeSit) {
            placeStand = maxPlace - peoples;
            System.out.println("В вагоне есть " + placeStand + " стоячих мест.");}
            else {
            placeSitRimmed = placeSit - peoples;
            placeStand = maxPlace - placeSit;
            System.out.println("В вагоне есть " + placeSitRimmed + " сидячих мест и " + placeStand + " стоячих мест.");}

        System.out.println("Задание 7.");

        int x = 5;
        int y = 8;
        int z = 10;
        if (x > y && x > z){
            System.out.println("x");
        } else {
            if (y > x && y > z) {
                System.out.println("y");
            } else {
                System.out.println("z");
            }
        }

}

}