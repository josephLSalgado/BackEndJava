package practicaMona;

public class testMonas {
    public static void main(String[] args) {
        profesionesMona();
        cosplaysMona();
    }

    public static void profesionesMona() {
        Wilson wilson = new Wilson(20, "Wilson", false,
                new String[] {"cameronmcefee"}, "Uniforme del equipo Giants",
                "Beisbolista");
        SupportCat supportCat = new SupportCat(32, "SupportCat", false,
                new String[] {"jasoncostello"}, "Auriculares",
                "Soporte técnico");
        HulatoCat hulatoCat = new HulatoCat(137, "HulatoCat", true,
                new String[] {"heyhayhay"}, "Ukelele", "Músico");
        BenjaminBanneKat benjaminBanneKat = new BenjaminBanneKat(127,
                "Benjamin BanneKat", false, new String[] {"heyhayhay",
                "johncreek", "tonyjaramillo"}, "Telescopio", "Astrónomo");

        System.out.println(wilson.showMessage());
        wilson.actividad();

        System.out.println(supportCat.showMessage());
        supportCat.actividad();

        System.out.println(hulatoCat.showMessage());
        hulatoCat.actividad();

        System.out.println(benjaminBanneKat.showMessage());
        benjaminBanneKat.actividad();
    }

    public static void cosplaysMona() {
        HomerCat homerCat = new HomerCat(80, "HomerCat", false,
                new String[] {"nickh"}, "Los Simpson");
        LinktoCat linktoCat = new LinktoCat(59, "LinktoCat", false,
                new String[] {"cameronmcefee"}, "La Leyenda de Zelda");

        System.out.println(homerCat.showMessage());
        homerCat.actividad();

        System.out.println(linktoCat.showMessage());
        linktoCat.actividad();
    }
}
