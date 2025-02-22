public class Main {
    public static void main(String[] args) {
        byte personAgeOne = 19;
        if (personAgeOne >= 18) {
            System.out.println("Если возраст человека равен " + personAgeOne + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + personAgeOne + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        byte temperatureOne = 4;
        if (temperatureOne < 5) {
            System.out.println("На улице " + temperatureOne + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureOne + " градусов, можно идти без шапки");
        }

        byte speedAutoOne = 61;
        if (speedAutoOne > 60) {
            System.out.println("Если скорость " + speedAutoOne + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedAutoOne + ", то можно ездить спокойно");
        }

        byte ageKid = 2;
        byte ageTeenager = 7;
        byte ageFull = 18;
        byte ageBig = 25;
        if (ageKid > 1 && ageKid < 7) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить в детский сад");
        }
        if (ageTeenager > 6 && ageTeenager < 18) {
            System.out.println("Если возраст человека равен " + ageTeenager + ", то ему нужно ходить в школу");
        }
        if (ageFull > 17 && ageFull < 25) {
            System.out.println("Если возраст человека равен " + ageFull + ", то ему нужно ходить в университет");
        }
        if (ageBig > 24) {
            System.out.println("Если возраст человека равен " + ageBig + ", то ему нужно ходить на работу");
        }

        byte kidAge = 4;
        if (kidAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему  нельзя кататься на аттракционе");
        }
        if (kidAge >= 5 && kidAge < 14) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему  можно кататься на аттракционе в сопровождении");
        }
        if (kidAge >= 14) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему  можно кататься на аттракционе без сопровождения взрослого");
        }

        byte carriageCapacity = 102;
        byte seatingPositions = 60;
        int standingPlaces = carriageCapacity - seatingPositions;
        if (standingPlaces == 0) {
            System.out.println("Вагон полностью забит");
        } else if (seatingPositions > 0) {
            System.out.println("Сидячие места есть");
        } else if (seatingPositions > 0) {
            System.out.println("Сидячих мест нет, есть стоячие");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("one большее число");
        } else if (two > one && two > three) {
            System.out.println("two большее число");
        } else {
            System.out.println("three большее число");
        }
    }
}

