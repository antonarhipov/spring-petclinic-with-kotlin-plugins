package org.springframework.samples.petclinic.adoption

import org.springframework.data.jpa.repository.*
import org.springframework.data.repository.*
import org.springframework.samples.petclinic.owner.Owner
import org.springframework.transaction.annotation.*

interface AdoptionRepository: Repository<Adoption, Int> {
    @Transactional(readOnly = true)
    fun findAll(): List<Adoption>
}
