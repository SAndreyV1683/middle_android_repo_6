package ru.yandexpraktikum.add_note.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lru/yandexpraktikum/add_note/presentation/AddNoteViewModel;", "Landroidx/lifecycle/ViewModel;", "addNoteInteractor", "Lru/yandexpraktikum/add_note/domain/interactors/AddNoteInteractor;", "noteMapper", "Lru/yandexpraktikum/core/presentation/mappers/PresentationNoteMapper;", "(Lru/yandexpraktikum/add_note/domain/interactors/AddNoteInteractor;Lru/yandexpraktikum/core/presentation/mappers/PresentationNoteMapper;)V", "insertNote", "", "note", "Lru/yandexpraktikum/core/presentation/model/NoteUi;", "add-note_debug"})
public final class AddNoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractor addNoteInteractor = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper noteMapper = null;
    
    public AddNoteViewModel(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractor addNoteInteractor, @org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper noteMapper) {
        super();
    }
    
    public final void insertNote(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.presentation.model.NoteUi note) {
    }
}