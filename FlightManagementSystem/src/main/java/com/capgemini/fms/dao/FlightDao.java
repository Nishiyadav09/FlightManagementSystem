package com.capgemini.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.fms.entity.Flight;
/*****************************************************************************************************
 * @author        Nishi Yadav
 * Description    It is a FlightDao interface typically which extends the JpaRepository 
 *                which implements the method. 
 *                
 * Version        1.0
 * Created Date   23-JULY-2020 
 *
 ****************************************************************************************************/
public interface FlightDao extends JpaRepository<Flight,Integer> {

}
