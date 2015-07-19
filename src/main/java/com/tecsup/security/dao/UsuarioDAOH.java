/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.security.dao;

import com.tecsup.security.dao.hibernate.BaseHibernateDAO;
import com.tecsup.security.model.Usuario;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alumno
 */
@Repository
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO {

    @Override
    public Usuario findByLogin(String usuario) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("username", usuario));
        criteria.add(Restrictions.eq("estado", "ACT"));
        return (Usuario) criteria.uniqueResult();
    }
}
