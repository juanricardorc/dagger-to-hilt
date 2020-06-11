package com.juanricardorc.mainmenu

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class MainModule {

    @Provides
    @Named("author")
    fun getAuthor(@ActivityContext context: Context): String {
        return " John Richard R.C"
    }

    @Provides
    @Named("book")
    fun getAuthorAndBook(@ActivityContext context: Context): String {
        return " El regreso de la Anaconda"
    }
}