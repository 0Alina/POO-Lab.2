// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //nu scriu nimic ca să nu mă fac de râs
        Sakura sakura = new Sakura("Prunus serrulata (cireș japonez)");
        System.out.println("Sakura" + sakura);

        Onigiri onigiri = new Onigiri("Ton");
        System.out.println("Onigiri" + onigiri);

        Yukata yukata = new Yukata("Carouri");
        System.out.println("Yukata" + yukata);

        Anime anime = new Anime("Isekai");
        System.out.println("Anime" + anime);

        //setter
        sakura.setSpecie("Prunus avium (cireș european)");
        onigiri.setUmplutura("Kimchi");
        yukata.setImprimeu("Floral");
        anime.setGen("Drama");

        // Getter
        System.out.println("Sakura after modification: " + sakura.getSpecie());
        System.out.println("Onigiri after modification: " + onigiri.getUmplutura());
        System.out.println("Yukata after modification: " + yukata.getImprimeu());
        System.out.println("Anime after modification: " + anime.getGen());
    }
}