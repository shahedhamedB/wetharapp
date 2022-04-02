package com.example.whether.receiver

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import com.example.whether.R
import com.example.whether.utils.Prefs
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AlarmReceiver : BroadcastReceiver() {

    @Inject
    lateinit var prefs:Prefs
    override fun onReceive(context: Context?, intent: Intent?) {
        // TODO: Step 1.10 [Optional] remove toast
        //Toast.makeText(context, context.getText(R.string.eggs_ready), Toast.LENGTH_SHORT).show()
        prefs.saveKey("hi")

        // TODO: Step 1.9 add call to sendNotification
        val notificationManager = ContextCompat.getSystemService(
            context!!,
            NotificationManager::class.java
        ) as NotificationManager
        notificationManager.sendNotification(context.getText(R.string.app_name).toString(), context)
    }
}