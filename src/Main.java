// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int capital = 100; // Первоначальный капитал
        int replenishment = 300; // Сумма пополнения
        int bonus ;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus =0;}
        int score = capital + bonus + replenishment; // Итоговый счет
        System.out.println( "Ваши бонусы составляют " + score);


    }
}