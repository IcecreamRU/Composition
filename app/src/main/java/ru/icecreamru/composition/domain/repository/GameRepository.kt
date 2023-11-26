package ru.icecreamru.composition.domain.repository

import ru.icecreamru.composition.domain.entity.GameSettings
import ru.icecreamru.composition.domain.entity.Level
import ru.icecreamru.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question
    fun getGameSettings(level: Level): GameSettings
}