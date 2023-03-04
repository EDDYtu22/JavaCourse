package DesignPatterns.src;

public class Logger {

    public static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            return new Logger();
        }
        return instance;

    }

    public <T> void emergencyLog(T t){
        System.out.println(SeverityLevel.EMERGENCY.toString() + ": " + t);
        System.exit(0);
    }
    public <T> void alertLog(T t){
        System.out.println(SeverityLevel.ALERT.toString() + ": " + t);
    }
    public <T> void criticalLog(T t){
        System.out.println(SeverityLevel.CRITICAL.toString() + ": " + t);
    } 
    public <T> void errorLog(T t){
        System.out.println(SeverityLevel.ERROR.toString() + ": " + t);
    }
    public <T> void warningLog(T t){
        System.out.println(SeverityLevel.WARNING.toString() + ": " + t);
    }
    public <T> void noticeLog(T t){
        System.out.println(SeverityLevel.NOTICE.toString() + ": " + t);
    } 
    public <T> void infoLog(T t){
        System.out.println(SeverityLevel.INFORMATIONAL.toString() + ": " + t);
    }
    public <T> void debugLog(T t){
        System.out.println(SeverityLevel.DEBUG.toString() + ": " + t);
    }
    
    
}
