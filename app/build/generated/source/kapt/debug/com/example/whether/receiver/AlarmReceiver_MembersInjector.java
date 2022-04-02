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
public final class AlarmReceiver_MembersInjector implements MembersInjector<AlarmReceiver> {
  private final Provider<Prefs> prefsProvider;

  public AlarmReceiver_MembersInjector(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<AlarmReceiver> create(Provider<Prefs> prefsProvider) {
    return new AlarmReceiver_MembersInjector(prefsProvider);
  }

  @Override
  public void injectMembers(AlarmReceiver instance) {
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.example.whether.receiver.AlarmReceiver.prefs")
  public static void injectPrefs(AlarmReceiver instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}
