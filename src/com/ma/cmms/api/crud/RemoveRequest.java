package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

public class RemoveRequest<T extends CmmsDto> extends CrudRequest<T>
{
	private Long id;

	public RemoveResponse<T> createResponse(Error error)
	{
		return new RemoveResponse<T>(error);
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}
}
