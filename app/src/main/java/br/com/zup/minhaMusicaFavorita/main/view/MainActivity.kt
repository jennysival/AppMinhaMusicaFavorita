package br.com.zup.minhaMusicaFavorita.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import br.com.zup.minhaMusicaFavorita.databinding.ActivityMainBinding
import br.com.zup.minhaMusicaFavorita.detalhesViewPager.Detalhes
import br.com.zup.minhaMusicaFavorita.main.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getImage()
        viewModel.getTitle()
        viewModel.getSubTitle()
        viewModel.getLyrics()
        observables()

        binding.btnDetalhes.setOnClickListener {
            val intent = Intent(this, Detalhes::class.java)
            startActivity(intent)
        }
    }

    private fun observables(){
        viewModel.responseImage.observe(this) {
            binding.ivFotoMain.setImageResource(it)
        }

        viewModel.responseTitle.observe(this) {
            binding.tvTituloMain.text = it
        }

        viewModel.responseSubTitle.observe(this) {
            binding.tvSubTituloMain.text = it
        }

        viewModel.responseLyrics.observe(this) {
            binding.tvLetraMain.text = it
        }

    }
}