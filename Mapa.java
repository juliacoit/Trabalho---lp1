class Mapa {
    private ObjetoBase mapa;
    private Personagem personagem;
    private int largura;
    private int altura;

    public Mapa(int largura, int altura) {
    
    }

    public ObjetoBase[][] mapa(){
        return mapaAlt[this.largura][this.altura]; 
    }

    public Personagem personagem() {
        return this.personagem; 
    }

    public void colocarObjeto(ObjetoBase objeto, int posicaoX, int posicaoY) {
        objeto.definirPosicao(posicaoX, posicaoY)
    }

    public void mostrarMapa() { 

    }

    public void moverOuInteragir(int x, int y) {

    }

    public void aleatorizarRejuvenescedor() {

    }

    public void moverPraCima() {

    }

    public void moverPraBaixo() {

    }

    public void moverPraEsquerda() {

    }

    public void moverPraDireita() {

    }

    public Mapa criarFase1(){

    }
}