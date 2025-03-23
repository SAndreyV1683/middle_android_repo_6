package ru.yandexpraktikum.all_notes.domain.interactors;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ru.yandexpraktikum.core.domain.repository.NotesRepository;

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
public final class FetchAllNotesInteractorImpl_Factory implements Factory<FetchAllNotesInteractorImpl> {
  private final Provider<NotesRepository> repositoryProvider;

  public FetchAllNotesInteractorImpl_Factory(Provider<NotesRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FetchAllNotesInteractorImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static FetchAllNotesInteractorImpl_Factory create(
      javax.inject.Provider<NotesRepository> repositoryProvider) {
    return new FetchAllNotesInteractorImpl_Factory(Providers.asDaggerProvider(repositoryProvider));
  }

  public static FetchAllNotesInteractorImpl_Factory create(
      Provider<NotesRepository> repositoryProvider) {
    return new FetchAllNotesInteractorImpl_Factory(repositoryProvider);
  }

  public static FetchAllNotesInteractorImpl newInstance(NotesRepository repository) {
    return new FetchAllNotesInteractorImpl(repository);
  }
}
