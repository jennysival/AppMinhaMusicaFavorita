package br.com.zup.minhaMusicaFavorita.detalhesViewPager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minhaMusicaFavorita.databinding.AlbumItemBinding
import br.com.zup.minhaMusicaFavorita.detalhesViewPager.model.Album

class AlbumAdapter(
    private var listaDeAlbuns: MutableList<Album>,
    private val clickNoAlbum: (album: Album) -> Unit

): RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    class ViewHolder(val binding: AlbumItemBinding): RecyclerView.ViewHolder(binding.root){

        fun adicionarAlbumNaView(album: Album){
            binding.ivAlbumNaLista.setImageResource(album.getImagem())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val album = listaDeAlbuns[position]
        holder.adicionarAlbumNaView(album)
        holder.binding.cvAlbumItem.setOnClickListener {
            clickNoAlbum(album)
        }
    }

    override fun getItemCount(): Int {
        return listaDeAlbuns.size
    }

    fun atualizarListaAlbuns(novaLista: MutableList<Album>){
        if(listaDeAlbuns.size == 0){
            listaDeAlbuns = novaLista
        }
        else{
            listaDeAlbuns.addAll(novaLista)
        }
        notifyDataSetChanged()
    }
}