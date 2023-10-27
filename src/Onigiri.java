public class Onigiri {
    private String umplutura;
    Onigiri (String umplutura){
        this.umplutura = umplutura;
    }
    public String getUmplutura(){
        return umplutura;
    }
    public void setUmplutura(String umplutura){
        this.umplutura = umplutura;
    }
    @Override
    public String toString() {
        return "Onigiri{umplutura='" + umplutura + "'}";
    }
}