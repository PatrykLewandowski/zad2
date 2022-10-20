import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import  javax.swing.JTextArea;
import javax.swing.JLabel;

public class Okno extends JFrame {

    JButton field1;
    JButton field2;
    JLabel field3;
    JTextArea field4;

    public Okno(){
        GridLayout gl = new GridLayout(2,2);
        this.setLayout(gl);
        field1 = new JButton("Kliknij Tutaj!");
        field2 = new JButton("A Może tutaj!");
        field3 = new JLabel("3");
        field4 = new JTextArea("");
        this.add(field1);
        this.add(field2);
        this.add(field3);
        this.add(field4);

    }
}
