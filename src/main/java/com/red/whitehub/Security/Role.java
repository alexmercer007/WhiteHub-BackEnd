/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.Security;

/**
 *
 * @author aleja
 */
public enum Role {

    // User

    ROLE_USER_GUEST,  // Usuario con cuenta, pero acceso restringido hasta completar verificación
    ROLE_VERIFIED,  // eres un usuario real para otros usuarios y puedes tener beneficios como funciones ocultas
    ROLE_USER,  // Ver perfiles, no modificar
    ROLE_USER_EDITOR,  // Crear, editar o borrar publicaciones propias
    ROLE_USER_MANAGER,  // Ajustes de perfil: biografía, foto, privacidad

    // Maneger

    ROLE_ADMIN,  // Ver datos sensibles, sin control
    ROLE_MODERATOR,
    ROLE_ADMIN_MANAGER,  // Control total


    ROLE_BANNED,  // no publicar ni comentar solo ver feed temporalmente o  baneado para siempre no se

    // Full Manager despues de verificarse por segunda vez con una contraseña dada por la empresa, la primera es del manager ( doble capa XD )

    ROLE_SUPER_ADMIN  // Nivel máximo. Accede y gestiona a los administradores.

}
