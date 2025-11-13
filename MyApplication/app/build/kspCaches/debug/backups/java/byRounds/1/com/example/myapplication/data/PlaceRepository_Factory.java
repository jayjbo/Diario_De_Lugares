package com.example.myapplication.data;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.example.myapplication.di.ApplicationScope")
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
public final class PlaceRepository_Factory implements Factory<PlaceRepository> {
  private final Provider<PlaceDao> placeDaoProvider;

  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<CoroutineScope> externalScopeProvider;

  public PlaceRepository_Factory(Provider<PlaceDao> placeDaoProvider,
      Provider<FirebaseFirestore> firestoreProvider,
      Provider<CoroutineScope> externalScopeProvider) {
    this.placeDaoProvider = placeDaoProvider;
    this.firestoreProvider = firestoreProvider;
    this.externalScopeProvider = externalScopeProvider;
  }

  @Override
  public PlaceRepository get() {
    return newInstance(placeDaoProvider.get(), firestoreProvider.get(), externalScopeProvider.get());
  }

  public static PlaceRepository_Factory create(Provider<PlaceDao> placeDaoProvider,
      Provider<FirebaseFirestore> firestoreProvider,
      Provider<CoroutineScope> externalScopeProvider) {
    return new PlaceRepository_Factory(placeDaoProvider, firestoreProvider, externalScopeProvider);
  }

  public static PlaceRepository newInstance(PlaceDao placeDao, FirebaseFirestore firestore,
      CoroutineScope externalScope) {
    return new PlaceRepository(placeDao, firestore, externalScope);
  }
}
