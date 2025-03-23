package ru.yandexpraktikum.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ru.yandexpraktikum.core.data.db.NoteDao;
import ru.yandexpraktikum.core.data.db.NoteDatabase;

@ScopeMetadata("javax.inject.Singleton")
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
public final class CoreModule_Companion_ProvidesNoteDaoFactory implements Factory<NoteDao> {
  private final Provider<NoteDatabase> noteDatabaseProvider;

  public CoreModule_Companion_ProvidesNoteDaoFactory(Provider<NoteDatabase> noteDatabaseProvider) {
    this.noteDatabaseProvider = noteDatabaseProvider;
  }

  @Override
  public NoteDao get() {
    return providesNoteDao(noteDatabaseProvider.get());
  }

  public static CoreModule_Companion_ProvidesNoteDaoFactory create(
      javax.inject.Provider<NoteDatabase> noteDatabaseProvider) {
    return new CoreModule_Companion_ProvidesNoteDaoFactory(Providers.asDaggerProvider(noteDatabaseProvider));
  }

  public static CoreModule_Companion_ProvidesNoteDaoFactory create(
      Provider<NoteDatabase> noteDatabaseProvider) {
    return new CoreModule_Companion_ProvidesNoteDaoFactory(noteDatabaseProvider);
  }

  public static NoteDao providesNoteDao(NoteDatabase noteDatabase) {
    return Preconditions.checkNotNullFromProvides(CoreModule.Companion.providesNoteDao(noteDatabase));
  }
}
