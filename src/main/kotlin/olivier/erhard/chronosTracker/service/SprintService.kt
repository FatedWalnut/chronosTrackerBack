package olivier.erhard.chronosTracker.service

import olivier.erhard.chronosTracker.model.Sprint
import olivier.erhard.chronosTracker.repository.SprintRepository
import org.springframework.stereotype.Service

@Service
class SprintService(private val sprintRepository: SprintRepository){

    fun getAllSprint(): List<Sprint> = sprintRepository.findAll()

    fun getSprintById(id: Long): Sprint? = sprintRepository.findById(id).orElse(null)

    fun createSprint(sprint: Sprint): Sprint {
        // A lógica para salvar a sprint no banco de dados
        return sprintRepository.save(sprint)
    }

    fun updateSprint(id: Long, updateSprint: Sprint): Sprint? {
        val sprint = sprintRepository.findById(id).orElse(null) ?: return null
        val newSprint = sprint.copy(
            nomeSprint = updateSprint.nomeSprint,
            completo = updateSprint.completo,
            horaInicio = updateSprint.horaInicio,
            horaFinalizacao = updateSprint.horaFinalizacao
        )
        return sprintRepository.save(newSprint)
    }

    fun deleteSprint(id: Long) = sprintRepository.deleteById(id)
}
