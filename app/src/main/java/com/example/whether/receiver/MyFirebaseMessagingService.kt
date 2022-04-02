package com.example.whether.receiver

import android.app.NotificationManager
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.whether.utils.Prefs
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyFirebaseMessagingService : FirebaseMessagingService()  {
    @Inject
    lateinit var prefs: Prefs

    /**
     * Called when message is received.
     *
     * @param remoteMessage Object representing the message received from Firebase Cloud Messaging.
     */
    // [START receive_message]

    override fun onMessageReceived(remoteMessage: RemoteMessage) {

        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d(TAG, "From: ${remoteMessage?.from}")
        prefs.saveKey("hi")
        // TODO Step 3.5 check messages for data
        // Check if message contains a data payload.
        remoteMessage?.data?.let {
            Log.d(TAG, "Message data payload: " + remoteMessage.data)
        }

        // TODO Step 3.6 check messages for notification and call sendNotification
        // Check if message contains a notification payload.
        remoteMessage?.notification?.let {
            Log.d(TAG, "Message Notification Body: ${it.body}")

            sendNotification(it.body!!)

        }


    }
    // [END receive_message]

    //TODO Step 3.2 log registration token
    // [START on_new_token]
    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrieve the token.
     */
    override fun onNewToken(token: String) {
        Log.d(TAG, "Refreshed token: $token")

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        // sendRegistrationToServer(token)
        prefs.saveDeviceToken(token)
        var currentUserToken = prefs.featchAuthToken().toString()
        if(currentUserToken.isNullOrEmpty())return
        prefs.UpdateUserDeviceToken(prefs.featchAuthToken().toString(), token)
    }
    // [END on_new_token]



    /**
     * Create and show a simple notification containing the received FCM message.
     *
     * @param messageBody FCM message body received.
     */
    private fun sendNotification(messageBody: String) {
        val notificationManager = ContextCompat.getSystemService(applicationContext, NotificationManager::class.java) as NotificationManager
        notificationManager.sendNotification(messageBody, applicationContext)


    }
    /**
     * Persist token to third-party servers.
     *
     * @param token The new token.
     */



    companion object {
        private const val TAG = "MyFirebaseMsgService"
        var isRuning = false


    }

    override fun onCreate() {
        super.onCreate()
        isRuning = true
    }
}