package olivier.erhard.chronosTracker.Model

import jakarta.persistence.*


@Entity
@Table(name = "sprint")
data class Sprint(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val  Id: Long? = null,
    val nomeSprint: String,
    val completo: Boolean =false
)