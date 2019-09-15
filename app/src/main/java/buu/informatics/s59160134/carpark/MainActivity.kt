package buu.informatics.s59160134.carpark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import buu.informatics.s59160134.carpark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val car0 = Car(0)
    private val car1 = Car(1)
    private val car2 = Car(2)
    private val cars = arrayOf(car0, car1, car2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

    }
}
