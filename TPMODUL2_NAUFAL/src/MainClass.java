public class MainClass {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("GTX", 16, 4.5f);
        perangkat.information();

        System.out.println();

        Handphone handphone = new Handphone("Intelco", 3, 1.7f, false);
        handphone.information();
        handphone.telpon(1234);
        handphone.kirimSMS(5678);
        handphone.kirimSMS(5678,1234);

        System.out.println();

        Laptop laptop = new Laptop("Intelco", 8, 3.4f, true);
        laptop.information();
        laptop.buka_game("Genshin");
        laptop.kirimemail("Hahaha.com");
        laptop.kirimemail("Bebas", "Aja");
    }
}