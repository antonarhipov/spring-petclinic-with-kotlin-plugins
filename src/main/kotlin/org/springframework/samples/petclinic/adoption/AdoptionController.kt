package org.springframework.samples.petclinic.adoption

import org.springframework.web.bind.annotation.*

@RestController
class AdoptionController(private val adoption: AdoptionRepository) {

    @GetMapping("/adoption")
    fun getAllAdoptions(): List<Adoption> {
        return adoption.getAll()
    }
}
