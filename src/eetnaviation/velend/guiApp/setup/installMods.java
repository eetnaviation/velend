package eetnaviation.velend.guiApp.setup;

import eetnaviation.velend.guiApp.utils.folderUtils;
import eetnaviation.velend.guiApp.utils.JGet;
import eetnaviation.velend.guiApp.utils.fileUtils;
import eetnaviation.velend.guiApp.main;

public class installMods {

    private static String zipPath;
    private static String zipDestination;
    private static String fabricStatus;

    public static void Main(String url, String destination, String fabricInstall) {
        folderUtils.DeleteFolder(destination);
        folderUtils.CreateFolder(destination);
        zipPath = destination + "\\mods.zip";
        zipDestination = destination;
        fabricStatus = fabricInstall;

        JGet.main(url, destination);
    }

    public static void unZip() {
        fileUtils.unZip(zipPath, zipDestination);
        if (fabricStatus == "true") {
            //installFabric();
            System.out.println("Run fabric install");
        }
        main.installDone();
    }

    public static void installFabric() {

    }
}