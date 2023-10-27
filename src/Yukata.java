public class Yukata {
    private String imprimeu;
    Yukata (String imprimeu){
        this.imprimeu = imprimeu;
    }
    public String getImprimeu(){
        return imprimeu;
    }
    public void setImprimeu(String imprimeu){
        this.imprimeu = imprimeu;
    }
    @Override
    public String toString() {
        return "Yukata{imprimeu='" + imprimeu + "'}";
    }
}
