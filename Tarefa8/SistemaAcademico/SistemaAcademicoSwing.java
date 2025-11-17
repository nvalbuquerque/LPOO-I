package alunos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaAcademicoSwing extends JFrame {
    private Aluno[] alunos;
    private int quantidadeAlunos;
    private int maximoAlunos = 50;
    
    private JTextField txtNome, txtMatricula, txtCurso, txtPeriodo, txtIdade, txtEndereco, txtDiscPermitidas;
    private JButton btnCadastrar, btnLimpar, btnListar;
    private JTextArea textAreaResultado;

    public SistemaAcademicoSwing() {
        inicializarDados();
        configurarJanela();
        criarComponentes();
        pack();
        setLocationRelativeTo(null); // Centralizar na tela
    }

    private void inicializarDados() {
        alunos = new Aluno[maximoAlunos];
        quantidadeAlunos = 0;
    }

    private void configurarJanela() {
        setTitle("Sistema Acadêmico - Cadastro de Alunos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 500));
        setLayout(new BorderLayout());
    }

    private void criarComponentes() {
        JPanel panelPrincipal = new JPanel(new BorderLayout(10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JPanel panelFormulario = new JPanel(new GridLayout(7, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Dados do Aluno"));
        
        txtNome = new JTextField(20);
        txtMatricula = new JTextField(20);
        txtCurso = new JTextField(20);
        txtPeriodo = new JTextField(20);
        txtIdade = new JTextField(20);
        txtEndereco = new JTextField(20);
        txtDiscPermitidas = new JTextField(20);
        
        panelFormulario.add(new JLabel("Nome:"));
        panelFormulario.add(txtNome);
        panelFormulario.add(new JLabel("Matrícula:"));
        panelFormulario.add(txtMatricula);
        panelFormulario.add(new JLabel("Curso:"));
        panelFormulario.add(txtCurso);
        panelFormulario.add(new JLabel("Período:"));
        panelFormulario.add(txtPeriodo);
        panelFormulario.add(new JLabel("Idade:"));
        panelFormulario.add(txtIdade);
        panelFormulario.add(new JLabel("Endereço:"));
        panelFormulario.add(txtEndereco);
        panelFormulario.add(new JLabel("Quantidade de disciplinas permitidas:"));
        panelFormulario.add(txtDiscPermitidas);
        
        JPanel panelBotoes = new JPanel(new FlowLayout());
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        btnListar = new JButton("Listar Alunos");
        
        panelBotoes.add(btnCadastrar);
        panelBotoes.add(btnLimpar);
        panelBotoes.add(btnListar);
        
        textAreaResultado = new JTextArea(10, 50);
        textAreaResultado.setEditable(false);
        JScrollPane scrollResultado = new JScrollPane(textAreaResultado);
        scrollResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));
        
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarAluno();
            }
        });
        
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparFormulario();
            }
        });
        
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarAlunos();
            }
        });
        
        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);
        panelPrincipal.add(panelBotoes, BorderLayout.CENTER);
        panelPrincipal.add(scrollResultado, BorderLayout.SOUTH);
        
        add(panelPrincipal);
    }

    private void cadastrarAluno() {
        try {
            if (txtNome.getText().trim().isEmpty() ||
                txtMatricula.getText().trim().isEmpty() ||
                txtCurso.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Preencha todos os campos obrigatórios!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (quantidadeAlunos >= maximoAlunos) {
                JOptionPane.showMessageDialog(this, 
                    "Limite máximo de alunos atingido!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String nome = txtNome.getText().trim();
            String matricula = txtMatricula.getText().trim();
            String curso = txtCurso.getText().trim();
            int periodo = Integer.parseInt(txtPeriodo.getText().trim());
            int idade = Integer.parseInt(txtIdade.getText().trim());
            String endereco = txtEndereco.getText().trim();
            int discPermitidas = Integer.parseInt(txtDiscPermitidas.getText().trim());
            
            for (int i = 0; i < quantidadeAlunos; i++) {
                if (alunos[i].getMatricula().equalsIgnoreCase(matricula)) {
                    JOptionPane.showMessageDialog(this, 
                        "Já existe um aluno com esta matrícula!", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            Aluno novoAluno = new Aluno(nome, matricula, curso, periodo, idade, endereco, discPermitidas);
            alunos[quantidadeAlunos] = novoAluno;
            quantidadeAlunos++;
            
            String mensagem = "Aluno cadastrado com sucesso!\n" +
                             "Nome: " + nome + "\n" +
                             "Matrícula: " + matricula + "\n" +
                             "Curso: " + curso + "\n" +
                             "Total de alunos: " + quantidadeAlunos;
            
            textAreaResultado.setText(mensagem);
            limparFormulario();
            
            JOptionPane.showMessageDialog(this, 
                "Aluno cadastrado com sucesso!", 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Erro nos campos numéricos! Verifique período, idade e disciplinas permitidas.", 
                "Erro de Formato", 
                JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao cadastrar aluno: " + ex.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparFormulario() {
        txtNome.setText("");
        txtMatricula.setText("");
        txtCurso.setText("");
        txtPeriodo.setText("");
        txtIdade.setText("");
        txtEndereco.setText("");
        txtDiscPermitidas.setText("");
        txtNome.requestFocus();
    }

    private void listarAlunos() {
        if (quantidadeAlunos == 0) {
            textAreaResultado.setText("Nenhum aluno cadastrado no sistema.");
            return;
        }
        
        StringBuilder lista = new StringBuilder();
        lista.append("=== LISTA DE ALUNOS CADASTRADOS ===\n\n");
        lista.append("Total de alunos: ").append(quantidadeAlunos).append("\n\n");
        
        for (int i = 0; i < quantidadeAlunos; i++) {
            Aluno aluno = alunos[i];
            lista.append("Aluno #").append(i + 1).append(":\n");
            lista.append("  Nome: ").append(aluno.getNome()).append("\n");
            lista.append("  Matrícula: ").append(aluno.getMatricula()).append("\n");
            lista.append("  Curso: ").append(aluno.getCurso()).append("\n");
            lista.append("  Período: ").append(aluno.getPeriodo()).append("\n");
            lista.append("  Idade: ").append(aluno.getIdade()).append("\n");
            lista.append("  Quantidade de disciplinas matriculadas: ").append(aluno.getContadorDisciplinasMatriculadas())
                 .append("/").append(aluno.getQuantidadeDisciplinasPermitidas()).append("\n");
            lista.append("  -------------------------\n");
        }
        
        textAreaResultado.setText(lista.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SistemaAcademicoSwing tela = new SistemaAcademicoSwing();
            tela.setVisible(true);
        });
    }
}