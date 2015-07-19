/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.security.dao;

import com.tecsup.security.model.Usuario;

/**
 *
 * @author alumno
 */
public interface UsuarioDAO{
Usuario findByLogin(String usuario);
}
