package com.example.myapplication.ui;

import com.example.myapplication.data.PlaceRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
    "cast"
})
public final class PlaceViewModel_Factory implements Factory<PlaceViewModel> {
  private final Provider<PlaceRepository> repositoryProvider;

  public PlaceViewModel_Factory(Provider<PlaceRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PlaceViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static PlaceViewModel_Factory create(Provider<PlaceRepository> repositoryProvider) {
    return new PlaceViewModel_Factory(repositoryProvider);
  }

  public static PlaceViewModel newInstance(PlaceRepository repository) {
    return new PlaceViewModel(repository);
  }
}
