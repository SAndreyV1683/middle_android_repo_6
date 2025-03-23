package ru.yandexpraktikum.add_note.presentation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractor;
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
public final class AddNoteViewModelFactory_Factory implements Factory<AddNoteViewModelFactory> {
  private final Provider<AddNoteInteractor> addNoteInteractorProvider;

  private final Provider<PresentationNoteMapper> noteMapperProvider;

  public AddNoteViewModelFactory_Factory(Provider<AddNoteInteractor> addNoteInteractorProvider,
      Provider<PresentationNoteMapper> noteMapperProvider) {
    this.addNoteInteractorProvider = addNoteInteractorProvider;
    this.noteMapperProvider = noteMapperProvider;
  }

  @Override
  public AddNoteViewModelFactory get() {
    return newInstance(addNoteInteractorProvider.get(), noteMapperProvider.get());
  }

  public static AddNoteViewModelFactory_Factory create(
      javax.inject.Provider<AddNoteInteractor> addNoteInteractorProvider,
      javax.inject.Provider<PresentationNoteMapper> noteMapperProvider) {
    return new AddNoteViewModelFactory_Factory(Providers.asDaggerProvider(addNoteInteractorProvider), Providers.asDaggerProvider(noteMapperProvider));
  }

  public static AddNoteViewModelFactory_Factory create(
      Provider<AddNoteInteractor> addNoteInteractorProvider,
      Provider<PresentationNoteMapper> noteMapperProvider) {
    return new AddNoteViewModelFactory_Factory(addNoteInteractorProvider, noteMapperProvider);
  }

  public static AddNoteViewModelFactory newInstance(AddNoteInteractor addNoteInteractor,
      PresentationNoteMapper noteMapper) {
    return new AddNoteViewModelFactory(addNoteInteractor, noteMapper);
  }
}
