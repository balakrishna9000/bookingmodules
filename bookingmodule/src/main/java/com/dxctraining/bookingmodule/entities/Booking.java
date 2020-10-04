package com.dxctraining.bookingmodule.entities;

import java.math.BigInteger;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue
	private BigInteger bookingId;

	private Integer userId;
	
	private LocalDate bookingDate;

	private double ticketCost;
	
	private long pnrNumber;

	private BigInteger scheduleflightId;

	public Booking() {

	}

	public Booking(Integer userId, LocalDate bookingDate, double ticketCost, long pnrNumber,BigInteger scheduleflightId ) {
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.ticketCost = ticketCost;
		this.pnrNumber = pnrNumber;
		this.scheduleflightId = scheduleflightId;
	}

	public BigInteger getBookingId() {
		return bookingId;
	}

	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	
	public long getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public BigInteger getScheduleflightId() {
		return scheduleflightId;
	}

	public void setScheduleflightId(BigInteger scheduleflightId) {
		this.scheduleflightId = scheduleflightId;
	}
}