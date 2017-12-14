package com.fit.project.common.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class BaseBean implements Serializable {
	private static final long serialVersionUID = 1212152233991645655L;
	public static final String LOG_BREAKER_OPEN = "**********************************************************************";
	public static final String LOG_BREAKER_CLOSE = "############################## xxxxxxxx ##############################";
	public static final String LOG_PREFIX = "----------  ";
	public static final String LOG_SUFFIX = "  ----------";

	public enum TransactionType {
		INSERT, UPDATE, DELETE;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private long recordRegId;
	@JsonIgnore
	@Column
	private long recordUpdId;
	// @JsonIgnore
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@Column
	private LocalDateTime recordRegDate;
	// @JsonIgnore
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@Column
	private LocalDateTime recordUpdDate;
	@JsonIgnore
	@Column
	private TransactionType transactionType;

	protected String convertDateAsString(LocalDate date) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dateString = "";
		if (date != null) {
			dateString = dateFormatter.format(date);
		}
		return dateString;
	}

	protected LocalDate convertStringAsDate(String dateString) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = null;
		if (dateString != null && dateString.length() > 0) {
			date = LocalDate.parse(dateString, dateFormatter);
		}
		return date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRecordRegId() {
		return recordRegId;
	}

	public void setRecordRegId(long recordRegId) {
		this.recordRegId = recordRegId;
	}

	public long getRecordUpdId() {
		return recordUpdId;
	}

	public void setRecordUpdId(long recordUpdId) {
		this.recordUpdId = recordUpdId;
	}

	public LocalDateTime getRecordRegDate() {
		return recordRegDate;
	}

	public void setRecordRegDate(LocalDateTime recordRegDate) {
		this.recordRegDate = recordRegDate;
	}

	public LocalDateTime getRecordUpdDate() {
		return recordUpdDate;
	}

	public void setRecordUpdDate(LocalDateTime recordUpdDate) {
		this.recordUpdDate = recordUpdDate;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return String.format("*** id=%s, recordRegId=%s, recordUpdId=%s, recordRegDate=%s, recordUpdDate=%s ***", id, recordRegId, recordUpdId, recordRegDate, recordUpdDate);
	}

}
