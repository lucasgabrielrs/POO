import classes.Pet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Period;

public class TelaCadastroPet {
    public JPanel jppet;
    private JTextField textApelido;
    private JTextField textCor;
    private JTextField textRaca;
    private JTextField textPorte;
    private JTextField textNomeDono;
    private JButton btnGravar;

    public TelaCadastroPet() {
        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String apelido = textApelido.getText();
                String cor = textCor.getText();
                String raca = textRaca.getText();
                String porte = textPorte.getText();
                String nomeDono = textNomeDono.getText();

                Pet pet1 = new Pet();
                pet1.setApelido(apelido);
                pet1.setCor(cor);
                pet1.setRaca(raca);
                pet1.setPorte(porte);
                pet1.setNomeDono(nomeDono);

                JOptionPane.showMessageDialog(null,
                        "Apelido "+"\n"+pet1.getApelido()+"\n"+
                                "Cor "+"\n"+pet1.getCor()+"\n"+
                                "Raca "+"\n"+pet1.getRaca()+"\n"+
                                "Porte "+"\n"+pet1.getPorte()+"\n"+
                                "Nome do dono "+"\n"+pet1.getNomeDono());
            }
        });
    }
}
