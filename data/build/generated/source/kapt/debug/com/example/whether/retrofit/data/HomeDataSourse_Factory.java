package com.example.whether.retrofit.data;

import com.example.whether.retrofit.services.NetworkService;
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
public final class HomeDataSourse_Factory implements Factory<HomeDataSourse> {
  private final Provider<NetworkService> networkServiceProvider;

  public HomeDataSourse_Factory(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  @Override
  public HomeDataSourse get() {
    return newInstance(networkServiceProvider.get());
  }

  public static HomeDataSourse_Factory create(Provider<NetworkService> networkServiceProvider) {
    return new HomeDataSourse_Factory(networkServiceProvider);
  }

  public static HomeDataSourse newInstance(NetworkService networkService) {
    return new HomeDataSourse(networkService);
  }
}
