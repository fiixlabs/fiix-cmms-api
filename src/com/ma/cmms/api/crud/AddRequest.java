package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

public class AddRequest<T extends CmmsDto> extends CrudRequest<T>
{
	private T object;

	private String fields;

	public AddResponse<T> createResponse(Error error)
	{
		return new AddResponse<T>(error);
	}

	public String getFields()
	{
		return fields;
	}

	public void setFields(String fields)
	{
		this.fields = fields;
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
