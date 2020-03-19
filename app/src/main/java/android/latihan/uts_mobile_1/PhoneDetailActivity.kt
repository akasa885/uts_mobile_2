package android.latihan.uts_mobile_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*

class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)


        part_foto.setImageResource(getIntent().getStringExtra("foto").toInt())
        part_title.text = getIntent().getStringExtra("resepNama")
        entire_resep.text = getIntent().getStringExtra("desc")
    }
}