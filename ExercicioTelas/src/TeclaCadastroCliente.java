import classes.Clientes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeclaCadastroCliente {
    public JPanel jpcliente;
    private JTextField textCPF;
    private JTextField textTelefone;
    private JTextField textEmail;
    private JTextField textNome;
    private JTextField textEndereco;
    private JButton btnGravar;


    public TeclaCadastroCliente() {
        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                String cpf = textCPF.getText();
                String email = textEmail.getText();
                String telefone = textTelefone.getText();
                String endereco = textEndereco.getText();

                Clientes cli1 = new Clientes();
                cli1.setNome(nome);
                cli1.setCpf(cpf);
                cli1.setEmail(email);
                cli1.setEndereco(endereco);
                cli1.setTelefone(telefone);

                JOptionPane.showMessageDialog(null,
                                "Nome "+"\n"+cli1.getNome()+"\n"+
                                "Cpf "+"\n"+cli1.getCpf()+"\n"+
                                "Email "+"\n"+cli1.getEmail()+"\n"+
                                "Telefone "+"\n"+cli1.getTelefone()+"\n"+
                                "Endereço "+"\n"+cli1.getEndereco());
            }
        });
        }
}

