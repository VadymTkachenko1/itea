package HomeTask.lection9;//Task 1

import java.util.ArrayList;
import java.util.Date;

public class Notepad {
    ArrayList<Note> notes = new ArrayList<>();
    void addNote (Date date, String text) {
        Note newNote = new Note(date, text);
        notes.add(newNote);
    }
    static class Note {
        Date date;
        String text;
        public Note(Date date, String text) {
            this.date = date;
            this.text = text;
        }
    }
}