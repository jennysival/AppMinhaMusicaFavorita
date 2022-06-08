package br.com.zup.minhaMusicaFavorita.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minhaMusicaFavorita.databinding.AlbumItemBinding
import br.com.zup.minhaMusicaFavorita.model.Album

class AlbumAdapter(
    private var listaDeAlbuns: MutableList<Album>,
    private val clickNoAlbum: (album: Album) -> Unit
): RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    class ViewHolder(val binding: AlbumItemBinding): RecyclerView.ViewHolder(binding.root){

        fun exibirAlbum(){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return listaDeAlbuns.size
    }
}