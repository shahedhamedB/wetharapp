package com.example.whether.ui.homewether;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.whether.retrofit.data.HomeDataSourse;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class HomeViewModel_AssistedFactory implements ViewModelAssistedFactory<HomeViewModel> {
  private final Provider<HomeDataSourse> homeDataSourse;

  @Inject
  HomeViewModel_AssistedFactory(Provider<HomeDataSourse> homeDataSourse) {
    this.homeDataSourse = homeDataSourse;
  }

  @Override
  @NonNull
  public HomeViewModel create(SavedStateHandle arg0) {
    return new HomeViewModel(homeDataSourse.get());
  }
}
