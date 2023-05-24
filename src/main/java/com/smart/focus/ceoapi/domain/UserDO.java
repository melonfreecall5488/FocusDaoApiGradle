package com.smart.focus.ceoapi.domain;

import lombok.Data;

@Data
public class UserDO {
	private Integer authResult;
	private String userId;
	private String passwd;
	private String userName;
	private Integer permission;
	private String division;
	private String token;
	private String refreshToken;
	private String userStatus;
	private String userImage;
	private String companyCode;
}
