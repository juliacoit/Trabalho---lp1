public class Personagem extends ObjetoBase {
    
    private int tempoDeVida;
    private int score = 0;
    
    public Personagem(String id) {
        super(id);
    };

    public int score() {
        return this.score; 
    };

    public int tempoDeVida() {
        return this.tempoDeVida; 
    };

    public void diminuirTempoDeVida() {
        this.tempoDeVida -=1;
    };

    public void resetarTudo() {
        this.score = 0;
        this.tempoDeVida = this.tempoDeVida();
        

    };

    public void resetarTempoDeVida() {
        this.tempoDeVida = this.tempoDeVida();
        this.score +=1; 
    };

    public boolean estaVivo() {
        if(this.tempoDeVida > 0) {
            return true;
        } else {
            reuturn fase 
        }
    }

    public String toString() {
    }


}