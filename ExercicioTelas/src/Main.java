import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame t = new JFrame("TelaPrincipal");
        t.setContentPane(new TelaPrincipal().panelPrincipal );
        t.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        t.pack();
        t.setResizable(false);
        t.setSize(500,500);
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }
}