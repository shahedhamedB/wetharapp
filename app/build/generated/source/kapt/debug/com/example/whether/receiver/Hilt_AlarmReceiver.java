package com.example.whether.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.CallSuper;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.BroadcastReceiverGenerator")
public abstract class Hilt_AlarmReceiver extends BroadcastReceiver {
  private final Object injectedLock = new Object();

  private volatile boolean injected = false;

  @Override
  @CallSuper
  public void onReceive(Context context, Intent intent) {
    inject(context);
  }

  protected void inject(Context context) {
    if (!injected) {
      synchronized (injectedLock) {
        if (!injected) {
          ((AlarmReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectAlarmReceiver(UnsafeCasts.<AlarmReceiver>unsafeCast(this));
          injected = true;
        }
      }
    }
  }
}
