package ru.yandexpraktikum.add_note.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lru/yandexpraktikum/add_note/di/AddNoteModule;", "", "bindsAddNoteInteractor", "Lru/yandexpraktikum/add_note/domain/interactors/AddNoteInteractor;", "addNoteInteractorImpl", "Lru/yandexpraktikum/add_note/domain/interactors/AddNoteInteractorImpl;", "add-note_debug"})
public abstract interface AddNoteModule {
    
    @dagger.Binds()
    @AddNoteScope()
    @org.jetbrains.annotations.NotNull()
    public abstract ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractor bindsAddNoteInteractor(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractorImpl addNoteInteractorImpl);
}