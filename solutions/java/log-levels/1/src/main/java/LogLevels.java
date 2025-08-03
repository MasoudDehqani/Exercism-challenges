public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":", 2)[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.split("[\\[\\]]", 3)[1].trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        String logLevelText = logLine.split("[\\[\\]]", 3)[1].trim().toLowerCase();
        String explanationText = logLine.split(":", 2)[1].trim();
        return explanationText + " (" + logLevelText + ")";
    }
}
