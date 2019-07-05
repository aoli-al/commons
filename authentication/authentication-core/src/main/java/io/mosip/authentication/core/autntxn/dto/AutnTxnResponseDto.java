package io.mosip.authentication.core.autntxn.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AutnTxnResponseDto {

	String transactionID;
	LocalDateTime requestdatetime;
	String authtypeCode;
	String statusCode;
	String statusComment;
	String referenceIdType;
	String partnerName;

}
