package com.lendmeapi.controller

import com.lendmeapi.entity.Employee
import com.lendmeapi.service.EmployeeService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employee")
class EmployeeController(val service: EmployeeService) {

    @GetMapping
    fun getAll(): List<Employee> = service.findEmployees()

    @GetMapping("/{id}")
    fun findUnique(@PathVariable id: String): List<Employee> = service.findUniqueEmployee(id)

    @PostMapping
    fun post(@RequestBody employee: Employee) = service.addNewEmployee(employee)

    @DeleteMapping("/{id}")
    fun deleteUnique(@PathVariable id: String) = service.deleteEmployee(id)
}