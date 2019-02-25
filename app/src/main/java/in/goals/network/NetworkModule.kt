package `in`.goals.network


import `in`.goals.BuildConfig
import `in`.goals.utils.API_HOST
import android.graphics.drawable.Drawable
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {


    @Provides
    @Singleton
    fun buildNetworkApi(): `in`.goals.network.ApiHandler {
        val clientBuilder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            clientBuilder.interceptors().add(logging)
        }

        return Retrofit.Builder().client(clientBuilder.build())
                .baseUrl(API_HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(`in`.goals.network.ApiHandler::class.java)

    }


    @Provides
    @Singleton
    fun provideGoalsNetworkLayer(apiHandler: `in`.goals.network.ApiHandler) :NetworkManager= NetworkManager(apiHandler);
}
