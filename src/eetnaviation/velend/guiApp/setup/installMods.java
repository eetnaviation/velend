package eetnaviation.velend.guiApp.setup;

import eetnaviation.velend.guiApp.utils.folderUtils;
import eetnaviation.velend.guiApp.utils.JGet;
import eetnaviation.velend.guiApp.utils.fileUtils;
import eetnaviation.velend.guiApp.main;

public class installMods {

    private static String zipPath;
    private static String zipDestination;
    private static String fabricStatus;
    private static String minecraftVersion;

    public static void Main(String url, String destination, String fabricInstall, String minecraftVersionInput) {
        folderUtils.DeleteFolder(destination);
        folderUtils.CreateFolder(destination);
        zipPath = destination + "\\mods.zip";
        zipDestination = destination;
        fabricStatus = fabricInstall;
        minecraftVersion = minecraftVersionInput;

        JGet.main(url, destination);
    }

    public static void unZip() {
        fileUtils.unZip(zipPath, zipDestination);
        if (fabricStatus == "true") {
            //installFabric();
            installFabricForge.runInstall("fabric", minecraftVersion);
        }
        main.installDone();
    }

    public static void installFabric() {

    }
}