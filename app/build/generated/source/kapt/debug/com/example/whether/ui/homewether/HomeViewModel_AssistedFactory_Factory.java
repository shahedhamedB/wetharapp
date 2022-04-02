package com.example.whether.ui.homewether;

import com.example.whether.retrofit.data.HomeDataSourse;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_AssistedFactory_Factory implements Factory<HomeViewModel_AssistedFactory> {
  private final Provider<HomeDataSourse> homeDataSourseProvider;

  public HomeViewModel_AssistedFactory_Factory(Provider<HomeDataSourse> homeDataSourseProvider) {
    this.homeDataSourseProvider = homeDataSourseProvider;
  }

  @Override
  public HomeViewModel_AssistedFactory get() {
    return newInstance(homeDataSourseProvider);
  }

  public static HomeViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSourse> homeDataSourseProvider) {
    return new HomeViewModel_AssistedFactory_Factory(homeDataSourseProvider);
  }

  public static HomeViewModel_AssistedFactory newInstance(Provider<HomeDataSourse> homeDataSourse) {
    return new HomeViewModel_AssistedFactory(homeDataSourse);
  }
}
