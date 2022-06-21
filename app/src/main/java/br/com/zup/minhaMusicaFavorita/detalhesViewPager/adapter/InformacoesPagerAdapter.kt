package br.com.zup.minhaMusicaFavorita.detalhesViewPager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minhaMusicaFavorita.detalhesViewPager.fotos.FotosFragment
import br.com.zup.minhaMusicaFavorita.detalhesViewPager.informacoes.InformacoesFragment

class InformacoesPagerAdapter(fragmentManager: FragmentManager,
                              lifecycle: Lifecycle,
                              private var listaTabs: List<String>
                              ): FragmentStateAdapter(fragmentManager, lifecycle) {


    override fun getItemCount(): Int {
        return listaTabs.size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return InformacoesFragment()
            1 -> return FotosFragment()
        }
        return InformacoesFragment()
    }


}