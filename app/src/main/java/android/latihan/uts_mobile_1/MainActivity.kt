package android.latihan.uts_mobile_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createFacData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter = tampil_adapter(testData, { phoneItem : fakultasData -> phoneItemClicked(phoneItem) })
    }

    private fun phoneItemClicked(phoneItem : fakultasData){
        val showDetailActivityIntent = Intent(this, PhoneDetailActivity::class.java)
        showDetailActivityIntent.putExtra("resepNama",phoneItem.facName)
        showDetailActivityIntent.putExtra("foto", phoneItem.photo.toString())
        showDetailActivityIntent.putExtra("desc", phoneItem.desc)
        startActivity(showDetailActivityIntent)
    }

    private fun createFacData() : List<fakultasData>{
        val faklist = ArrayList<fakultasData>()
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS EKONOMI DAN BISNIS","Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "1.   Ekonomi Pembangunan\n" +
                "2.   Akuntansi\n" +
                "3.   Manajemen"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS PERTANIAN","Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "1.   Agroteknologi\n" +
                "2.   Agribisnis"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS TEKNIK","Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "1.   Teknik Kimia\n" +
                "2.   Teknik Industri\n" +
                "3.   Teknik Sipil\n" +
                "4.   Teknik Lingkungan\n" +
                "5.   Teknik Pangan"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS ILMU KOMPUTER","Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "1.   Teknik Informatika \n" +
                "2.   Sistem Informasi"))
        faklist.add(fakultasData(R.drawable.foto_ku_1,"RIZKI AKBAR","Halo perkenalkan nama saya Rizki Akbar lahir di Jember, Jawa Timur pada tanggal 7 Mei 1999. Berikut data diri saya : \n" +
                "\n" +
                "No Hp \t\t\t: 085334727663\n" +
                "Email \t\t\t\t: akasa2444@gmail.com\n" +
                "Alamat \t\t\t: Rungkut Mejoyo Selatan 4/4, Surabaya\n"+
                "Url github \t: https://github.com/akasa885\n" +
                "Riwayat Pendidikan :\n" +
                "1.  SDN Kendangsari 5 Surabaya\n" +
                "2.  SMPN 35 Surabaya\n" +
                "3.  SMAN 16 Surabaya\n" +
                "Penghargaan : -"))
        return faklist
    }
}