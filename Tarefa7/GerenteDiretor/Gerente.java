public class Gerente extends Funcionario {
    private Funcionario[] equipe;

    public Gerente(String nome, Funcionario[] equipe) throws EquipeInsuficienteException {
        super(nome);
        setEquipe(equipe);
    }

    public void setEquipe(Funcionario[] equipe) throws EquipeInsuficienteException {
        if (equipe == null || equipe.length < 5) {
            throw new EquipeInsuficienteException("Gerente deve ter equipe de no mínimo 5 pessoas.");
        }
        this.equipe = equipe;
    }
}