package com.example.habib.listviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvFlagList;
    static List<SocialType> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        lvFlagList = findViewById( R.id.lv_list );
        dataList =new ArrayList <>(  );
        dataList.add( new SocialType( R.drawable.pinterest, "Pinterest", "virtual pinboard di mana Anda bisa mengunggah foto atau gambar yang bisa dimasukkan kedalam kategori-kategori (semacam album atau folder) yang bisa di customize namanya. Semisal kategori 'food and drink' di mana berisi foto dan gambar makanan dan minuman."));
        dataList.add( new SocialType( R.drawable.soundcloud, "Soundcloud", "sebuah platform distribusi suara secara online yang memungkinkan kolaborasi, promosi, dan distribusi dari rekaman suara."));
        dataList.add( new SocialType( R.drawable.facebook, "Facebook", "sebuah layanan jejaring sosial berkantor pusat di Menlo Park, California, Amerika Serikat yang diluncurkan pada bulan Februari 2004. Hingga September 2012, Facebook memiliki lebih dari satu miliar pengguna aktif,[8] lebih dari separuhnya menggunakan telepon genggam.[9] Pengguna harus mendaftar sebelum dapat menggunakan situs ini. Setelah itu, pengguna dapat membuat profil pribadi, menambahkan pengguna lain sebagai teman, dan bertukar pesan, termasuk pemberitahuan otomatis ketika mereka memperbarui profilnya. "));
        dataList.add( new SocialType( R.drawable.google_plus, "Google Plus", "Google+ atau Google Plus adalah jejaring sosial yang dioperasikan oleh Google Inc. Google+ diluncurkan pada 28 Juni 2011 dengan sistem undangan untuk diuji coba.[2] Pada hari tersebut, pengguna Google+ diizinkan untuk mengundang teman di atas 18 tahun, untuk membuat akun."));
        dataList.add( new SocialType( R.drawable.twitter, "Twitter", "Twitter (/ˈtwɪtər/) adalah layanan jejaring sosial dan mikroblog daring yang memungkinkan penggunanya untuk mengirim dan membaca pesan berbasis teks hingga 140 karakter akan tetapi pada tanggal 07 November 2017 bertambah hingga 280 karakter yang dikenal dengan sebutan kicauan (tweet). Twitter didirikan pada bulan Maret 2006 oleh Jack Dorsey, dan situs jejaring sosialnya diluncurkan pada bulan Juli. "));
        dataList.add( new SocialType( R.drawable.linkedin, "Linkedin", "LinkedIn adalah situs web jaringan sosial yang berorientasi bisnis, terutama digunakan untuk jaringan profesional. Sampai April 2018 Linkedin menyatakan memiliki lebih dari 546 juta pengguna di lebih dari 200 negara dan wilayah di seluruh dunia, meliputi 150 industri dan lebih dari 400 bidang ekonomi yang diklasifikasi menurut jasanya. Sedangan Statista.com menyatakan hingga April 2018, Linkedin memilik 260 juta pengguna aktif."));
        dataList.add( new SocialType( R.drawable.flickr, "Flickr",  "Flickr merupakan situs web untuk berbagi foto dan situs komunitas daring yang merupakan contoh dari aplikasi Web 2.0. Sebagai situs web yang populer untuk berbagi foto pribadi, layanan ini dimanfaatkan oleh banyak blogger sebagai tempat penyimpanan foto. Popularitasnya bertambah seiring peralatan komunitas online yang inovatif yang memperbolehkan foto-foto diberi tanda dan dicari secara folksonomi."));
        dataList.add( new SocialType( R.drawable.instagram, "Instagram",  "Instagram (juga disebut IG atau Insta[9]) adalah sebuah aplikasi berbagi foto dan video yang memungkinkan pengguna mengambil foto, mengambil video, menerapkan filter digital, dan membagikannya ke berbagai layanan jejaring sosial, termasuk milik Instagram sendiri.[10] Satu fitur yang unik di Instagram adalah memotong foto menjadi bentuk persegi, sehingga terlihat seperti hasil kamera Kodak Instamatic dan polaroid. Hal ini berbeda dengan rasio aspek 4:3 atau 16:9 yang umum digunakan oleh kamera pada peranti bergerak."));



        SocialAdapter adapter = new SocialAdapter( getApplicationContext(),dataList );
        lvFlagList.setAdapter( adapter );

        lvFlagList.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Intent intent = new Intent( getApplicationContext(),DetailsActivity.class );
                intent.putExtra( "key", position );
                startActivity( intent );
            }
        } );
    }
}
