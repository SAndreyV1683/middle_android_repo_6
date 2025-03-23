package ru.yandexpraktikum.all_notes.presentation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor;
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor;
import ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AllNotesViewModelFactory_Factory implements Factory<AllNotesViewModelFactory> {
  private final Provider<FetchAllNotesInteractor> fetchAllNotesInteractorProvider;

  private final Provider<DeleteNoteInteractor> deleteNoteInteractorProvider;

  private final Provider<PresentationNoteMapper> noteMapperProvider;

  public AllNotesViewModelFactory_Factory(
      Provider<FetchAllNotesInteractor> fetchAllNotesInteractorProvider,
      Provider<DeleteNoteInteractor> deleteNoteInteractorProvider,
      Provider<PresentationNoteMapper> noteMapperProvider) {
    this.fetchAllNotesInteractorProvider = fetchAllNotesInteractorProvider;
    this.deleteNoteInteractorProvider = deleteNoteInteractorProvider;
    this.noteMapperProvider = noteMapperProvider;
  }

  @Override
  public AllNotesViewModelFactory get() {
    return newInstance(fetchAllNotesInteractorProvider.get(), deleteNoteInteractorProvider.get(), noteMapperProvider.get());
  }

  public static AllNotesViewModelFactory_Factory create(
      javax.inject.Provider<FetchAllNotesInteractor> fetchAllNotesInteractorProvider,
      javax.inject.Provider<DeleteNoteInteractor> deleteNoteInteractorProvider,
      javax.inject.Provider<PresentationNoteMapper> noteMapperProvider) {
    return new AllNotesViewModelFactory_Factory(Providers.asDaggerProvider(fetchAllNotesInteractorProvider), Providers.asDaggerProvider(deleteNoteInteractorProvider), Providers.asDaggerProvider(noteMapperProvider));
  }

  public static AllNotesViewModelFactory_Factory create(
      Provider<FetchAllNotesInteractor> fetchAllNotesInteractorProvider,
      Provider<DeleteNoteInteractor> deleteNoteInteractorProvider,
      Provider<PresentationNoteMapper> noteMapperProvider) {
    return new AllNotesViewModelFactory_Factory(fetchAllNotesInteractorProvider, deleteNoteInteractorProvider, noteMapperProvider);
  }

  public static AllNotesViewModelFactory newInstance(
      FetchAllNotesInteractor fetchAllNotesInteractor, DeleteNoteInteractor deleteNoteInteractor,
      PresentationNoteMapper noteMapper) {
    return new AllNotesViewModelFactory(fetchAllNotesInteractor, deleteNoteInteractor, noteMapper);
  }
}
