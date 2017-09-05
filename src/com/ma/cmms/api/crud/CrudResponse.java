package com.ma.cmms.api.crud;

import com.ma.cmms.api.Error;
import com.ma.cmms.api.SimpleResponse;

abstract public class CrudResponse extends SimpleResponse
{
	public CrudResponse()
	{
	}

	public CrudResponse(Error error)
	{
		super(error);
	}
}
