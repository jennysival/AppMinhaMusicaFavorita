package br.com.zup.minhaMusicaFavorita.detalhes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minhaMusicaFavorita.R
import br.com.zup.minhaMusicaFavorita.databinding.ActivityDetalhesAlbumBinding
import br.com.zup.minhaMusicaFavorita.model.Album
import br.com.zup.minhaMusicaFavorita.utilitaria.CHAVE_ALBUM

class DetalhesAlbum : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperarDadosAlbum()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhes_album)
    }

    private fun recuperarDadosAlbum(){
        val album = intent.getParcelableExtra<Album>(CHAVE_ALBUM)

        if(album != null){
            binding.ivImagemAlbum.setImageResource(album.getImagem())
            binding.ivImagemAlbum.contentDescription = album.getImgDescr()
            binding.tvTituloAlbum.text = album.getTitulo()
            binding.tvDescricaoAlbum.text = album.getDescricao()
            binding.tvNomeArtista.text = album.getArtista()
            binding.tvInsiraLancamento.text = album.getLancamento()
            binding.tvInsiraGravadora.text = album.getGravadora()
            binding.tvInsiraEstudio.text = album.getEstudio()
            binding.tvInsiraFormato.text = album.getFormato()
            binding.tvInsiraGeneros.text = album.getGenero()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}