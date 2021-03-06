package com.aleesha.lib.image.loader.di

import com.aleesha.lib.image.loader.abstraction.ImageLoader
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface ImageLoaderEntryPoint {
    fun imageLoaderBareBoneProvider(): ImageLoader
}
