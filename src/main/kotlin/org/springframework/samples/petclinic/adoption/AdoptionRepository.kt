package org.springframework.samples.petclinic.adoption

import org.springframework.data.jpa.repository.*
import org.springframework.data.repository.*
import org.springframework.transaction.annotation.*

interface AdoptionRepository: Repository<Adoption, Integer> {
    @Transactional(readOnly = true)
    fun getAll(): List<Adoption>
}
