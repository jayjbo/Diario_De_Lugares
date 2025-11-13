package com.example.myapplication.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class AppModule_ProvidesApplicationScopeFactory implements Factory<CoroutineScope> {
  @Override
  public CoroutineScope get() {
    return providesApplicationScope();
  }

  public static AppModule_ProvidesApplicationScopeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineScope providesApplicationScope() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesApplicationScope());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidesApplicationScopeFactory INSTANCE = new AppModule_ProvidesApplicationScopeFactory();
  }
}
