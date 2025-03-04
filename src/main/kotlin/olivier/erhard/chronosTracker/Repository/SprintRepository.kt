package olivier.erhard.chronosTracker.Repository

import org.springframework.data.jpa.repository.JpaRepository
import olivier.erhard.chronosTracker.Model.Sprint


interface SprintRepository: JpaRepository<Sprint,Long>
