import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 *
 * @author Kraptukrait
 */

public class LogSystem {
    private String logMessage;
    private LocalDateTime systemTime;
    private String systemUser;

    public LogSystem(LocalDateTime time, String user) throws IOException {
        this.systemTime = time;
        this.systemUser = user;

        if (systemTime == null || systemUser == null || systemUser.isEmpty()) {
            writeInLog(LocalDateTime.now() + ",Wrong input!");
            throw new IllegalArgumentException("Wrong input!");
        }
        logMessage = systemTime + "," + systemUser;
        try{
        writeInLog(logMessage);
        }catch(Exception e){
            logMessage = e.getMessage();
        }
    }

    public void writeInLog(String logMessage) throws IOException {
        this.logMessage = logMessage;

        try (FileWriter file = new FileWriter("protocol.log", true)) {
            file.write(logMessage + "\n");
        }
    }

    public static void main(String[] args) throws IOException {
        String logUser = System.getProperty("user.name");
        LocalDateTime logTime = LocalDateTime.now();

        LogSystem mSystem = new LogSystem(logTime, logUser);
    }
}
