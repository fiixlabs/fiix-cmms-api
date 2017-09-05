package com.ma.cmms.api;

abstract public class SimpleResponse extends Response
{
	public SimpleResponse()
	{
	}

	public SimpleResponse(Error error)
	{
		super(error);
	}
}
