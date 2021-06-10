import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Asiyah";
        int usia = 18;
        int targetTahunKuliahh = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean cantik = true;

        System.out.println(namaDepan);

        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskaStirng = new String(uniskaChar);
        System.out.println(uniskaStirng);

        String namaLengkap = namaDepan;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("ASI"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(1,4));
        System.out.println(namaLengkap.replace("A","H"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(2));

    }
}
