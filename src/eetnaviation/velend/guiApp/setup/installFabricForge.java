package eetnaviation.velend.guiApp.setup;

public class installFabricForge {
    public static void runInstall(String fabricOrForge, String minecraftVersion) {
        if (fabricOrForge == "fabric") {
            installFabric(minecraftVersion);
        }
        else if (fabricOrForge == "forge") {
            installForge(minecraftVersion);
        }
    }

    private static void installFabric(String minecraftVersion) {
        //run fabric install
    }

    private static void installForge(String minecraftVersion) {
        //run forge installation
    }
}
