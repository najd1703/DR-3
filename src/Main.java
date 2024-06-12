public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        //задача 2//
        int temperature1 = 2;
        if (temperature1 < 5) {
            System.out.println("Температура на улице " + temperature1 + " градуса, лучше сиди дома и попивай чаёчек");
        }
        int temperature2 = 9;
        if (temperature2 > 5) {
            System.out.println("Температура на улице " + temperature2 + " градуса, можно с кайфом гулять!");
        }
        //задача 3//
        int speed1 = 65;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + ",то придётся заплатить штраф!");
        }
        int speed2 = 55;
        if (speed2 < 60) {
            System.out.println("если скорость " + speed2 + ",то можно ездить спокойно!");
        }
        //задача 4//
        int age1 = 14;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ",то то ему нужно ходить в детский сад!");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ",то то ему нужно ходить в школу!");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ",то его место в университете!");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ",то ему нужно ходить на работу!");
        }
        //задача 5//
        int baby = 15;
        if (baby < 5) {
            System.out.println("Если ребенку меньше " + baby + " лет, то он не может кататься на аттракционе");
        }
        if (baby >= 5 && baby <= 14) {
            System.out.println("Ребенку " + baby + " лет ,он может кататься только в сопровождении взрослого");
        } else if (baby > 14) {
            System.out.println("Ребенок старше " + baby + " лет, он может кататься без сопровождения взрослого");
        }
        //задача 6//

        int capacity = 100;
        int seating = 55;
        if (seating < 60 && capacity < 102) {
            System.out.println("В вагоне есть сидячие и стоячие места!");
        } else if (seating == 60 && capacity < 102) {
            System.out.println("В вагоне есть только стоячие места!");
        } else {
            System.out.println("В вагоне нет мест");
        }
        //задача 7//

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число- " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Самое большое число- " + two);
            } else {
                if (three > one && three > two) {
                    System.out.println("Самое большое число- " + three);
                }
            }
        }
    }
}












