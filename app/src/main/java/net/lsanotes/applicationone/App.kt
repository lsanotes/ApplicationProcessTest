package net.lsanotes.applicationone

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        println("app1 Application onCreate -> pid = ${android.os.Process.myPid()}")
    }
}