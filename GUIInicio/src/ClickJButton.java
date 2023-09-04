
import javax.swing.*;

public class ClickJButton extends JFrame {
    int cont;
    public ClickJButton() {
        super("Click");
        JPanel painel1 = new JPanel();
        //Criar componentes
        JButton botao1 = new JButton();
        painel1.add(botao1);
        JLabel text1 = new JLabel ("Nº de cliques");
        painel1.add(text1);
        this.getContentPane().add(painel1);
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
        
        

    }
    
}
