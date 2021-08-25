package org.springframework.samples.petclinic.adoption

import org.springframework.samples.petclinic.model.*
import javax.persistence.*
import javax.validation.constraints.*


@Entity
@Table(name = "adoptions")
open class Adoption: BaseEntity() {
    @Column
    @NotEmpty
    var name = ""
    @Column
    @NotEmpty
    var yearOfBirth = 0
    @Column
    @NotEmpty
    var location = ""
}
