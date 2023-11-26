package ru.icecreamru.composition.domain.usecases

import ru.icecreamru.composition.domain.entity.GameSettings
import ru.icecreamru.composition.domain.entity.Level
import ru.icecreamru.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings = repository.getGameSettings(level)

}