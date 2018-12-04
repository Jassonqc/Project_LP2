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
import com.lp2.ProyectoFinal.lp2_PF_Sfacturacion.models.entity.Cliente;
import java.util.List;



public interface ClienteDaoI {

	public List<Cliente> findAll();

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);

}