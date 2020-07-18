package pl.sda.zdjavapol1.obserwator;

public class ObserwatorApp {

    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();
        WarunkiBiezace warunkiBiezace = new WarunkiBiezace(danePogodowe);
        Statystyka statystyka = new Statystyka(danePogodowe);
        WarunkiBiezaceCisnienia warunkiBiezaceCisnienia = new WarunkiBiezaceCisnienia(danePogodowe);

        danePogodowe.ustawStan(80, 65, 30.4f);
        System.out.println();

        danePogodowe.ustawStan(82, 70, 29.2f);
        System.out.println();

        danePogodowe.ustawStan(78, 90, 30.4f);
        System.out.println();

        WarunkiBiezaceCisnienia warunkiBiezaceCisnienia1 = new WarunkiBiezaceCisnienia(danePogodowe);

        danePogodowe.ustawStan(78, 90, 30.4f);
        System.out.println();
    }
}
