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
public final class DeleteNoteInteractorImpl_Factory implements Factory<DeleteNoteInteractorImpl> {
  private final Provider<NotesRepository> repositoryProvider;

  public DeleteNoteInteractorImpl_Factory(Provider<NotesRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DeleteNoteInteractorImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static DeleteNoteInteractorImpl_Factory create(
      javax.inject.Provider<NotesRepository> repositoryProvider) {
    return new DeleteNoteInteractorImpl_Factory(Providers.asDaggerProvider(repositoryProvider));
  }

  public static DeleteNoteInteractorImpl_Factory create(
      Provider<NotesRepository> repositoryProvider) {
    return new DeleteNoteInteractorImpl_Factory(repositoryProvider);
  }

  public static DeleteNoteInteractorImpl newInstance(NotesRepository repository) {
    return new DeleteNoteInteractorImpl(repository);
  }
}
