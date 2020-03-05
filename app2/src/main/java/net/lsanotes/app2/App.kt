package net.lsanotes.app2

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        println("app2 Application onCreate -> ${android.os.Process.myPid()}")
    }
}