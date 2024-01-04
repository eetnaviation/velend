package eetnaviation.velend.guiApp.setup;

import java.util.Objects;

public class download {
    public static void downloadZip(String version, String fabricInstallStatus){
        String appdataDir = System.getenv("APPDATA");
        String modsDir = appdataDir + "\\.minecraft\\mods";
        System.out.println("Found user appdata directory! " + appdataDir);
        System.out.println("Compiled mods directory! " + modsDir);
        String minecraftVersion = getVersion(version);
        if (Objects.equals(version, "31b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/3.1b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "40b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v4.0b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "50b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.0b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "51b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.1b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "52b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.2b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "611")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v6.1.1b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "71b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v7.1b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "80b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v8.0b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "30a")) {
            installMods.Main("https://drive.google.com/file/d/1eFtzd-APRuO-fe3haiKqdt9qTlc9iUzC/view?usp=sharing", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "10b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/beta/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "20b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/1.19.3/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "201b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/2.0.1b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "21b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/2.1b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "30b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/3.0b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "70b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v7.0b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "61b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v6.1b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
        else if (Objects.equals(version, "60b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v6.0b/mods.zip", modsDir, fabricInstallStatus, minecraftVersion);
        }
    }

    private static String getVersion(String mkalaVersion) {
        String mkalaVersionConverted = "";
        switch(mkalaVersion) {
            case "30b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "21b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "201b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "20b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "10b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "30a":
                mkalaVersionConverted = "1.19.2";
                break;
            case "80b":
                mkalaVersionConverted = "1.20.4";
                break;
            case "71b":
                mkalaVersionConverted = "1.20.2";
                break;
            case "611":
                mkalaVersionConverted = "1.20.1";
                break;
            case "52b":
                mkalaVersionConverted = "1.19.4";
                break;
            case "51b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "50b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "40b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "31b":
                mkalaVersionConverted = "1.19.3";
                break;
            case "70b":
                mkalaVersionConverted = "1.20.2";
                break;
            case "61b":
                mkalaVersionConverted = "1.20.1";
                break;
            case "60b":
                mkalaVersionConverted = "1.20.1";
                break;
        }
        return mkalaVersionConverted;
    }
}
