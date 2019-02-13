package winston.me;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_G extends JFrame{
    private JTextArea txtDisplay;
    private JButton clickMe;
    private JPanel rootPanel;

    public GUI_G(){
        add(rootPanel);

        setTitle("Games for February 2019");
        setSize(325,200);
        clickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.append("February games 2019");
                txtDisplay.append("Wargroove (Switch) – February 1.\n" +
                        "\tEtrian Odyssey: Nexus (3DS) – February 5.\n" +
                        "\tGod Eater 3 (PS4, PC) – February 8.\n" +
                        "\tCrackdown 3 (Xbox One, PC) – February 15.\n" +
                        "\tMetro Exodus (PS4, Xbox One, PC) – February 15.\n" +
                        "\tFar Cry: New Dawn (PS4, Xbox One, PC) – February 15.\n" +
                        "\tAnthem (PS4, Xbox One, PC) – February 22\n");
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
