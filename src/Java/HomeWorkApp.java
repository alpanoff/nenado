package Java;

public class HomeWorkApp {

    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();



    }
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
public static void checkSumSign () {
        int a = 20;
        int b = -40;

    if (a + b >= 0) {
        System.out.println("Сумма положительная.");
    }
    else {
        System.out.println("Сумма отрицательная.");
    }

}
public static void printColor () {
    int value = -90;
    if (value <= 0) {
        System.out.println("Красный");
    } else if (value > 0 && value <= 100) {
        System.out.println("Жёлтый");
    } else {
        System.out.println("Зелёный");
    }
}
public static void compareNumbers () {
        int a = 30;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
}
        else {
        System.out.println("a<b");
    }
}
    }

