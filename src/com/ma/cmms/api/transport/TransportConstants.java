package com.ma.cmms.api.transport;

public final class TransportConstants
{
	public static final String CHARSET_NAME = "UTF-8";

	/*
	 * For each request, client must pass the request MAC.
	 * MAC is calculated over the following 'canonicalization': add up the following:
	 * - the prefix (CAN_PREFIX)
	 * - the simple class name of the request
	 * - the UTC time, milliseconds
	 * MAC algorithm is defined below. 
	 * Secret key is the one in Credentials.secretKey. 
	 */
	public static final String MAC_ALGORITHM = "HmacSHA256";

	private TransportConstants()
	{
	}
}
