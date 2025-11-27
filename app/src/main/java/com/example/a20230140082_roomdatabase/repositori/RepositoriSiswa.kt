package com.example.a20230140082_roomdatabase.repositori

import com.example.a20230140082_roomdatabase.room.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}