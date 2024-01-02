package eetnaviation.velend.guiApp.setup;

import eetnaviation.velend.guiApp.setup.JGet;
import java.util.Objects;

public class download {
    public static void downloadZip(String version){
        if (Objects.equals(version, "31b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/3.1b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "40b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/v4.0b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "50b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.0b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "51b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.1b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "52b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/v5.2b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "611")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/v6.1.1b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "71b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/v7.1b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "80b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/v8.0b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "30a")) {
            JGet.main("https://drive.google.com/file/d/1eFtzd-APRuO-fe3haiKqdt9qTlc9iUzC/view?usp=sharing", "mods.zip");
        }
        else if (Objects.equals(version, "10b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/beta/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "20b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/1.19.3/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "201b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/2.0.1b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "21b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/2.1b/mods.zip", "mods.zip");
        }
        else if (Objects.equals(version, "30b")) {
            JGet.main("https://github.com/KEVINIIE123/MKalamod/releases/download/3.0b/mods.zip", "mods.zip");
        }
    }
}
