package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

public class FindByIdResponse<T extends CmmsDto> extends CrudResponse
{
	private T object;

	public FindByIdResponse()
	{
	}

	public FindByIdResponse(T object)
	{
		this.object = object;
	}

	public FindByIdResponse(Error error)
	{
		super(error);
	}

	public T getObject()
	{
		return object;
	}

	public void setObject(T object)
	{
		this.object = object;
	}

}
