package ru.yandexpraktikum.all_notes.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lru/yandexpraktikum/all_notes/di/AllNotesModule;", "", "bindsDeleteNotesInteractor", "Lru/yandexpraktikum/all_notes/domain/interactors/DeleteNoteInteractor;", "deleteNotesInteractorImpl", "Lru/yandexpraktikum/all_notes/domain/interactors/DeleteNoteInteractorImpl;", "bindsFetchAllNotesInteractor", "Lru/yandexpraktikum/all_notes/domain/interactors/FetchAllNotesInteractor;", "fetchAllNotesInteractorImpl", "Lru/yandexpraktikum/all_notes/domain/interactors/FetchAllNotesInteractorImpl;", "all-notes_debug"})
public abstract interface AllNotesModule {
    
    @dagger.Binds()
    @AllNodesScope()
    @org.jetbrains.annotations.NotNull()
    public abstract ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor bindsFetchAllNotesInteractor(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractorImpl fetchAllNotesInteractorImpl);
    
    @dagger.Binds()
    @AllNodesScope()
    @org.jetbrains.annotations.NotNull()
    public abstract ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor bindsDeleteNotesInteractor(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractorImpl deleteNotesInteractorImpl);
}