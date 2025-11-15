package usuario;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaConversao extends javax.swing.JFrame {

    public TelaConversao() {
        initComponents();
        configurarEventos();
    }
    
    public void configurarEventos() {
        botaoConversao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                conversao();
            }
        });
    };
    
    public void conversao() {
        double litros = Double.parseDouble(caixaTextoLitros.getText());
        double galoes = litros / 3.785;
        resultado.setText(String.valueOf(galoes));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        volLitros = new javax.swing.JLabel();
        caixaTextoLitros = new javax.swing.JTextField();
        botaoConversao = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        volLitros.setText("Volume em litros:");

        botaoConversao.setText("Converter para galões");
        botaoConversao.addActionListener(this::botaoConversaoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConversao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volLitros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caixaTextoLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volLitros)
                    .addComponent(caixaTextoLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoConversao)
                .addGap(17, 17, 17)
                .addComponent(resultado)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void botaoConversaoActionPerformed(java.awt.event.ActionEvent evt) {                                               

    }                                              

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaConversao().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoConversao;
    private javax.swing.JTextField caixaTextoLitros;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel volLitros;
    // End of variables declaration                   
}
