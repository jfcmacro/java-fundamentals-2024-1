public abstract class Carta {
    private FiguraCarta figura;
    private ValorCarta  valor;

    public Carta(FiguraCarta figura,
                 ValorCarta valor) {
        this.figura = figura;
        this.valor = valor;
    }
}
