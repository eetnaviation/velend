package eetnaviation.velend.guiApp.setup;

import java.util.Objects;

public class download {
    public static void downloadZip(String version){
        String appdataDir = System.getenv("APPDATA");
        String modsDir = appdataDir + "\\.minecraft\\mods";
        System.out.println("Found user appdata directory! " + appdataDir);
        System.out.println("Compiled mods directory! " + modsDir);
        if (Objects.equals(version, "31b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/3.1b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "40b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v4.0b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "50b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.0b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "51b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.1b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "52b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.2b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "611")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v6.1.1b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "71b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v7.1b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "80b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/v8.0b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "30a")) {
            installMods.Main("https://drive.google.com/file/d/1eFtzd-APRuO-fe3haiKqdt9qTlc9iUzC/view?usp=sharing", modsDir);
        }
        else if (Objects.equals(version, "10b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/beta/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "20b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/1.19.3/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "201b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/2.0.1b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "21b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/2.1b/mods.zip", modsDir);
        }
        else if (Objects.equals(version, "30b")) {
            installMods.Main("https://github.com/KEVINIIE123/MKalamod/releases/download/3.0b/mods.zip", modsDir);
        }
    }
}
