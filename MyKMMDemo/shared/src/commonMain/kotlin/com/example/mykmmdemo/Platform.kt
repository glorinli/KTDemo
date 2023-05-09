package com.example.mykmmdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform