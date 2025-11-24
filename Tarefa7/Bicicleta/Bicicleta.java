public class Bicicleta {
    private int cadencia;
    private int velocidade;
    private int marcha;

    public Bicicleta(int cadencia, int velocidade, int marcha) throws BicicletaException {
        setRPM(cadencia);
        setVelocidade(velocidade);
        setMarcha(marcha);
    }

    public void setRPM(int novoValor) throws BicicletaException {
        if (novoValor < 0) {
            throw new BicicletaException("RPM não pode ser negativo.");
        }
        this.cadencia = novoValor;
    }

    public void setVelocidade(int novaVelocidade) throws BicicletaException {
        if (novaVelocidade < 0 || novaVelocidade > 100) {
            throw new BicicletaException("Velocidade inválida (0 a 100 km/h).");
        }
        this.velocidade = novaVelocidade;
    }

    public void setMarcha(int novaMarcha) throws BicicletaException {
        if (novaMarcha < 0 || novaMarcha > 24) {
            throw new BicicletaException("Marcha inválida (0 a 24).");
        }
        this.marcha = novaMarcha;
    }

    public void printStates() {
        System.out.println("Cadencia=" + cadencia + " Velocidade=" + velocidade + " Marcha=" + marcha);
    }
}