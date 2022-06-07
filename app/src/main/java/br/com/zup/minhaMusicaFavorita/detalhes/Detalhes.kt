package br.com.zup.minhaMusicaFavorita.detalhes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minhaMusicaFavorita.R
import br.com.zup.minhaMusicaFavorita.adapter.InformacoesPagerAdapter
import br.com.zup.minhaMusicaFavorita.databinding.ActivityDetalhesBinding
import com.google.android.material.tabs.TabLayoutMediator

class Detalhes : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesBinding
    private val listaTabs = listOf("Informações","Fotos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirTabs()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhes_banda)
    }

    private fun exibirTabs(){
        val adapter = InformacoesPagerAdapter(supportFragmentManager, lifecycle, listaTabs)
        binding.viewPagerDetalhes.adapter = adapter

        TabLayoutMediator(binding.tabDetalhes, binding.viewPagerDetalhes) { tab, position ->
            tab.text = listaTabs[position]
        }.attach()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}