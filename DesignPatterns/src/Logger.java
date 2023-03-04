package DesignPatterns.src;

public class Logger {

    // class Logger is build based on the Singleton designt pattern
    // because I need only one instance of the class for logging
    // messages in the console

    public static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            return new Logger();
        }
        return instance;

    }

    // All methods print first the severity level (we get it from SeverityLevel.java)
    // and then the message that we want to print

    public void emergencyLog(String message) {
        System.out.println(SeverityLevel.EMERGENCY.toString() + ": " + message);
        System.exit(0);
    }

    public void alertLog(String message) {
        System.out.println(SeverityLevel.ALERT.toString() + ": " + message);
    }

    public void criticalLog(String message) {
        System.out.println(SeverityLevel.CRITICAL.toString() + ": " + message);
    }

    public void errorLog(String message) {
        System.out.println(SeverityLevel.ERROR.toString() + ": " + message);
    }

    public void warningLog(String message) {
        System.out.println(SeverityLevel.WARNING.toString() + ": " + message);
    }

    public void noticeLog(String message) {
        System.out.println(SeverityLevel.NOTICE.toString() + ": " + message);
    }

    public void infoLog(String message) {
        System.out.println(SeverityLevel.INFORMATIONAL.toString() + ": " + message);
    }

    public void debugLog(String message) {
        System.out.println(SeverityLevel.DEBUG.toString() + ": " + message);
    }

}
