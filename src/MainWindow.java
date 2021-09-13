import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    JButton goButton = new JButton("mehet:");

    public MainWindow(){
        
        this.add(goButton);
        this.goButton.addActionListener(
            event ->{
                System.out.print("aa");
                System.out.print("bb");
            }

        );
        this.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );
        this.setSize(300,250);
        
    }
}
