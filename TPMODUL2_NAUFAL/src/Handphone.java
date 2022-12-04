public class Handphone extends Perangkat {
    protected boolean fingerprint;
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive,ram,processor);
        this.fingerprint = fingerprint;
    }
    public void information(){
        String maka;
        if (fingerprint == true){
            maka = "memiliki fingerprint";
        }
        else{
            maka = "tidak memiliki fingerprint";
        }
        System.out.print("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan procesor secepat "+processor+" Ghz. Selain itu handphone ini "+maka);
    }
    public void telpon(int nohp){
        System.out.print("Handphone ini berhasil menyambung telfon ke No "+nohp);
    }
    public void kirimSMS(int nohp){
        System.out.print("Handphone ini berhasil mengirim SMS ke No "+nohp);
    }
    public void kirimSMS(int nomor1, int nomor2){
        System.out.print("Handphone ini berhasil mengirim SMS ke No "+nomor1+" dan ke No "+ nomor2+"\n");
    }
}
