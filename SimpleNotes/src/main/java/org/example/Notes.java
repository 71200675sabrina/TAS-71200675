package org.example;

public abstract class Notes {
    public String notesName;

    public abstract void showNotes(){}

    public Notes loadNotes(String) {}

    public void saveNotes(){}

    public Notes(String notesName){}

    public abstract void addNotes(String){}

}
