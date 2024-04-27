import classes.Servicos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroServicos {
    public JPanel jpservicos;
    private JTextField textDesc;
    private JTextField textDuracao;
    private JTextField textFunResp;
    private JTextField textValor;
    private JTextField textPetAtende;
    private JButton btnGravar;

    public TelaCadastroServicos() {
        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String desc = textDesc.getText();
                float duracao = Float.parseFloat(textDuracao.getText());
                String funcResp = textFunResp.getText();
                float valor = Float.parseFloat(textValor.getText());
                String petAtende = textPetAtende.getText();

                Servicos serv1 = new Servicos();
                serv1.setDesc(desc);
                serv1.setDuracao(duracao);
                serv1.setFuncResp(funcResp);
                serv1.setValor(valor);
                serv1.setPetServico(petAtende);

                JOptionPane.showMessageDialog(null,
                        "Descrição "+"\n"+serv1.getDesc()+"\n"+
                                "Duração "+"\n"+serv1.getDuracao()+"\n"+
                                "Funcionário Responsável "+"\n"+serv1.getFuncResp()+"\n"+
                                "Valor "+"\n"+serv1.getValor()+"\n"+
                                "Pet que esse serviço atende "+"\n"+serv1.getPetServico());
            }
        });
    }
}
