package com.ma.cmms.api;

import com.ma.cmms.api.Error.Leg;

public class ErrorType
{
	public static final ErrorType IO_ERROR = new ErrorType(Leg.CLIENT_REQUEST_PACK, 245, "This is a problem");

	private Leg leg;
	private int code;
	private String message;

	private ErrorType(Leg leg, int code, String message)
	{
		this.leg = leg;
		this.code = code;
		this.message = message;
	}

	public Leg getLeg()
	{
		return leg;
	}

	public int getCode()
	{
		return code;
	}

	public String getMessage()
	{
		return message;
	}
}