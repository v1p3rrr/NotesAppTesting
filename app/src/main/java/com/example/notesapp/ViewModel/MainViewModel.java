package com.example.notesapp.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.notesapp.Data.Note;
import com.example.notesapp.Repository.AuthRepository;
import com.example.notesapp.Repository.NoteRepository;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel { // Когда VM, когда Android VM?
    private final NoteRepository noteRepository;
    private final AuthRepository authRepository;
    private ArrayList<Note> displayList;


    public MainViewModel() {
        noteRepository = NoteRepository.getInstance();
        authRepository = AuthRepository.getInstance();
        displayList = new ArrayList<>();
    }

    public void init() throws IllegalAccessException {
        noteRepository.init();
    }

    public LiveData<List<Note>> getNotes() {
        return noteRepository.getNotes();
    }

    public void deleteNote(int id){ // как передать конкретную
        displayList.remove(id);
        noteRepository.updateNotes(displayList);
    }

    public void setDisplayList(List<Note> notes){
        this.displayList = (ArrayList<Note>) notes;
    }

    public void saveNote(Note note){
        displayList.add(note);
        noteRepository.saveNote(displayList);
    }

    public void logout(){
        authRepository.getMAuth().signOut();
    }

    // SharedPreference ce wo?
}
