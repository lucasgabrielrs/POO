import classes.Funcionario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroFuncionario {
    public JPanel jpfuncionario;
    private JTextField textTelefone;
    private JTextField textCargo;
    private JTextField textEmail;
    private JTextField textCfp;
    private JTextField textNome;
    private JButton btnGravar;

    public TelaCadastroFuncionario() {
        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                String cpf = textCfp.getText();
                String email = textEmail.getText();
                String cargo = textCargo.getText();
                String telefone = textTelefone.getText();

                Funcionario func1 = new Funcionario();
                func1.setNome(nome);
                func1.setCpf(cpf);
                func1.setEmail(email);
                func1.setTelefone(telefone);
                func1.setCargo(cargo);

                JOptionPane.showMessageDialog(null,
                        "Nome "+"\n"+func1.getNome()+"\n"+
                                "Cpf "+"\n"+func1.getCpf()+"\n"+
                                "Email "+"\n"+func1.getEmail()+"\n"+
                                "Telefone "+"\n"+func1.getTelefone()+"\n"+
                                "Cargo "+"\n"+func1.getCargo());
            }
        });
    }
}
