package MochilaDinamica;



public class  ObjetoMochila {
	  
    private int peso;
    private int beneficio;
    private int id;
 
    public ObjetoMochila( int peso, int beneficio) {
        this.peso = peso;
        this.beneficio = beneficio;
    }

	public int getPeso() {
        return peso;
    }
 
    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public int getBeneficio() {
        return beneficio;
    }
 
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
 
    @Override
    public String toString(){
        return "Peso:"+peso+", Beneficio:"+beneficio;
    }
     
     
}