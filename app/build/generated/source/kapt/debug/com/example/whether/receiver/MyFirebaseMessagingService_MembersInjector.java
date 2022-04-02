package com.example.whether.receiver;

import com.example.whether.utils.Prefs;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MyFirebaseMessagingService_MembersInjector implements MembersInjector<MyFirebaseMessagingService> {
  private final Provider<Prefs> prefsProvider;

  public MyFirebaseMessagingService_MembersInjector(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<MyFirebaseMessagingService> create(Provider<Prefs> prefsProvider) {
    return new MyFirebaseMessagingService_MembersInjector(prefsProvider);
  }

  @Override
  public void injectMembers(MyFirebaseMessagingService instance) {
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.example.whether.receiver.MyFirebaseMessagingService.prefs")
  public static void injectPrefs(MyFirebaseMessagingService instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}
