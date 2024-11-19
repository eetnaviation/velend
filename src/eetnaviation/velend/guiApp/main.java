package eetnaviation.velend.guiApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Properties;

import eetnaviation.velend.guiApp.setup.download;

//TODO: Add https://fabricmc.net/wiki/install functions to install fabric via cli

public class main {
    private static String velendVersion = "N/A";

    static String fabricInstall = "false";

    private static JTextArea ta = new JTextArea();
    public static void main(String[] args) {

        //Load the config file
        try {
            String configFilePath = "src/config.properties";
            FileInputStream propsInput = new FileInputStream(configFilePath);
            Properties prop = new Properties();
            prop.load(propsInput);

            velendVersion = prop.getProperty("VERSION");
        } catch (IOException ignored) {

        }


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
        JMenu m5 = new JMenu("Options");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        JCheckBoxMenuItem m51 = new JCheckBoxMenuItem(new AbstractAction("INSTALL FABRIC") {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(fabricInstall) {
                    case "true":
                        fabricInstall = "false";
                        System.out.println("Fabric install false");
                        break;
                    case "false":
                        fabricInstall = "true";
                        System.out.println("Fabric install true");
                        break;
                }
            }
        });

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
                ta.append("Legacy versions are the versions that are only in the discord server.\n");
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
                ta.append("Running velend " + velendVersion + "\n");
                ta.append("velend is an open-source downloader and installer (altough you have to install fabric yourself at this time) for mkalamod.\n");
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
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("DO NOT USE, UNSTABLE, BAD\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
                download.downloadZip("31b", fabricInstall);
            }
        });
        JMenuItem m32 = new JMenuItem(new AbstractAction("1.19.3 - v4.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v4.0b\n");
                ta.append("");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                ta.append("Patch notes:\n");
                ta.append("DO NOT USE, UNSTABLE, BAD\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
                download.downloadZip("40b", fabricInstall);
            }
        });

        JMenuItem m33 = new JMenuItem(new AbstractAction("1.19.3 - v5.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod LEGACY v5.0b\n");
                ta.append("");
                ta.append("WARNING! This is a legacy build: ABSOLUTELY NO SUPPORT\n");
                ta.append("Patch notes:\n");
                ta.append("Might be buggy.\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
                download.downloadZip("50b", fabricInstall);
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
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES-\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
                download.downloadZip("51b", fabricInstall);
            }
        });

        JMenuItem m35 = new JMenuItem(new AbstractAction("1.20.2 - v7.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v7.0b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES-\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
                download.downloadZip("70b", fabricInstall);
            }
        });

        JMenuItem m36 = new JMenuItem(new AbstractAction("1.20.1 - v6.1b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v6.1b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES-\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
                download.downloadZip("61b", fabricInstall);
            }
        });

        JMenuItem m37 = new JMenuItem(new AbstractAction("1.20.1 - v6.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v6.0b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES-\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("--------------------------------\n");
                download.downloadZip("60b", fabricInstall);
            }
        });

        JMenuItem m11 = new JMenuItem(new AbstractAction("1.19.4 - STABLE - v5.2b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v5.2b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
                download.downloadZip("52b", fabricInstall);
            }
        });
        JMenuItem m12 = new JMenuItem(new AbstractAction("1.20.1 - STABLE - v6.1.1") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v6.1.1\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("Sodium is not included\n");
                ta.append("--------------------------------\n");
                download.downloadZip("611", fabricInstall);
            }
        });
        JMenuItem m13 = new JMenuItem(new AbstractAction("1.20.2 - STABLE - v7.1b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v7.1b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("USE AT OWN RISK - NO SUPPORT\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
                download.downloadZip("71b", fabricInstall);
            }
        });
        JMenuItem m14 = new JMenuItem(new AbstractAction("1.20.4 - DEV - v8.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v8.0b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES PROVIDED--\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
                download.downloadZip("80b", fabricInstall);
            }
        });

        JMenuItem m15 = new JMenuItem(new AbstractAction("1.21 - STABLE - v9.0b") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v9.0b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES PROVIDED--\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
                download.downloadZip("90b", fabricInstall);
            }
        });

        JMenuItem m18 = new JMenuItem(new AbstractAction("1.21.3 - DEV - v10.0a") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v10.0a\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("THIS IS AN ALPHA RELEASE! THINGS MIGHT NOT WORK PROPERLY AND SOME MODS ARE MISSING! GAME MAY BE UNSTABLE!!!\n" +
                        "\n" +
                        "Mods:\n" +
                        "\n" +
                        "3d-Skin-Layers [1.7.2]\n" +
                        "AppleSkin [3.0.6+mc1.21.3]\n" +
                        "Baritone [1.21.3-SNAPSHOT]\n" +
                        "BetterF3 [12.0.0]\n" +
                        "Bobby [5.2.5+mc1.21.2]\n" +
                        "Concurrent Chunk Management Engine [0.3.0+beta.2.0+1.21.3]\n" +
                        "EntityCulling [1.7.1]\n" +
                        "Fabric API [0.109.0+1.21.3]\n" +
                        "Fabric Language Kotlin [1.12.3+kotlin.2.0.21]\n" +
                        "Falling Leaves [1.16.3]\n" +
                        "ImmediatelyFast [1.3.2+1.21.3]\n" +
                        "Iris [1.8.0+mc1.21.3]\n" +
                        "Jade [16.0.4+fabric]\n" +
                        "Ksyxis [1.3.2]\n" +
                        "Meteor Client [0.5.9-2203]\n" +
                        "Meteor Villager Roller [1.4.9+mc1.21.3-rev.5443bc0-dirty]\n" +
                        "Mod Menu [12.0.0-beta.1]\n" +
                        "Mouse Tweaks [2.27]\n" +
                        "No Chat Reports [1.21.3-v2.10.1]\n" +
                        "OptiGUI [2.3.0-beta.6+1.21.2]\n" +
                        "Physics Mod [3.0.21]\n" +
                        "Reese's Sodium Options [1.8.0+mc1.21.3]\n" +
                        "Replay Mod [1.21.2-2.6.20]\n" +
                        "Sodium [0.6.0+mc1.21.3]\n" +
                        "Sodium Extra [0.6.0+mc1.21.3]\n" +
                        "Very Many Players [0.2.0+beta.7.180+1.21.3]\n" +
                        "ViaFabricPlus [3.5.2]\n" +
                        "Xaero's Minimap [24.6.2]\n" +
                        "Xaero's World Map [1.39.1]\n" +
                        "XaeroPlus [2.24.5]\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("- No bugs reported\n");
                ta.append("--------------------------------\n");
                download.downloadZip("100a", fabricInstall);
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
                ta.append("");
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
                download.downloadZip("30a", fabricInstall);
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
                ta.append("");
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
                download.downloadZip("10b", fabricInstall);
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
                ta.append("");
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
                download.downloadZip("20b", fabricInstall);
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
                ta.append("");
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
                download.downloadZip("201b", fabricInstall);
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
                ta.append("");
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
                download.downloadZip("21b", fabricInstall);
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
                ta.append("");
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
                download.downloadZip("30b", fabricInstall);
            }
        });
        JMenuItem m16 = new JMenuItem(new AbstractAction("1.20.4 - DEV - v8.1b") {
        	@Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v8.1b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("--NO PATCH NOTES PROVIDED--\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
                download.downloadZip("81b", fabricInstall);
            }
        });
        JMenuItem m17 = new JMenuItem(new AbstractAction("1.20.4 - STABLE - v8.2b") {
        	@Override
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
                ta.append("--------------------------------\n");
                ta.append("Downloading MKalamod v8.2b\n");
                ta.append("");
                ta.append("Patch notes:\n");
                ta.append("Baritone is a bit buggy!\n");
                ta.append("\n");
                ta.append("Bug notes:\n");
                ta.append("When using storage esp do not use shader rendering\n");
                ta.append("in sodium. Doing so will crash the game\n");
                ta.append("--------------------------------\n");
                download.downloadZip("82b", fabricInstall);
            }
        });

        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m18);
        m1.add(m17);
        m1.add(m15);
        m1.add(m16);
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
        m3.add(m35);
        m3.add(m36);
        m3.add(m37);
        m4.add(m41);
        m4.add(m42);
        m5.add(m51);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }

    public static void installDone() {
        ta.append("INSTALLATION FOR MKALAMOD COMPLETED\n");
    }
    
    public static void returnErrorMessage(String errorMessage) {
    	ta.append("Installation stopped, returned the following error message: " + errorMessage);
    }
}