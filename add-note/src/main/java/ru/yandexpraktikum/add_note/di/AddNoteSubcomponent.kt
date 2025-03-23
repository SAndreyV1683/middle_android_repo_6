package ru.yandexpraktikum.add_note.di

import dagger.Subcomponent
import ru.yandexpraktikum.add_note.presentation.AddNoteViewModelFactory

@Subcomponent(modules = [AddNoteModule ::class])
@AddNoteScope
interface AddNoteSubcomponent {
    fun getNoteViewModelFactory(): AddNoteViewModelFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(): AddNoteSubcomponent
    }
}