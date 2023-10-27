public class Sakura {
    private String specie;
    Sakura (String specie){
        this.specie = specie;
    }
    public String getSpecie(){
        return specie;
    }
    public void setSpecie(String specie){
        this.specie = specie;
    }
    @Override
    public String toString() {
        return "Sakura{specie='" + specie + "'}";
    }
}
