public class Main {
    public static void main(String[] args) {

        int age = 19;
        if (age > 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 17;
        if (temperature < 5) {
            System.out.println("На улице холодно - " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло - " + temperature + " градусов, можно идти без шапки");
        }

        int speed = 97;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то приидётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        int ageHuman = 16;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        int ageChildren = 6;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребёнка равен " + ageChildren + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChildren > 5 && ageChildren < 14) {
            System.out.println("Если возраст ребёнка равен " + ageChildren + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChildren >= 14) {
            System.out.println("Если возраст ребёнка равен " + ageChildren + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int places = 78;
        if (places > 102) {
            System.out.println("В вагоне нет свободных мест");
        } else {
            if (places <= 60) {
                System.out.println("В вагоне есть свободные сидячие места");
            }
            if (places > 60 && places < 102) {
                System.out.println("В вагоне есть свободные стоячие места");
            }
        }

        int one = 6;
        int two = 9;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else {
            if (two > one && two > three) {
                System.out.println("Число two больше остальных");
            } else {
                if (three > one && three > two) {
                    System.out.println("Число three больше остальных");
                }
            }
        }

    }
}