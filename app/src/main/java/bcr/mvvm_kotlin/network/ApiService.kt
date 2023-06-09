package bcr.mvvm_kotlin.network

import bcr.mvvm_kotlin.model.Repository
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by gulam
 */

interface ApiService {

    @GET("api?format=json")
    fun getRepositories(): Observable<List<Repository>>

}

