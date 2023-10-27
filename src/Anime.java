public class Anime {
    private String gen;
    Anime (String gen){
        this.gen = gen;
    }
    public String getGen(){
        return gen;
    }
    public void setGen(String gen){
        this.gen = gen;
    }
    @Override
    public String toString() {
        return "Anime{gen='" + gen + "'}";
    }
}
