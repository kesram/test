package com.kodilla.patterns.singleton;

public enum SettingsFileEngine {
    INSTANCE;

    private String fileName = "";


    public String getFileName(){
        return fileName;
    }

    public void open(final String fileName){
        this.fileName = fileName;
        System.out.println("opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("closing the settings file");
    }
    public boolean loadSettings(){
        System.out.println("Loading settings for file");
        return  true;
    }

    public boolean saveSettings(){
        System.out.println("saving settings to file");
        return true;
    }
}
