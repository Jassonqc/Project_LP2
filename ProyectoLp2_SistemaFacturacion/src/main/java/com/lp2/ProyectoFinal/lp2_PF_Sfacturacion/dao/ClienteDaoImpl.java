/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2.ProyectoFinal.lp2_PF_Sfacturacion.dao;

/**
 *
 * @author quiroga
 */
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lp2.ProyectoFinal.lp2_PF_Sfacturacion.models.entity.Cliente;


@Repository
public class ClienteDaoImpl implements ClienteDaoI {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente").getResultList();
	}

	@Override
	public Cliente findOne(Long id) {
		return em.find(Cliente.class, id);
	}
	
	@Override
	public void save(Cliente cliente) {
		if(cliente.getId() != null && cliente.getId() >0) {
			em.merge(cliente);
		} else {
			em.persist(cliente);
		}
	}


	@Override
	public void delete(Long id) {
		em.remove(findOne(id));
	}

}
