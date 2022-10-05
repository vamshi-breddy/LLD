package com.designPatterns.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == INFO){
            System.out.println("INFO" +message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
