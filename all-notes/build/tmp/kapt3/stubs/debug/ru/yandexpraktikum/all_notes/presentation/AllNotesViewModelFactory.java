package ru.yandexpraktikum.all_notes.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lru/yandexpraktikum/all_notes/presentation/AllNotesViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "fetchAllNotesInteractor", "Lru/yandexpraktikum/all_notes/domain/interactors/FetchAllNotesInteractor;", "deleteNoteInteractor", "Lru/yandexpraktikum/all_notes/domain/interactors/DeleteNoteInteractor;", "noteMapper", "Lru/yandexpraktikum/core/presentation/mappers/PresentationNoteMapper;", "(Lru/yandexpraktikum/all_notes/domain/interactors/FetchAllNotesInteractor;Lru/yandexpraktikum/all_notes/domain/interactors/DeleteNoteInteractor;Lru/yandexpraktikum/core/presentation/mappers/PresentationNoteMapper;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "all-notes_debug"})
public final class AllNotesViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor fetchAllNotesInteractor = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor deleteNoteInteractor = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper noteMapper = null;
    
    @javax.inject.Inject()
    public AllNotesViewModelFactory(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor fetchAllNotesInteractor, @org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor deleteNoteInteractor, @org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper noteMapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}