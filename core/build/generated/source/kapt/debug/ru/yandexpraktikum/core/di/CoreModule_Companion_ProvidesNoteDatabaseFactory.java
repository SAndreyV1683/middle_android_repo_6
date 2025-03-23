package ru.yandexpraktikum.core.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class CoreModule_Companion_ProvidesNoteDatabaseFactory implements Factory<NoteDatabase> {
  private final Provider<Context> contextProvider;

  public CoreModule_Companion_ProvidesNoteDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NoteDatabase get() {
    return providesNoteDatabase(contextProvider.get());
  }

  public static CoreModule_Companion_ProvidesNoteDatabaseFactory create(
      javax.inject.Provider<Context> contextProvider) {
    return new CoreModule_Companion_ProvidesNoteDatabaseFactory(Providers.asDaggerProvider(contextProvider));
  }

  public static CoreModule_Companion_ProvidesNoteDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new CoreModule_Companion_ProvidesNoteDatabaseFactory(contextProvider);
  }

  public static NoteDatabase providesNoteDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(CoreModule.Companion.providesNoteDatabase(context));
  }
}
