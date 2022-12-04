public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;
    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void information(){
        System.out.print("Perangkat tidak diketahui ini memiliki drive tipe "+drive+
        " dengan ram sebesar "+ram+"GB dan processor secepat "+processor+ "Ghz.");
    }
}