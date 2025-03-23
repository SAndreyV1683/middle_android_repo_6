package ru.yandexpraktikum.add_note.di

import dagger.Binds
import dagger.Module
import dagger.Reusable
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractor
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractorImpl
import javax.inject.Scope

@Module
interface AddNoteModule {
    @Binds
    @AddNoteScope
    fun bindsAddNoteInteractor(addNoteInteractorImpl: AddNoteInteractorImpl): AddNoteInteractor
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AddNoteScope
