package com.example.whether.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/whether/receiver/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "prefs", "Lcom/example/whether/utils/Prefs;", "getPrefs", "()Lcom/example/whether/utils/Prefs;", "setPrefs", "(Lcom/example/whether/utils/Prefs;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject()
    public com.example.whether.utils.Prefs prefs;
    
    public AlarmReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.whether.utils.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.whether.utils.Prefs p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
}