package uz.itech.roundup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val animationView=findViewById<LottieAnimationView>(R.id.animationView)
        animationView.postDelayed({
                                  finish()
            startActivity(Intent(this, MainActivity::class.java))
        }, 6000)
    }
}