package ru.yandexpraktikum.all_notes.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lru/yandexpraktikum/all_notes/presentation/AllNotesViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchAllNotesInteractor", "Lru/yandexpraktikum/all_notes/domain/interactors/FetchAllNotesInteractor;", "deleteNoteInteractor", "Lru/yandexpraktikum/all_notes/domain/interactors/DeleteNoteInteractor;", "noteMapper", "Lru/yandexpraktikum/core/presentation/mappers/PresentationNoteMapper;", "(Lru/yandexpraktikum/all_notes/domain/interactors/FetchAllNotesInteractor;Lru/yandexpraktikum/all_notes/domain/interactors/DeleteNoteInteractor;Lru/yandexpraktikum/core/presentation/mappers/PresentationNoteMapper;)V", "allNotes", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/yandexpraktikum/core/presentation/model/NoteUi;", "getAllNotes", "()Lkotlinx/coroutines/flow/Flow;", "deleteNote", "", "note", "all-notes_debug"})
public final class AllNotesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor fetchAllNotesInteractor = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor deleteNoteInteractor = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper noteMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<ru.yandexpraktikum.core.presentation.model.NoteUi>> allNotes = null;
    
    public AllNotesViewModel(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor fetchAllNotesInteractor, @org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor deleteNoteInteractor, @org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper noteMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<ru.yandexpraktikum.core.presentation.model.NoteUi>> getAllNotes() {
        return null;
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.presentation.model.NoteUi note) {
    }
}