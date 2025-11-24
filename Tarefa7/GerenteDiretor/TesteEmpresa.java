public class TesteEmpresa {
    public static void main(String[] args) {
        // Teste Gerente
        try {
            Funcionario[] equipePequena = new Funcionario[3]; 
            Gerente g = new Gerente("Carlos", equipePequena);
        } catch (EquipeInsuficienteException e) {
            System.out.println("Erro ao criar Gerente: " + e.getMessage());
        }

        // Teste Diretor
        try {
            String[] depts = {"TI"}; 
            Diretor d = new Diretor("Ana", depts);
        } catch (EquipeInsuficienteException e) {
            System.out.println("Erro ao criar Diretor: " + e.getMessage());
        }
    }
}