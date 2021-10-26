package com.tanuj.notes.feature_note.presentation.notes

import com.tanuj.notes.feature_note.domain.model.Note
import com.tanuj.notes.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class OrderEvent(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}