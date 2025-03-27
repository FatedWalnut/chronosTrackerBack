package olivier.erhard.chronosTracker.repository

import org.springframework.data.jpa.repository.JpaRepository
import olivier.erhard.chronosTracker.model.Sprint


interface SprintRepository: JpaRepository<Sprint,Long>
