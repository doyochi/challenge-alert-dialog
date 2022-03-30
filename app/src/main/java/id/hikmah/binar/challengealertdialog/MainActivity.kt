package id.hikmah.binar.challengealertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.hikmah.binar.challengealertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}