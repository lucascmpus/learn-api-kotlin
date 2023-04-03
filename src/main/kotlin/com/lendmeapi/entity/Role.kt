package com.lendmeapi.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Role (
        @Id
        val id_cargo: Int,
        val nome_cargo: String,
)