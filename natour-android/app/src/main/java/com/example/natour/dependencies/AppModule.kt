package com.example.natour.dependencies

import android.content.Context
import com.example.natour.MainActivity
import com.example.natour.user.MainUser
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideCoroutineDispatcher() : CoroutineDispatcher = Dispatchers.Default

    @Provides
    @Singleton
    fun provideMainUserObject(): MainUser = MainUser

    @Provides
    @Singleton
    fun provideContext(): Context = MainActivity.context
}
