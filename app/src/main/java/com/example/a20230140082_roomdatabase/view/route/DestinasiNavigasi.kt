package com.example.a20230140082_roomdatabase.view.route

interface DestinasiNavigasi {
    /**
     * nama unik untuk menentukan jalur untuk composable
     */
    val route: String

    /**
     * string resource id yang berisi judul yang akan ditampilkan di layar halaman
     */
    val titleRes: Int
}