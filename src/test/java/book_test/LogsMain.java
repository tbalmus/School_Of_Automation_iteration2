package book_test;
//http://logback.qos.ch/manual/configuration.html
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogsMain {
    private final static Logger log = LoggerFactory.getLogger(LogsMain.class);
    public static void main ( String[] args ) {
        System.out.println ("Hello" );
       // System.err.println ("this is system error" );
        log.info("This is class logger");
        log.debug("d");
        log.trace("t");
        log.warn("w");
        log.error("e");
    }
}
