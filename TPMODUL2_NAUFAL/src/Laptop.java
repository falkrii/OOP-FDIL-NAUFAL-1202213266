public class Laptop  extends Perangkat{
    protected boolean webcam;
    public Laptop(String drive, int ram, float procesor, boolean webcam){
        super(drive, ram, procesor);
        this.webcam = webcam;
    }
    public void information(){
        String maka;
        if (webcam == true){
            maka = "memiliki Webcam.";
        }
        else{
            maka = "ltidak memiliki Webcam.";
        }
        System.out.print("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu laptop ini juga "+maka);
    }
    public void buka_game(String nama_game){
        System.out.print("Laptop berhasi membuka game "+nama_game);
    }
    public void kirimemail(String email){
        System.out.print("Laptop berhasil mengirim email ke "+email);
    }
    public void kirimemail(String email1, String email2){
        System.out.print("Laptop berhasil mengirim email ke "+email1+" dan ke "+email2+"\n");
    }
}
