package br.com.zup.minhaMusicaFavorita.main.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.minhaMusicaFavorita.main.repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository = MainRepository()

    private val _responseImage: MutableLiveData<Int> = MutableLiveData()
    val responseImage: LiveData<Int> = _responseImage

    private val _responseTitle: MutableLiveData<String> = MutableLiveData()
    val responseTitle: LiveData<String> = _responseTitle

    private val _responseSubTitle: MutableLiveData<String> = MutableLiveData()
    val responseSubTitle: LiveData<String> = _responseSubTitle

    private val _responseLyrics: MutableLiveData<String> = MutableLiveData()
    val responseLyrics: LiveData<String> = _responseLyrics

    fun getImage(){
        try {
            _responseImage.value = repository.getImage()
        }catch (ex: Exception){
            Log.i("Error","-----> ${ex.message}")
        }
    }

    fun getTitle(){
        try {
            _responseTitle.value = repository.getTitle()
        }catch (ex: Exception){
            Log.i("Error","-----> ${ex.message}")
        }
    }

    fun getSubTitle(){
        try {
            _responseSubTitle.value = repository.getSubTitle()
        }catch (ex: Exception){
            Log.i("Error","-----> ${ex.message}")
        }
    }

    fun getLyrics(){
        try {
            _responseLyrics.value = repository.getLyrics()
        }catch (ex: Exception){
            Log.i("Error","-----> ${ex.message}")
        }
    }

}