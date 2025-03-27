package olivier.erhard.chronosTracker.model

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime


@Entity
@Table(name = "sprint")
data class Sprint(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val  Id: Long? = null,
    val nomeSprint: String,
    val completo: Boolean =false,
    val horaFinalizacao: LocalDateTime,
    val horaInicio: LocalDateTime
)