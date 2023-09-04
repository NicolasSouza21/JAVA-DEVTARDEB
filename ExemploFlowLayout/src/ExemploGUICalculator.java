import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ExemploGUICalculator extends JFrame {
    String valores[] = {"7", "8", "9", "X", "6", "5", "4", "-", "3", "2", "1", "+" , "/" };

  
        public ExemploGUICalculator() {
            super("Calculadora");
            JPanel painel1 = new JPanel(new BorderLayout());
            this.add(painel1);
            // add texto ao norte
            painel1.add(new JTextArea(15, 2), BorderLayout.NORTH);
            JPanel painel2 = new JPanel(new GridLayout(4,4));
            //add painel2 ao center
            painel1.add(painel2,BorderLayout.CENTER);
            // preencher opainel2
            for (int i = 0; i < valores.length; i++) {
            
                painel2.add(new JButton(valores[i]));
            }
            





        }
    
    
}
