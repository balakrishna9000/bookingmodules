package com.dxctraining.bookingmodule.dto;


import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class CreateBookingRequest {
	
	private BigInteger bookingId;
	
	@NotNull
	private Integer userId;
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate bookingDate;
	
	private double ticketCost;
	
	@NotNull
	private long pnrNumber;
	
	@NotNull
	private BigInteger scheduleflightId;

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