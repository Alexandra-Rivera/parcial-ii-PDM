package com.arivera.parcialiipdm.repository

import com.arivera.parcialiipdm.data.modelo.VideoGameModel

class VideogameRepository(private val videogameList: MutableList<VideoGameModel>) {
    fun getVideogames() = videogameList

    fun addNewVideogame(videogame: VideoGameModel) = videogameList.add(videogame)
}