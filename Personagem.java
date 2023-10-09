public class Personagem extends ObjetoBase {
    
    private int tempoDeVida = 5;
    private int score = 0;
     
    public Personagem() {
        super(id = "...");
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
        if(tempoDeVida >= 5) {
            return ❤️;
        } else if (tempoDeVida == 4) {
            return 🧡;
        } else if (tempoDeVida == 3) {
            return 💛;
        } else if (tempoDeVida == 2) {
            return 🤍;
        } else if (tempoDeVida == 1) {
            return 🖤;
        } else if (tempoDeVida < 1){
            return 💔;
        }
    }
    
}