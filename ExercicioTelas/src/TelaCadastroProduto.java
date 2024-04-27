import classes.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroProduto {
    public JPanel jpproduto;
    private JTextField textDesc;
    private JTextField textPreco;
    private JTextField textFornecedor;
    private JTextField textCor;
    private JTextField textMarca;
    private JButton btnGravar;

    public TelaCadastroProduto() {
        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String desc = textDesc.getText();
                float preco = Float.parseFloat(textPreco.getText());
                String fornecedor = textFornecedor.getText();
                String cor = textCor.getText();
                String marca = textMarca.getText();

                Produto prod1 = new Produto();
                prod1.setDesc(desc);
                prod1.setPreco(preco);
                prod1.setFornecedor(fornecedor);
                prod1.setCor(cor);
                prod1.setMarca(marca);


                JOptionPane.showMessageDialog(null,
                        "Descrição "+"\n"+prod1.getDesc()+"\n"+
                                "Preço "+"\n"+prod1.getPreco()+"\n"+
                                "Fornecedor "+"\n"+prod1.getFornecedor()+"\n"+
                                "Cor "+"\n"+prod1.getCor()+"\n"+
                                "Marca "+"\n"+prod1.getMarca());
            }
        });
    }
}
