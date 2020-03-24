package android.latihan.uts_mobile_1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*

class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        val link = findViewById<TextView>(R.id.entire_web)
        part_foto.setImageResource(getIntent().getStringExtra("foto").toInt())
        part_title.text = getIntent().getStringExtra("resepNama")
        entire_desc.text = getIntent().getStringExtra("desc")
        entire_email.text = getIntent().getStringExtra("email")
        entire_web.text = getIntent().getStringExtra("web")

        link.setOnClickListener{
            emailClicked(entire_web.text.toString())
        }
    }

    private fun emailClicked(url: String){
        val showWebIntent = Intent(this, PhoneWebView::class.java)
        showWebIntent.putExtra("url",url)
        startActivity(showWebIntent)
    }
}