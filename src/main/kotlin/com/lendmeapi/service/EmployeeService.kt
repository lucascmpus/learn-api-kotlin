package com.lendmeapi.service

import com.lendmeapi.entity.Employee
import org.springframework.jdbc.core.*
import org.springframework.stereotype.Component

@Component
class EmployeeService (val db: JdbcTemplate){

    fun findEmployees(): List<Employee> = db.query("SELECT * FROM employee") {response, _ ->
        Employee(response.getString("cod_matricula"), response.getString("nome_funcionario"), response.getInt("cargo_id_cargo"))
    }

    fun findUniqueEmployee(cod_matricula: String): List<Employee> = db.query("SELECT * FROM employee WHERE cod_matricula = ?", cod_matricula) {response, _ ->
        Employee(response.getString("cod_matricula"), response.getString("nome_funncionario"), response.getInt("cargo_id_cargo"))
    }

    fun addNewEmployee(employee: Employee) = db.update("INSERT INTO employee VALUES (?, ?, ?)", employee.cod_matricula, employee.nome_funcionario, employee.cargo_id_cargo)

    fun deleteEmployee(cod_matricula: String) = db.update("DELETE FROM employee WHERE cod_matricula = ?", cod_matricula)
}