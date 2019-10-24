package com.moondeeply.banjarwonderful.model;

import com.moondeeply.banjarwonderful.R;

import java.util.ArrayList;

public class PlaceData {
    private static String[] placeName = {
            "Bukit Batas",
            "Puncak Matang Keladan",
            "Air Terjun Mandin Mangapan Paramasan",
            "Pulau Pinus 2",
            "Air Terjun Lembah Kahung",
            "Waduk / Danau Riam Kanan",
            "Sungai Kembang Aranio",
            "Danau Tamiyang Desa Mandikapau Barat",
            "Pasar Terapung Lok Baintan",
            "Rumah Adat Banjar"
    };

    private static String[] placeDetail = {
            "Bukit Batas merupakan bagian dari Desa Tiwingan Baru Kecamatan Aranio Kabupaten Banjar Kalimantan Selatan. Sering disebut juga Bendungan/danau Riam Kanan. merupakan obyek wisata yang menarik bagi para Pencinta Alam atau Wisatawan petualang karena puncak gunung dapat dilalui dengan perjalanan (PP 120 menit). Dipuncak gunungnya dapat melihat pulau-pulau kecil yang ada dalam Waduk Riam Kanan dengan terpaan angin Sepoi-sepoi.",
            "Bukit Matang Kaladan terletak di Desa Tiwingan Lama, Kecamatan Aranio dengan kemiringan lerengnya yang lebih dari 45°. Tapi masyarakat sekitar sudah memfasilitasi dengan undakan dan tali/rotan yang dibentangkan agar memudahkan pengunjung untuk mendaki menuju puncak. Lama pendakian tergantung daya tahan stamina masing-masing orang mungkin sekitar 25 menit dan kita bisa menikmati keindahan Panorama Alam dari puncak Matang Keladan. Selain Pemandangan Alam yang sangat indah disana juga Spot untuk berfoto yang sangat indah dan kekinian.",
            "Berlokasi di Desa Paramasan Atas, Kecamatan Peramasan, sebuah air terjun dengan ketinggian lebih kurang 30 meter, berada di pedalaman kalimantan selatan pasnya di Gunung Ambilatau Desa Paramasan Atas, Jarak untuk menempuh perjalanan kurang lebih akan menghabiskan waktu selama 3 jam menuju Kecamatan Paramasan didalam perjalanan pengunjung akan melewati lokasi pedesaan Bancing dan Peramasan atas yang dihuni oleh masyarakat suku Dayak Paramasan.",
            "Pulau Pinus merupakan salah satu Destinasi Wisata Kabupaten Banjar yang terletak di Waduk Riam Kanan, tepat ditengah waduk tersebut terdapat dua pualu yang ditumbuhi hutan pinus. Pohon pinus bisa tumbuh hingga mencapai 25 hingga 45 m dengan ketebalan batang sekitar 1 meter. Oleh karena itu, kedua pulau ini disebut dengan Pulau Pinus.",
            "Dilokasi ini akan kita lihat pemandangan asli sebuah alam tropis nan indah dengan aneka flora dan fauna yang menghuninya. Menyususri jalan setapak ditengah hutan yang teduh memberikan kedamaian tersendiri dalam diri setiap orang yang melaluinya.  Air yang meluncur deras dari air terjun setinggi 25 meter dan lebar 8 meter adalah pemandangan indah di puncak petualangan itu. Sementara perjalanan menuju kesana, riak air diantara jeram yang berliku dan menakjubkan menjadi teman setia.",
            "Waduk / Danau  seluas lebih kurang 8.000 Ha dengan fungsi utama sebagai Pembangkit Listrik Tenaga Air satu-satunya di Propinsi Kalimantan Selatan. Berperan penting sebagai pengatur tata air, mencegah erosi dan banjir, sebagai objek wisata alam, danau/waduk ini memiliki bentang alam yang menarik dengan panorama danau, lembah dan bukit disekelilingnya serta untuk kegiatan olahraga air.Pegunungan Meratus yang indah dan hijau mengelilingi Danau Riam Kanan.",
            "Sungai Kembang terletak 64 KM dari Banjarmasin Ibukota Kalimantan Selatan tepatnya di Desa Tambela Kecamatan Aranio. Dengan Pemandangan yang begitu Indah, banyak pohon pinus berjejer membentuk barisan teratur. Di sini anda akan disajikan panorama alam yang sangat indah sekali diselingi oleh gemuruh arus yang deras melewati bebatuan.",
            "Danau Tamiyang yang berada di Desa Mandikapau Barat Kecamatan Karang Intan terlihat begitu indah. Permukaan danau yang membiru dengan latar belakang bukit di belakangnya membuat danau itu terlihat eksotik. . Danau itu juga telah dilengkapi dengan fasilitas berupa bebek air serta beberapa spot untuk berfoto selfie yang keren dan kekinian selain itu ada wahana permainan baru yaitu Banana Boat.",
            "Pasar Terapung Lok Baintan sudah berlangsung sejak abad 18 di sepanjang pesisir aliran Sungai Martapura. Rata-rata para pedagang berasal dari kampung sekitar diantaranya seperti Sungai Lenge, Sungai Bakung, Sungai Paku Alam, Sungai Saka Bunut, Sungai Madang, Sungai Tanifah, dan Sungai Lok Baintan. Aktivitas perdagangan dimulai pukul 06.00 pagi sampai dengan pukul 09.30 WITA. Para pedagang bisa menjual dagangan mereka secara grosir atau eceran, di Pasar Terapung ini masih berlaku sistem barter, besaran dan keberimbangan jumlah hasil barter tergantung kesepakatan antar kedua belah pihak.",
            "Meski sudah berusia 202 tahun, rumah tersebut masih terlihat kokoh dan menarik. Didalam rumah tersebut dapat anda lihat interior ukiran khas Banjar. Bahan bangunannya semua dari kayu ulin dengan konstruksi Rumah Ba-anjung atau Rumah Bumbungan Tinggi dengan konstruksi pokoknya yang terbagi menjadi beberapa bagian. Bangunan yang memanjang lurus kedepan, merupakan Bangunan Induk, bangunan yang menempel pada sisi kanan dan kiri disebut Anjung. Bubungan atap yang Memanjang kebelakang disebut Atap Hambin Awan. Bubungan atap yang memanjang ke depan disebut Atap Sindang Langit sedangkan bubungan atap yang tinggi melancip disebut Bubungan Tinggi."
    };

    private static int[] placeImage = {
            R.drawable.bukit_batas,
            R.drawable.puncak_matang_keladan,
            R.drawable.air_terjun_mandin_mangapan_paramasan,
            R.drawable.pulau_pinus_2,
            R.drawable.air_terjun_lembah_kahung,
            R.drawable.waduk_danau_riam_kanan,
            R.drawable.sungai_kembang_aranio,
            R.drawable.danau_tamiyang_desa_mandikapau_barat,
            R.drawable.pasar_terapung_lok_baintan,
            R.drawable.rumah_adat_banjar
    };

    public static ArrayList<Place> getListData() {
        ArrayList<Place> list = new ArrayList<>();
        for (int position = 0; position < placeName.length; position++) {
            Place place = new Place();
            place.setName(placeName[position]);
            place.setDetail(placeDetail[position]);
            place.setPhoto(placeImage[position]);
            list.add(place);
        }
        return list;
    }
}
