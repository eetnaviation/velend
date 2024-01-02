package eetnaviation.velend.guiApp.setup;

import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

class JGet extends SwingWorker<Void, Void> {
    private final String fileURL;
    private final String destinationFolder;

    public JGet(String fileURL, String destinationFolder) {
        this.fileURL = fileURL;
        this.destinationFolder = destinationFolder;
    }

    @Override
    protected Void doInBackground() throws Exception {
        try {
            // Create a URL object
            URL url = new URL(fileURL);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Get the input stream from the connection
            try (InputStream inputStream = connection.getInputStream()) {
                // Get the file name from the URL
                String fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1);

                // Specify the destination file path
                String destinationFilePath = destinationFolder + File.separator + fileName;

                // Create a FileOutputStream to write the downloaded file
                try (FileOutputStream outputStream = new FileOutputStream(destinationFilePath)) {
                    // Buffer for data copying
                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    // Read from the input stream and write to the output stream
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                }

                System.out.println("File downloaded successfully to: " + destinationFilePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String url, String destination) {
        String fileURL = url;
        String destinationFolder = destination;

        JGet jGet = new JGet(fileURL, destinationFolder);
        jGet.execute();
    }
}
