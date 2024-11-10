package com.example.alfarabi_3.Room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    private val noteDao = NoteDatabase.getDatabase(application).noteDao()
    val allNotes: Flow<List<Note>> = noteDao.getAllNotes()

    fun addNote(content: String) {
        viewModelScope.launch {
            noteDao.insert(Note(content = content))
        }
    }

    fun deleteNoteById(noteId: Int) {
        viewModelScope.launch {
            noteDao.deleteById(noteId)
        }
    }
}
