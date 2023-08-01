package Streams;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public Logger log;
    FileHandler fh;

    public Log(String filename) throws SecurityException, IOException {
        File logFile = new File(filename);
        if(!logFile.exists()){
            logFile.createNewFile();
        }

        fh = new FileHandler(filename, true);
        log = Logger.getLogger("logging");
        log.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

    }

}
