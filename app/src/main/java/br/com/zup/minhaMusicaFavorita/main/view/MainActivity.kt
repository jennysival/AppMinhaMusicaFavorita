package br.com.zup.minhaMusicaFavorita.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhaMusicaFavorita.databinding.ActivityMainBinding
import br.com.zup.minhaMusicaFavorita.detalhesViewPager.Detalhes

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDetalhes.setOnClickListener {
            val intent = Intent(this, Detalhes::class.java)
            startActivity(intent)
        }
    }
}