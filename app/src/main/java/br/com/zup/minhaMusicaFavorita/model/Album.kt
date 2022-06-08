package br.com.zup.minhaMusicaFavorita.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

class Album(
    private var imagem: Int,
    private var titulo: String,
    private var descricao: String,
    private var lancamento: String,
    private var gravadora: String,
    private var estudio: String,
    private var formato: String,
    private var genero: String
): Parcelable {

    fun getImagem() = imagem
    fun getTitulo() = titulo
    fun getDescricao() = descricao
    fun getLancamento() = lancamento
    fun getGravadora() = gravadora
    fun getEstudio() = estudio
    fun getFormato() = formato
    fun getGenero() = genero

}