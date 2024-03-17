package com.cursointermedio.myapplication.domain.useCase

import com.cursointermedio.myapplication.data.database.entities.toDatabase
import com.cursointermedio.myapplication.data.repository.ExerciseRepository
import com.cursointermedio.myapplication.data.repository.TrainingRepository
import com.cursointermedio.myapplication.domain.model.ExerciseModel
import com.cursointermedio.myapplication.domain.model.TrainingModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTrainingUseCase @Inject constructor(
    private val repository: TrainingRepository
) {
    operator fun invoke(): Flow<List<TrainingModel>> {
        return repository.getAllTrainingsFromDatabase()
    }

    suspend fun invoke2(training :TrainingModel) {
        return repository.insertTraining(training.toDatabase())
    }
}