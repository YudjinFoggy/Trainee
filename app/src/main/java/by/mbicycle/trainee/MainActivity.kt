package by.mbicycle.trainee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import by.mbicycle.trainee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var myName : MyName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myName = MyName()
        binding.myName = myName
        //setContentView(R.layout.activity_main)

        binding.apply {
            invalidateAll()
            binding.myName?.name = "Tom"
            binding.myName?.nickname = "Nagibator999"
        }
    }
}