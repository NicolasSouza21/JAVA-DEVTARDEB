import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContainerComponentes extends JFrame {
    public ContainerComponentes() {
        super("Janela Principal");
        //adicionar outro container
        JPanel painel1 = new JPanel();
        this.getContentPane().add(painel1);
        //adicionar componentes no painel
        painel1.add (new JLabel("Informe um número"));
        JTextField campo1 = new JTextField(25);
        painel1.add(campo1);
        JButton botao1 = new JButton("Enviar");
        botao1.addActionListener(e->{
            int nB = Integer.parseInt(campo1.getText() , ABORT);
            for (int i = 0; i < nB; i++) {
                painel1.add( new JButton (""+i));

                
            }
            this.pack();
        });
        painel1.add(botao1);
        //set
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);





        
    }
    
}
