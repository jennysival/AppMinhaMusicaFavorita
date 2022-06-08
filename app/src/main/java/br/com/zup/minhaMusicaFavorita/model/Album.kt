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

    fun getImagem() = this.imagem
    fun getTitulo() = this.titulo
    fun getDescricao() = this.descricao
    fun getLancamento() = this.lancamento
    fun getGravadora() = this.gravadora
    fun getEstudio() = this.estudio
    fun getFormato() = this.formato
    fun getGenero() = this.genero

}