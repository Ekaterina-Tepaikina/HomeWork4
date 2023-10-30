public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 17;
        if (age > 17) {
            System.out.println("Если возраст человека равен " + age + " годам, то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " годам, то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задача 2
        int degree = 5;
        if (degree > 4) {
            System.out.println("На улице тепло, " + degree + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, " + degree + " градусов, нужно надеть шапку.");
        }
        //Задача 3
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        //Задача 4
        int ages = 24;
        if (ages > 1 && ages < 7) {
            System.out.println("Если человеку " + ages + " лет, то ему нужно ходить в детский сад.");
        } else {
            if (ages > 6 && ages < 18) {
                System.out.println("Если человеку " + ages + " лет, то ему нужно ходить в школу.");
            } else {
                if (ages > 17 && ages < 25) {
                    System.out.println("Если человеку " + ages + " лет, то его место в университете.");
                } else {
                    System.out.println("Если человеку " + ages + " лет, то ему пора ходить на работу.");
                }
            }
        }
        //Задача 5
        ages = 14;
        if (ages < 5) {
            System.out.println("Если возраст ребёнка равен " + ages + " годам, то ему нельзя кататься на аттракционе.");
        } else {
            if (ages < 14) {
                System.out.println("Если возраст ребёнка равен " + ages + " годам, то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребёнка равен " + ages + " годам, то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }
        //Задача 6
        int people = 55;
        if (people < 60) {
            System.out.println("В вагоне есть сидячие места.");
        } else {
            if (people < 102) {
                System.out.println("В вагоне есть стоячие места.");
            }
        }
        //Задача 7
        int one = 5;
        int two = 4;
        int three = 6;
        if (one > two && one > three){
            System.out.println("Число one больше всех.");
        }
        else {
            if (two > three){
                System.out.println("Число two больше всех.");
            }
            else {
                System.out.println("Число three больше всех.");
            }

        }
    }
}