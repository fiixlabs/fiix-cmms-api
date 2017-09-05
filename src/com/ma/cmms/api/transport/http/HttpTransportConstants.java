package com.ma.cmms.api.transport.http;

public final class HttpTransportConstants
{
	/**
	 *	Request header: contains the Base64 HmacSHA256 of the whole request body. 
	 *	@see http://www.ietf.org/rfc/rfc2104.txt
	 */
	public static final String HEADER_AUTHORIZATION = "Authorization";

	/**
	 * 	Part of the endpoint URI that goes after base.
	 */
	public static final String EP_CONTEXT = "cmmsApi/";

	private HttpTransportConstants()
	{
	}
}
