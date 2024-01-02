package eetnaviation.velend.guiApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import eetnaviation.velend.guiApp.setup.download;

//TODO: Add https://fabricmc.net/wiki/install functions to install fabric via cli

public class main {
    private static JTextArea ta = new JTextArea();
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("velend");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(780, 780);

        // Text Area at the Center
        ta.setEditable(false);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output


        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("MKALAMOD");
        JMenu m2 = new JMenu("MKALAMOD - LEGACY");
        JMenu m3 = new JMenu("MKALAMOD - LIMBO");
        JMenu m4 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);

        JMenuItem m41 = new JMenuItem(new AbstractAction("MKalamod") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("HELP > MKALAMOD\n");
                ta.append("Mkalamod is an utility minecraft modpack made by kevinkald.\n");
                ta.append("Discord: https://discord.gg/dkJDcMDz6T\n");
                ta.append("What are legacy versions?\n");
                ta.append("Legacy versions are the versions that are only in the update\n");
                ta.append("What are limbo versions?\n");
                ta.append("Limbo versions are not new stable versions and not old legacy versions.\n");
                ta.append("channel of the discord server\n");
                ta.append("--------------------------------\n");
            }
        });
        JMenuItem m42 = new JMenuItem(new AbstractAction("velend") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("HELP > velend\n");
                ta.append("Running velend v1.1\n");
                ta.append("velend is an open-source downloader (And soon installer!) for mkalamod.\n");
                ta.append("Made by eetnaviation.\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m31 = new JMenuItem(new AbstractAction("1.19.3 - v3.1b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v3.1b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("31b");
                ta.append("Patch notes:\n");
                ta.append("DO NOT USE, UNSTABLE, BAD\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
            }
        });
        JMenuItem m32 = new JMenuItem(new AbstractAction("1.19.3 - v4.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v4.0b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("40b");
                ta.append("Patch notes:\n");
                ta.append("DO NOT USE, UNSTABLE, BAD\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m33 = new JMenuItem(new AbstractAction("1.19.3 - v5.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v5.0b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("50b");
                ta.append("Patch notes:\n");
                ta.append("Might be buggy.\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m34 = new JMenuItem(new AbstractAction("1.19.3 - v5.1b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v5.1b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("51b");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES-\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m11 = new JMenuItem(new AbstractAction("1.19.4 - STABLE - v5.2b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v5.2b\n");
                download.downloadZip("52b");
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
            }
        });
        JMenuItem m12 = new JMenuItem(new AbstractAction("1.20.1 - STABLE - v6.1.1") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v6.1.1\n");
                download.downloadZip("611");
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("Sodium is not included\n");
                ta.append("--------------------------------\n");
            }
        });
        JMenuItem m13 = new JMenuItem(new AbstractAction("1.20.2 - STABLE - v7.1b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v7.1b\n");
                download.downloadZip("71b");
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
            }
        });
        JMenuItem m14 = new JMenuItem(new AbstractAction("1.20.4 - DEV - v8.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v8.0b\n");
                download.downloadZip("80b");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES PROVIDED--\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m21 = new JMenuItem(new AbstractAction("1.19.2 - v3.0a") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v3.0a\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("30a");
                ta.append("Patch notes:\n");
                ta.append("- Added Banana+ (version 100)\n" +
                        "- Added Meteor Crash Addon 0.6\n" +
                        "- Added MeteorPlus 1.1\n" +
                        "- Added Notification Addon 1.1.0\n" +
                        "- Added Tanuki 0.1\n" +
                        "- Added Vector Addon 0.3.7\n" +
                        "- Added Reaper Addon 0.1\n" +
                        "- Added Bidoof 1.3.1\n" +
                        "- Added Meteor-Utils 1.0\n" +
                        "- Added Meteorist 1.4\n" +
                        "- Updated Meteor Village Roller to 1.3.4\n" +
                        "- Updated Meteor client to 0.5.1 (1697)\n" +
                        "- Updated Meteor Rejects to 0.1\n" +
                        "- Updated Orion to 0.1\n" +
                        "- Updated HIG Tools to 2.1\n" +
                        "- Updated Numby Hack to 1.8\n" +
                        "- Updated MeteorAdditions to 1.2.0\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("INFO:\n");
                ta.append("Due to so many additions the HUD is full, so it is\n");
                ta.append("recommended to change the Scale in the GUI options.\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("No known bugs\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m22 = new JMenuItem(new AbstractAction("1.19.3 - v1.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v1.0b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("10b");
                ta.append("Patch notes:\n");
                ta.append("- Updated Cull Leaves from v3.0.0 to v3.0.1\n" +
                        "- Updated Effective from v1.4 to v1.6\n" +
                        "- Updated Fabric Language Kotlin from v1.8.6 to v1.8.7\n" +
                        "- Updated Farsight from v2.1 to v2.4\n" +
                        "- Updated Iris from v1.4.0 to v1.4.3\n" +
                        "- Updated Journeymap from v5.9.0beta2 to v5.9.0beta3\n" +
                        "- Updated JEI from v11.4.0.285 to v11.4.0.287\n" +
                        "- Updated Meteor Client from v0.5.1-1697 to v0.5.1-1698\n" +
                        "- Updated Mod Menu from v4.1.0 to v4.1.1\n" +
                        "- Updated SeedcrackerX from v2.13 to v2.13.1\n" +
                        "- Updated Stendhal from v1.3.3 to v1.3.4\n" +
                        "- Removed Girlboss (beacause it wasn't working) (forgot to remove :skull: )\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("INFO:\n");
                ta.append("Due to so many additions the HUD is full, so it is\n");
                ta.append("recommended to change the Scale in the GUI options.\n");
                ta.append("At the start click continue without support\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("No known bugs\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m23 = new JMenuItem(new AbstractAction("1.19.3 - v2.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v2.0b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("20b");
                ta.append("Patch notes:\n");
                ta.append("https://pastebin.com/T6KLq7gD\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("INFO:\n");
                ta.append("Better performance\n");
                ta.append("At the start click continue without support\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("No known bugs\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m24 = new JMenuItem(new AbstractAction("1.19.3 - v2.0.1b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v2.0.1b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("201b");
                ta.append("Patch notes:\n");
                ta.append("- Updated Meteor Client from v0.5.2-1733 to v0.5.2-1737\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("INFO:\n");
                ta.append("At the start click continue without support\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("No known bugs\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m25 = new JMenuItem(new AbstractAction("1.19.3 - v2.1b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v2.1b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("21b");
                ta.append("Patch notes:\n");
                ta.append("- Added Sodium Extra\n" +
                        "- Added Reese's Sodium Options\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("INFO:\n");
                ta.append("At the start click continue without support\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("No known bugs\n");
                ta.append("--------------------------------\n");
            }
        });

        JMenuItem m26 = new JMenuItem(new AbstractAction("1.19.3 - v3.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v3.0b\n");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                download.downloadZip("30b");
                ta.append("Patch notes:\n");
                ta.append("- Added Borderless Mining\n" +
                        "- Added Debugify\n" +
                        "- Added Dynamic FPS\n" +
                        "- Added EntityCulling\n" +
                        "- Added Fabrishot\n" +
                        "- Added FerriteCore\n" +
                        "- Added Krypton\n" +
                        "- Added Memory Leak Fix\n" +
                        "- Added Meteor Rejects\n" +
                        "- Added Model Gap Fix\n" +
                        "- Added TrouserStreak\n" +
                        "- Added Very Many Players\n" +
                        "- Updated BetterF3\n" +
                        "- Updated EnchantmentDescriptions\n" +
                        "- Updated Meteor Client\n" +
                        "- Updated Presence Footsteps\n" +
                        "- Removed Journeymap (bugs)\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("INFO:\n");
                ta.append("At the start click continue without support\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("No known bugs\n");
                ta.append("--------------------------------\n");
            }
        });

        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.add(m24);
        m2.add(m25);
        m2.add(m26);
        m3.add(m31);
        m3.add(m32);
        m3.add(m33);
        m3.add(m34);
        m4.add(m41);
        m4.add(m42);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }

    public static void installDone() {
        ta.append("INSTALLATION FOR MKALAMOD COMPLETED\n");
    }
}