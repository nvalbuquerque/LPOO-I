public class Diretor extends Funcionario {
    private String[] departamentos;

    public Diretor(String nome, String[] departamentos) throws EquipeInsuficienteException {
        super(nome);
        setDepartamentos(departamentos);
    }

    public void setDepartamentos(String[] departamentos) throws EquipeInsuficienteException {
        if (departamentos == null || departamentos.length < 2) {
            throw new EquipeInsuficienteException("Diretor deve dirigir no mínimo 2 departamentos.");
        }
        this.departamentos = departamentos;
    }
}