package com.capgemini.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.fms.entity.Booking;
/*****************************************************************************************************
 * @author        Nishi Yadav
 * Description    It is a BookingDao interface typically which extends the JpaRepository 
 *                which implements the method. 
 *                
 * Version        1.0
 * Created Date   23-JULY-2020 
 *
 ****************************************************************************************************/
public interface BookingDao extends JpaRepository<Booking,Integer> {
	List<Booking> findAll();
}
