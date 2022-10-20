import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame ramka = new JFrame();
        JPanel okienko = new JPanel();

        okienko.setSize(100,100);
        ramka.add(okienko);
        okienko.getBorder();



        ramka.setVisible(true);


    }
}
