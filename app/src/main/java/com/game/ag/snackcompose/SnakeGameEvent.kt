package com.game.ag.snackcompose

import androidx.compose.ui.geometry.Offset

sealed class SnakeGameEvent {
      object StartGame : SnakeGameEvent()
      object PauseGame : SnakeGameEvent()
     object ResetGame : SnakeGameEvent()
    data class UpdateDirection(val offset: Offset, val canvasWidth: Int) : SnakeGameEvent()
}