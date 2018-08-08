package fr.edf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by PC on 08/08/2018.
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {
        Logger log = LoggerFactory.getLogger(Main.class);
        while(true) {
            log.info("Hello World");
            TimeUnit.SECONDS.sleep(5);
        }
    }
}
