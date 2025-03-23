package ru.yandexpraktikum.all_notes.domain.interactors;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/yandexpraktikum/all_notes/domain/interactors/FetchAllNotesInteractorImpl;", "Lru/yandexpraktikum/all_notes/domain/interactors/FetchAllNotesInteractor;", "repository", "Lru/yandexpraktikum/core/domain/repository/NotesRepository;", "(Lru/yandexpraktikum/core/domain/repository/NotesRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/yandexpraktikum/core/domain/model/Note;", "all-notes_debug"})
public final class FetchAllNotesInteractorImpl implements ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor {
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.domain.repository.NotesRepository repository = null;
    
    @javax.inject.Inject()
    public FetchAllNotesInteractorImpl(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.domain.repository.NotesRepository repository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<ru.yandexpraktikum.core.domain.model.Note>> invoke() {
        return null;
    }
}