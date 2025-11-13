package com.example.myapplication.di;

import com.example.myapplication.data.AppDatabase;
import com.example.myapplication.data.PlaceDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
    "cast"
})
public final class AppModule_ProvidePlaceDaoFactory implements Factory<PlaceDao> {
  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvidePlaceDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public PlaceDao get() {
    return providePlaceDao(databaseProvider.get());
  }

  public static AppModule_ProvidePlaceDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvidePlaceDaoFactory(databaseProvider);
  }

  public static PlaceDao providePlaceDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePlaceDao(database));
  }
}
