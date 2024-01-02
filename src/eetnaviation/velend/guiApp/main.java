package velend.guiApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

class gui {
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("velend");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output


        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Mkalamod");
        JMenu m2 = new JMenu("ABOUT");
        mb.add(m1);
        mb.add(m2);

        JMenuItem m11 = new JMenuItem(new AbstractAction("1.19.4 - STABLE - v5.2b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v5.2b\n");
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.2b/mods.zip").toURI());
                } catch (Exception e1) {}
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
            }
        });
        JMenuItem m12 = new JMenuItem(new AbstractAction("1.20.1 - STABLE - v6.1.1") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v6.1.1\n");
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/KEVINIIE123/MKalamod/releases/download/v6.1.1b/mods.zip").toURI());
                } catch (Exception e1) {}
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("Sodium is not included\n");
                ta.append("--------------------------------\n");
            }
        });
        JMenuItem m13 = new JMenuItem(new AbstractAction("1.20.2 - STABLE - v7.1b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v7.1b\n");
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/KEVINIIE123/MKalamod/releases/download/v7.1b/mods.zip").toURI());
                } catch (Exception e1) {}
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
            }
        });
        JMenuItem m14 = new JMenuItem(new AbstractAction("1.20.4 - DEV - v8.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v8.0b\n");
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/KEVINIIE123/MKalamod/releases/download/v8.0b/mods.zip").toURI());
                } catch (Exception e1) {}
                ta.append("Patch notes:\n");
                ta.append("--NO PATCHNOTES PROVIDED--\n");
                ta.append("\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
            }
        });
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}