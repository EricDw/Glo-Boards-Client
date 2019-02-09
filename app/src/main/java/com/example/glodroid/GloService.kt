package com.example.glodroid

import com.example.glodroid.dtos.BoardColumnDTO
import com.example.glodroid.dtos.BoardCreationSuccessDTO
import com.example.glodroid.dtos.BoardsDTO
import retrofit2.Call
import retrofit2.http.*

const val GLO_BASE_URL: String = "https://gloapi.gitkraken.com/v1/glo/"
const val END_POINT_GLO_BOARDS: String = "boards/"
const val END_POINT_GLO_COLUMNS: String = "columns/"

interface GloService {

    @GET(END_POINT_GLO_BOARDS)
    fun getBoards(
        @Header("Authorization") key: String
    ) : Call<List<BoardsDTO>>

    @POST("$END_POINT_GLO_BOARDS/{boardId}/$END_POINT_GLO_COLUMNS")
    fun putColumn(
        @Header("Authorization") key: String,
        @Path("boardId") boardId: String,
        @Body boardColumnDTO: BoardColumnDTO
    ) : Call<BoardCreationSuccessDTO>

}