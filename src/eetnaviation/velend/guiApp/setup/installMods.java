package eetnaviation.velend.guiApp.setup;

import eetnaviation.velend.guiApp.utils.folderUtils;
import eetnaviation.velend.guiApp.utils.JGet;
import eetnaviation.velend.guiApp.utils.fileUtils;

public class installMods {
    public static void Main(String url, String destination) {
        folderUtils.DeleteFolder(destination);
        folderUtils.CreateFolder(destination);
        String zipPath = destination + "\\mods.zip";

        JGet.main(url, destination);
        fileUtils.unZip(zipPath, destination);
    }
}
