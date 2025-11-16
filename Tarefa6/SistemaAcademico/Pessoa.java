package alunos;

public abstract class Pessoa {
    private String nome;
    private String matricula;
    private int idade;
    private String endereco;
    
    public Pessoa(String nome, String matricula, int idade, String endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String inputNome) {
        this.nome = inputNome;
    }
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String inputMatricula) {
        this.matricula = inputMatricula;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int inputIdade) {
        this.idade = inputIdade;
    }

    public void setEndereco(String inputEndereco) {
        this.endereco = inputEndereco;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
}
