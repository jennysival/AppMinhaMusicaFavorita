package br.com.zup.minhaMusicaFavorita.main.repository

import br.com.zup.minhaMusicaFavorita.R

class MainRepository {

    fun getImage(): Int{
        return R.drawable.foto_emicida
    }

    fun getTitle(): String{
        return "É Tudo Pra Ontem"
    }

    fun getSubTitle(): String{
        return "(part. Gilberto Gil)"

    }

    fun getLyrics(): String{
        return R.string.texto_letra_musica.toString()
    }
}