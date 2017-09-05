package com.ma.cmms.api;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Error
{
	public static final int ERROR_PARSING_RESPONSE = 100;
	public static final int EMPTY_RESPONSE = 101;
	public static final int UNEXPECTED_HTTP_STATUS = 110;
	public static final int TIMEOUT = 120;
	public static final int INVALID_URI = 130;
	public static final int NO_CALLBACK = 140;
	public static final int THROTTLED_CLIENT_SHOULD_AUTO_RETRY = 1100;

	public static final String P_CLIENT_AUTO_RETRY_WAIT_ADVISORY_MS = "P_CLIENT_AUTO_RETRY_WAIT_ADVISORY_MS"; // Will be Integer value  

	public static enum Leg
	{
		CLIENT_REQUEST_PACK,
		CLIENT_REQUEST_SEND_OR_RECEIVE,
		SERVER_REQUEST_RECEIVE,
		SERVER_REQUEST_UNPACK,
		SERVER_REQUEST_PROCESS,
		SERVER_RESPONSE_PACK,
		CLIENT_RESPONSE_UNPACK
	}

	private Leg leg;
	private int code;
	private String message;
	private String stackTrace;
	private Map<String, Object> object = new HashMap<String, Object>();

	public Error()
	{
	}

	public Error(Leg leg, int code, String message, Throwable throwable)
	{
		this.leg = leg;
		this.code = code;
		this.message = message;
		if (throwable != null)
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			throwable.printStackTrace(pw);
			pw.close();
			this.stackTrace = sw.toString();
		}
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Error: {leg=").append(leg);
		if (code != 0)
		{
			sb.append(", code=").append(code);
		}
		if (message != null)
		{
			sb.append(", message=").append(message);
		}
		if (getStackTrace() != null)
		{
			sb.append(", throwable=").append(getStackTrace());
		}
		sb.append("}");
		String ret = sb.toString();
		return ret;
	}

	public Error(ErrorType spec, Throwable throwable)
	{
		this(spec.getLeg(), spec.getCode(), spec.getMessage(), throwable);
	}

	public Error(ErrorType spec)
	{
		this(spec, null);
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Leg getLeg()
	{
		return leg;
	}

	public void setLeg(Leg leg)
	{
		this.leg = leg;
	}

	public String getStackTrace()
	{
		return stackTrace;
	}

	public void setStackTrace(String stackTrace)
	{
		this.stackTrace = stackTrace;
	}

	public Map<String, Object> getObject()
	{
		return object;
	}

	public void setObject(Map<String, Object> object)
	{
		this.object = object;
	}
}
