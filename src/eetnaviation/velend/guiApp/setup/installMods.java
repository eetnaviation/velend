package eetnaviation.velend.guiApp.setup;

import eetnaviation.velend.guiApp.utils.folderUtils;
import eetnaviation.velend.guiApp.utils.JGet;
import eetnaviation.velend.guiApp.utils.fileUtils;

public class installMods {

    private static String zipPath;
    private static String zipDestination;

    public static void Main(String url, String destination) {
        folderUtils.DeleteFolder(destination);
        folderUtils.CreateFolder(destination);
        zipPath = destination + "\\mods.zip";
        zipDestination = destination;

        JGet.main(url, destination);
    }

    public static void unZip() {
        fileUtils.unZip(zipPath, zipDestination);
    }
}