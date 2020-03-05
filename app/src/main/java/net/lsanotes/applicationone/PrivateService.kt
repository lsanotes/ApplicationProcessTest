package net.lsanotes.applicationone

import android.app.IntentService
import android.content.Intent

class PrivateService : IntentService("PrivateService") {
    override fun onHandleIntent(intent: Intent?) {
    }

    override fun onCreate() {
        super.onCreate()
        println("app1 PrivateService -> pid = ${android.os.Process.myPid()}")
    }
}