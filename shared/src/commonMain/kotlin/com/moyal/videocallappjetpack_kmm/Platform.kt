package com.moyal.videocallappjetpack_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform