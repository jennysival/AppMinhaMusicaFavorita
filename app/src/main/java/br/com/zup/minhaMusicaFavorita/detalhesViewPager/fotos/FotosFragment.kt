package br.com.zup.minhaMusicaFavorita.detalhesViewPager.fotos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minhaMusicaFavorita.*
import br.com.zup.minhaMusicaFavorita.detalhesViewPager.adapter.AlbumAdapter
import br.com.zup.minhaMusicaFavorita.databinding.FragmentFotosBinding
import br.com.zup.minhaMusicaFavorita.detalhesViewPager.model.Album
import br.com.zup.minhaMusicaFavorita.utilitaria.CHAVE_ALBUM

class FotosFragment : Fragment() {
    private lateinit var binding: FragmentFotosBinding
    private val albumAdapter: AlbumAdapter by lazy {
        AlbumAdapter(arrayListOf(), this::irParaDetalheAlbum)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFotosBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adicionarAlbumNaLista()

    }

    private fun exibirRecycler(){
        binding.rvListaAlbuns.adapter = albumAdapter
        binding.rvListaAlbuns.layoutManager = GridLayoutManager(context,2)
    }

    private fun adicionarAlbumNaLista(){
        val listaAlbuns = mutableListOf<Album>()

        listaAlbuns.add(Album(
            ART_EMICIDA, R.drawable.album1,
            IMG_DESCR_ALBUM1,TITULO_ALBUM1, DESCRICAO_ALBUM1, LANCAMENTO_2009,
            GRAVADORA_LAB_FANTASMA, ESTUDIOS_ALBUM1, FORMATO_CD_MIX, GENERO_HIPHOP))

        listaAlbuns.add(Album(
            ART_EMICIDA, R.drawable.album2,
            IMG_DESCR_ALBUM2, TITULO_ALBUM2, DESCRICAO_ALBUM2, LANCAMENTO_2010,
            GRAVADORAS_ALBUM2, ESTUDIOS_ALBUM2, FORMATO_CD_MIX, GENERO_HIPHOP))

        listaAlbuns.add(Album(
            ART_EMICIDA_BEATNICK, R.drawable.album3,
            IMG_DESCR_ALBUM3, TITULO_ALBUM3, DESCRICAO_ALBUM3, LANCAMENTO_2011,
            GRAVADORA_LAB_FANTASMA, ESTUDIO_FORADOEIXO, FORMATO_ALBUM3, GENERO_HIP_LATIN))

        listaAlbuns.add(Album(
            ART_EMICIDA, R.drawable.album4,
            IMG_DESCR_ALBUM4, TITULO_ALBUM4, DESCRICAO_ALBUM4, LANCAMENTO_2013,
            GRAVADORAS_ALBUM4, ESTUDIO_ALBUM4, FORMATO_ALBUM4, GENERO_HIP_LATIN))

        listaAlbuns.add(Album(
            ART_VARIOS, R.drawable.album5,
            IMG_DESCR_ALBUM5, TITULO_ALBUM5, DESCRICAO_ALBUM5, LANCAMENTO_2013,
            GRAVADORAS_ALBUM5, ESTUDIO_ALBUM5, FORMATO_CD_ALBUM, GENERO_ALBUM5))

        listaAlbuns.add(Album(
            ART_EMICIDA_CRIOLO, R.drawable.album6,
            IMG_DESCR_ALBUM6, TITULO_ALBUM6, DESCRICAO_ALBUM6, LANCAMENTO_2013,
            GRAVADORA_OLOKO, ESTUDIO_ALBUM6, FORMATO_CD_ALBUM, GENERO_HIPHOP))

        albumAdapter.atualizarListaAlbuns(listaAlbuns)

        exibirRecycler()

    }

    private fun irParaDetalheAlbum(album: Album){
        val bundle = bundleOf(CHAVE_ALBUM to album)

        val intent = Intent(context, DetalhesAlbum::class.java)
        intent.putExtra(CHAVE_ALBUM, album)
        startActivity(intent)

    }
}