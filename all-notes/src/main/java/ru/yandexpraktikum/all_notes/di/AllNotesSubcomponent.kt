package ru.yandexpraktikum.all_notes.di

import dagger.Subcomponent
import ru.yandexpraktikum.all_notes.presentation.AllNotesViewModelFactory

@Subcomponent(modules = [AllNotesModule :: class])
@AllNodesScope
interface AllNotesSubcomponent {
    fun getAllNodesViewModelFactory(): AllNotesViewModelFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(): AllNotesSubcomponent
    }
}