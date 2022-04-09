package com.maotom.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect

object FlowDome {

    suspend fun flow(){
        listOf(1,2,3).asFlow().collect {
            delay(200)
            println(it)
        }
    }
}