package br.com.zup.minhaMusicaFavorita.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.minhaMusicaFavorita.*
import br.com.zup.minhaMusicaFavorita.databinding.FragmentFotosBinding
import br.com.zup.minhaMusicaFavorita.model.Album

class FotosFragment : Fragment() {
    private lateinit var binding: FragmentFotosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFotosBinding.inflate(inflater,container,false)
        return binding.root
    }

    private fun adicionarAlbumNaLista(){
        val listaAlbuns = mutableListOf<Album>()

        listaAlbuns.add(Album(R.drawable.album1,
            IMG_DESCR_ALBUM1,TITULO_ALBUM1, DESCRICAO_ALBUM1, LANCAMENTO_2009,
            GRAVADORA_LAB_FANTASMA, ESTUDIOS_ALBUM1, FORMATO_CD_MIX, GENERO_HIPHOP))
    }
}