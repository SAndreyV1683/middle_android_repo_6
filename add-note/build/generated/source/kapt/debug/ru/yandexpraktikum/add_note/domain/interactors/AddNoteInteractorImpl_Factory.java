package ru.yandexpraktikum.add_note.domain.interactors;

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
public final class AddNoteInteractorImpl_Factory implements Factory<AddNoteInteractorImpl> {
  private final Provider<NotesRepository> repositoryProvider;

  public AddNoteInteractorImpl_Factory(Provider<NotesRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AddNoteInteractorImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static AddNoteInteractorImpl_Factory create(
      javax.inject.Provider<NotesRepository> repositoryProvider) {
    return new AddNoteInteractorImpl_Factory(Providers.asDaggerProvider(repositoryProvider));
  }

  public static AddNoteInteractorImpl_Factory create(Provider<NotesRepository> repositoryProvider) {
    return new AddNoteInteractorImpl_Factory(repositoryProvider);
  }

  public static AddNoteInteractorImpl newInstance(NotesRepository repository) {
    return new AddNoteInteractorImpl(repository);
  }
}
