package ru.yandexpraktikum.all_notes.di;

@dagger.Subcomponent(modules = {ru.yandexpraktikum.all_notes.di.AllNotesModule.class})
@AllNodesScope()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lru/yandexpraktikum/all_notes/di/AllNotesSubcomponent;", "", "getAllNodesViewModelFactory", "Lru/yandexpraktikum/all_notes/presentation/AllNotesViewModelFactory;", "Factory", "all-notes_debug"})
public abstract interface AllNotesSubcomponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.yandexpraktikum.all_notes.presentation.AllNotesViewModelFactory getAllNodesViewModelFactory();
    
    @dagger.Subcomponent.Factory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lru/yandexpraktikum/all_notes/di/AllNotesSubcomponent$Factory;", "", "create", "Lru/yandexpraktikum/all_notes/di/AllNotesSubcomponent;", "all-notes_debug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ru.yandexpraktikum.all_notes.di.AllNotesSubcomponent create();
    }
}