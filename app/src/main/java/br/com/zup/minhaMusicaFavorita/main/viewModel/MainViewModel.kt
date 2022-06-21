package br.com.zup.minhaMusicaFavorita.main.viewModel

import androidx.lifecycle.ViewModel
import br.com.zup.minhaMusicaFavorita.main.repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository = MainRepository()
}