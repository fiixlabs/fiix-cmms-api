package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

public class ChangeResponse<T extends CmmsDto> extends CrudResponse
{
	private T object;
	private int count;

	public ChangeResponse()
	{
	}

	public ChangeResponse(T object, int count)
	{
		this.object = object;
		this.count = count;
	}

	public ChangeResponse(Error error)
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

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}
}
