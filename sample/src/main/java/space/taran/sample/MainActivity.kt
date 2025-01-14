package dev.arkbuilders.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import space.taran.arkfilepicker.folders.FoldersRepo
import dev.arkbuilders.arklib.initArkLib
import dev.arkbuilders.arklib.initRustLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        System.loadLibrary("arklib")
        FoldersRepo.init(application)
        application.initArkLib()
        initRustLogger()
    }
}