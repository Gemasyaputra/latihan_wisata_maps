package com.gema.latihan_wisata_bukittinggi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_wisata_bukittinggi.adapter.adapterWisata
import com.gema.latihan_wisata_bukittinggi.model.modelWisata

class ListActivity : AppCompatActivity() {

    private lateinit var recyclerViewMenu: RecyclerView
    private lateinit var adapterMenu: adapterWisata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list)

        val menuIcons = listOf(

        modelWisata(
            R.drawable.img_2,
            "Candi borobudur",
            "Magelang",
            "Dibangun dari abad ke-9, situs ini terkenal sebagai candi Buddha terbesar di dunia",
            -7.604879709882314, 110.2035859416411
        ),
            modelWisata(
                R.drawable.img_1,
                "Jam gadang Bukittinggi",
                "Bukittinggi, Sumatera Barat",
                "Jam Gadang adalah menara jam yang menjadi penanda atau ikon Kota Bukittinggi Sumatera Barat Indonesia. Menara jam ini menjulang setinggi 27 meter dan diresmikan pembangunannya pada 25 Juli 1927",
                -0.3049441760037679,
                100.36948795756079
            ),
            modelWisata(
                R.drawable.img_4,
                "Ulun danu Beratan Bedugul",
                "Bali",
                "Pura Ulun Danu Bratan, Pura Ulun Danu Beratan atau Bratan Pura merupakan sebuah pura dan candi air besar di Bali, Indonesia - candi utama air lainnya menjadi Pura Ulun Danu Batur. Kompleks candi ini terletak di tepi barat laut Danau Bratan di pegunungan dekat Bedugul, Kabupaten Tabanan",
                -8.275021434769968,
                115.16680193649081
            ),
            modelWisata(
                R.drawable.img_,
                "Labuan Bajo",
                "NTT",
                "Labuan Bajo merupakan salah satu kelurahan yang berada di Kecamatan Komodo, Kabupaten Manggarai Barat, Provinsi Nusa Tenggara Timur, Indonesia. Labuan Bajo juga merupakan pusat pemerintahan dari Kecamatan Komodo dan sekaligus merupakan ibu kota Kabupaten Manggarai Barat",
                -8.437930350601835, 119.86714452945427
            ),
            modelWisata(
                R.drawable.img_3,
                "Danau Toba",
                "Sumatera Utara",
                "Danau Toba adalah danau alami berukuran besar di Sumatera Utara, Indonesia yang terletak di kaldera gunung supervulkan. Danau ini memiliki panjang 100 kilometer, lebar 30 kilometer, dan kedalaman 508 meter. Danau ini terletak di tengah pulau Sumatra bagian utara dengan ketinggian permukaan sekitar 900 mete",
                2.8018526643909647, 98.77124925053705
            )

        )

        recyclerViewMenu = findViewById(R.id.rvWisata)
        recyclerViewMenu.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        adapterMenu = adapterWisata(menuIcons)
        recyclerViewMenu.adapter = adapterMenu

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}