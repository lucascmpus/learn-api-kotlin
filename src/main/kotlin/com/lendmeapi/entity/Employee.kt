package com.lendmeapi.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

data class Employee(val cod_matricula: String,val nome_funcionario: String,val cargo_id_cargo: Int)