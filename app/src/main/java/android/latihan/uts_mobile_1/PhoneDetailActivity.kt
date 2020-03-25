package android.latihan.uts_mobile_1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*
import java.net.URL

class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        val link = findViewById<TextView>(R.id.entire_web)
        val email = findViewById<TextView>(R.id.entire_email)
        part_foto.setImageResource(getIntent().getStringExtra("foto").toInt())
        part_title.text = getIntent().getStringExtra("resepNama")
        entire_desc.text = getIntent().getStringExtra("desc")
        entire_email.text = getIntent().getStringExtra("email")
        entire_web.text = getIntent().getStringExtra("web")

        link.setOnClickListener{
            if (entire_web.text!="-"){
                webClicked(entire_web.text.toString())
            }
        }
        email.setOnClickListener {
            if (entire_email.text!="-"){
                emailClicked(entire_email.text.toString().trim())
            }
        }
    }

    fun emailClicked(send_to: String ){
        val mail_send = Intent(Intent.ACTION_SEND)
        mail_send.data = Uri.parse("mailto:")
        mail_send.type = "text/plain"
        mail_send.setType("message/rfc822")
        mail_send.putExtra(Intent.EXTRA_EMAIL, arrayOf(send_to))
        mail_send.putExtra(Intent.EXTRA_SUBJECT, "Kirim email intent")
        try {
            //mulai kirim email
            startActivity(Intent.createChooser(mail_send, "Choose Email Client..."))
        }
        catch (e: Exception){
            //
            //jika ada yang salah misalnya tidak ada aplikasi email
            //tampil pesan errornya
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }
    }
    private fun webClicked(url: String){
        val showWebIntent = Intent(this, PhoneWebView::class.java)
        showWebIntent.putExtra("url",url)
        startActivity(showWebIntent)
    }
}