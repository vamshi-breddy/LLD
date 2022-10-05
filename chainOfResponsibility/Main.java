package com.designPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR,"error exception");
        logObject.log(LogProcessor.DEBUG, "debug exception");
        logObject.log(LogProcessor.INFO, "info exception");
    }
}
