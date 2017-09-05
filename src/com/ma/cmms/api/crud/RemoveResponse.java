package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

public class RemoveResponse<T extends CmmsDto> extends CrudResponse
{
	private int count;

	public RemoveResponse()
	{
	}

	public RemoveResponse(int count)
	{
		this.count = count;
	}

	public RemoveResponse(Error error)
	{
		super(error);
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
