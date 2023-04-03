package com.lendmeapi.service

import com.lendmeapi.entity.Role
import org.springframework.jdbc.core.*
import org.springframework.stereotype.Component

@Component
class RoleService(val db: JdbcTemplate) {

    fun findRoles(): List<Role> = db.query("SELECT * FROM role") {response, _ ->
        Role(response.getInt("id_cargo"), response.getString("nome_cargo"))
    }

    fun addNewRole(role: Role) = db.update("INSERT INTO role VALUES (?,?)", role.id_cargo, role.nome_cargo)

    fun deleteRole(id: Int) = db.update("DELETE FROM role WHERE id_cargo = ?", id)
}