package basics;

public class ConditionalTest3 {
    public static void main(String[] args) {

        float money = 30f;
        if (money >= 1000000) {
            System.out.println("I like money");
        } else if (money < 1000000 && money > 500000) {
            System.out.println("I like money");
        } else if (money <= 500000 && money > 100000) {
            System.out.println("I like money");
        } else {
        }

    }
}