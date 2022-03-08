package uz.itech.roundup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromAsset("Roundup.pdf").load()

    }

}