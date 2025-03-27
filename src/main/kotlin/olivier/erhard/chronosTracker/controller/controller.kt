package olivier.erhard.chronosTracker.controller

import olivier.erhard.chronosTracker.model.Sprint
import olivier.erhard.chronosTracker.service.SprintService
import org.springframework.http.RequestEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sprints")
class SprintController(private val sprintService: SprintService){

    @GetMapping
    fun getAllSprints():List<Sprint> = sprintService.getAllSprint()


    @GetMapping("/{id}")
    fun getSprintById(@PathVariable id: Long): ResponseEntity<Sprint>{
        val sprint = sprintService.getSprintById(id) ?: return  ResponseEntity.notFound().build()
        return ResponseEntity.ok(sprint)
    }
    @PostMapping
    fun createSprint(@RequestBody sprint: Sprint): Sprint = sprintService.createSprint(sprint)

    @PutMapping("/{id}")
    fun updateSprint(@PathVariable id: Long, @RequestBody sprint:Sprint): ResponseEntity<Sprint> {
        val updateSprint = sprintService.updateSprint(id,sprint) ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(updateSprint)
    }

    @DeleteMapping("/{id}")
    fun deleteSprint(@PathVariable id: Long): ResponseEntity<Void>{
        sprintService.deleteSprint(id)
        return ResponseEntity.noContent().build()
    }
}