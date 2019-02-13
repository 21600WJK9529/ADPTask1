package winston.me;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_M extends JFrame{
    private JTextArea txtDisplay;
    private JButton clickMe;
    private JPanel rootP;

    public GUI_M(){
        add(rootP);

        setTitle("Games for February 2019");
        setSize(480,300);
        clickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.append("March games 2019\n\n");
                txtDisplay.append("Dead or Alive 6 (PC, PS4, Xbox One) - March 1\n" +
                        "ToeJam & Earl: Back in the Groove (PC, Mac, Lin, Switch, Ps4, Xbox One) - March 1\n" +
                        "Left Alive (PS4, PC) – March 5\n" +
                        "Total War: Three Kingdoms (PC) – March 7\n" +
                        "Devil May Cry 5 (PS4, Xbox One, PC) – March 8\n" +
                        "Kirby's Epic Yarn (3DS) - March 8\n" +
                        "The Division 2 (PS4, Xbox One, PC) – March 15\n" +
                        "Super Robot Wars T (Switch, PS4) - March 20\n" +
                        "The Sinking City (PS4, Xbox One, PC) – March 21\n" +
                        "Sekiro: Shadows Die Twice (PS4, Xbox One, PC) – March 22\n" +
                        "Tropico 6 (PC, PS4, Xbox One) - March 29\n" +
                        "Yoshi's Crafted World (Nintendo Switch) - March 29\n\n");
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
