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
        showDetailActivityIntent.putExtra("email", phoneItem.email)
        showDetailActivityIntent.putExtra("web", phoneItem.web)
        startActivity(showDetailActivityIntent)
    }

    private fun createFacData() : List<fakultasData>{
        val faklist = ArrayList<fakultasData>()
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS EKONOMI DAN BISNIS","Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "Visi"+
                "\n"+
                "Menjadi Fakultas Ekonomi Dan Bisnis Unggul Berkarakter Bela Negara\n"+
                "\n"+
                "1.   S1 Ekonomi Pembangunan\n" +
                "2.   S1 Akuntansi\n" +
                "3.   S1 Manajemen","feb@upnjatim.ac.id","http://febis.upnjatim.ac.id/"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS PERTANIAN","Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "Visi"+
                "\n"+
                "TERWUJUDNYA FAKULTAS YANG UNGGUL DALAM PEMBANGUNAN IPTEKS PERTANIAN DAN KEWIRAUSAHAAN, BERJEJARING GLOBAL SERTA BERKARAKTER BELANEGARA \n"+
                "\n"+
                "1.   S1 Agroteknologi\n" +
                "2.   S1 Agribisnis","-","http://faperta.upnjatim.ac.id/"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS TEKNIK","Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "Visi"+
                "\n"+
                "Menjadi Fakultas Teknik Unggul Berkarakter Bela Negara\n"+
                "\n"+
                "1.   S1 Teknik Kimia\n" +
                "2.   S1 Teknik Industri\n" +
                "3.   S1 Teknik Sipil\n" +
                "4.   S1 Teknik Lingkungan\n" +
                "5.   S1 Teknik Pangan","-","http://ft.upnjatim.ac.id/"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS ILMU KOMPUTER","Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "Visi"+
                "\n"+
                "Menjadi Fakultas Ilmu Komputer Unggul Berkarakter Bela Negara\n"+
                "\n"+
                "1.   S1 Teknik Informatika \n" +
                "2.   S1 Sistem Informasi","-","https://fik.upnjatim.ac.id/"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS ILMU SOSIAL DAN ILMU POLITIK","Fakultas Ilmu Sosial dan Ilmu Politik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "Visi"+
                "\n"+
                "Menjadi Fakultas Ilmu Sosial dan Ilmu Politik Unggul Berkarakter Bela Negara\n"+
                "\n"+
                "1.   S1 Ilmu Komunikasi \n" +
                "2.   S1 Ilmu Administrasi Bisnis \n"+
                "3.   S1 Ilmu Administrasi Negara \n"+
                "4.   S1 HUbungan Internasional","-","http://fisip.upnjatim.ac.id/"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS ARSITEKTUR DAN DESAIN","Fakultas Arsitektur dan Desain merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "Visi"+
                "\n"+
                "Menjadi Fakultas Arsitektur dan Desain Unggul Berkarakter Bela Negara\n"+
                "\n"+
                "1.   S1 Teknik Arsitektur \n" +
                "2.   S1 Desain Komunikasi Visual","-","http://fad.upnjatim.ac.id/"))
        faklist.add(fakultasData(R.drawable.upn_logo,"FAKULTAS HUKUM","Fakultas Hukum merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi: \n" +
                "\n" +
                "Visi"+
                "\n"+
                "MENJADI FAKULTAS UNGGUL BERKARAKTER BELA NEGARA DALAM MENGHASILKAN LULUSAN DALAM BIDANG HUKUM SECARA TEORITIK DAN PRAKTIS\n"+
                "\n"+
                "1.   S1 Hukum \n","fad@upnjatim.ac.id","http://fhukum.upnjatim.ac.id/"))
        faklist.add(fakultasData(R.drawable.foto_ku_1,"RIZKI AKBAR","Halo perkenalkan nama saya Rizki Akbar lahir di Jember, Jawa Timur pada tanggal 7 Mei 1999. Berikut data diri saya : \n" +
                "\n" +
                "No Hp \t\t\t: 085334727663\n" +
                "Alamat \t\t\t: Rungkut Mejoyo Selatan 4/4, Surabaya\n"+
                "Url profile \t: http://rizkiakbar.xyz\n" +
                "Riwayat Pendidikan :\n" +
                "1.  SDN Kendangsari 5 Surabaya\n" +
                "2.  SMPN 35 Surabaya\n" +
                "3.  SMAN 16 Surabaya\n" +
                "Penghargaan : -","akasa2444@gmail.com","https://github.com/akasa885"))
        return faklist
    }
}