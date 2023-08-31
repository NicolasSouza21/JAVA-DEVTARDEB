import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;


public class JFrameComponentes extends JFrame {
    public JFrameComponentes() {
        super("Janela Principal");
        this.setBounds(500, 250, 500, 500);
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        for (int i = 0; i < 6; i++) {
            this.add(new JButton(""+i));
            
        }
        this.setDefaultCloseOperation(2);
        this.setVisible(true);

    }
    
}
