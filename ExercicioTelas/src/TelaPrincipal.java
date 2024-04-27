import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal {
    public JPanel panelPrincipal;
    private JMenu JM1;
    private JMenuItem m1;
    private JMenuItem m2;
    private JMenuItem m3;
    private JMenuItem m4;
    private JMenuItem m5;
    private JMenuBar JMB;
    private JMenu JM2;
    private JMenu JM3;
    private JMenu JM4;
    private JMenuItem sair;

    public TelaPrincipal() {

        m1.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("TelaClientes");
                t.setContentPane(new TeclaCadastroCliente().jpcliente);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });

        m2.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("TelaProduto");
                t.setContentPane(new TelaCadastroProduto().jpproduto);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });

        m3.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("TelaPet");
                t.setContentPane(new TelaCadastroPet().jppet);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });

        m4.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("TelaFuncionario");
                t.setContentPane(new TelaCadastroFuncionario().jpfuncionario);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });

        m5.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("TelaServicos");
                t.setContentPane(new TelaCadastroServicos().jpservicos);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });

        sair.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
}}
