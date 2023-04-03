package com.lendmeapi.controller

import com.lendmeapi.entity.Role
import com.lendmeapi.service.RoleService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/role")
class RoleController (val service: RoleService) {

    @GetMapping
    fun getAll(): List<Role> = service.findRoles()

    @PostMapping
    fun addRole(role: Role) = service.addNewRole(role)

    @DeleteMapping
    fun removeRole(id: Int) = service.deleteRole(id)
}