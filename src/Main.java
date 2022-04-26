public class Main {
    public static void main(String[] args) {

        int account = 100;
        int cash = 1000;
        int invoice = account + cash;

        int bonus;
        if (cash >= 1000 ) {
            bonus = cash / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус: " + bonus);
        System.out.println("У вас на счете " + (invoice + bonus));
    }
}