package com.tanuj.notes.feature_note.domain.use_case

import com.tanuj.notes.feature_note.domain.model.InvalidNoteException
import com.tanuj.notes.feature_note.domain.model.Note
import com.tanuj.notes.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("Title cant be empty")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("Content cant be empty")
        }
        repository.insertNote(note)
    }
}