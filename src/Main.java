//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, шапку можно не надевать");
        }

        int speed = 60;
        if (speed <= 60) {
            System.out.println("Скорость " + speed + " не превышена, можно спокойно ехать");
        } else {
            System.out.println("Скорость " + speed + " превышена, придет штраф");
        }

        int PersonAge = 21;
        if (PersonAge >= 2 && PersonAge <= 6) {
            System.out.println("Если возраст человека равен " + PersonAge + ", то ему нужно ходить в детский сад");
        } else if (PersonAge >= 7 && PersonAge <= 17) {
            System.out.println("Если возраст человека равен " + PersonAge + ", то ему нужно ходить в школу");
        } else if (PersonAge >= 18 && PersonAge <= 24) {
            System.out.println("Если возраст человека равен " + PersonAge + ", то его место в университете");
        } else if (PersonAge > 24) {
            System.out.println("Если возраст человека равен " + PersonAge + ", то ему пора ходить на работу");
        }

        int childAge = 15; // Можно проверить разные возрасты
        boolean hasAdult = true; // true — взрослый есть, false — взрослого нет
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge > 5 && childAge <= 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого");
            }
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            int capacity = 102;
            int seats = 60;
            int passengers = 60; // Можно менять для проверки
            if (passengers < seats) {
                System.out.println("В вагоне есть сидячие и стоячие места");
            } else if (passengers < capacity) {
                System.out.println("В вагоне остались только стоячие места");
            } else {
                System.out.println("Вагон полностью забит, мест нет");
            }
            int one = 15;
            int two = 28;
            int three = 19;

            if (one >= two && one >= three) {
                System.out.println("Наибольшее число: " + one);
            } else if (two >= one && two >= three) {
                System.out.println("Наибольшее число: " + two);
            } else {
                System.out.println("Наибольшее число: " + three);
            }
        }
    }
}