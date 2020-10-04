package com.dxctraining.bookingmodule.dto;

import java.math.BigInteger;
import java.time.LocalDate;

public class BookingDto {
	
	private BigInteger bookingId;

	private Integer userId;

	private LocalDate bookingDate;

	private double ticketCost;

	private long pnrNumber;

	private BigInteger scheduleflightId;
	
	private String userType;
	
	private String userName;
	
	private String email;
	
	private Long userPhone;
	
	private String password;
	
	private String passengerName;
	
	private int passengerAge;
	
	private long passengerUIN;
	
	private char gender;
	
	private Integer availableSeats;
	
	private Integer scheduleId;
	
	private BigInteger flightNumber;
	
	public BookingDto() {
		
	}

	public BookingDto(BigInteger bookingId,LocalDate bookingDate, double ticketCost) {
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.ticketCost = ticketCost;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public long getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public BigInteger getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(BigInteger flightNumber) {
		this.flightNumber = flightNumber;
	}
}