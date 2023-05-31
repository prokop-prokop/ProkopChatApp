package com.example.prokopchatapp.models

data class Message(
    val sender: String,
    val receiver: String,
    val text: String,
    val timestamp: Long,
    var isReceived: Boolean = true,
    var isRead: Boolean = false
) {
    constructor() : this("", "", "", 0)
}
