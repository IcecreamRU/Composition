package ru.icecreamru.composition.domain.usecases

import ru.icecreamru.composition.domain.entity.Question
import ru.icecreamru.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {
    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }

    operator fun invoke(maxSumValue: Int): Question =
        repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)

}