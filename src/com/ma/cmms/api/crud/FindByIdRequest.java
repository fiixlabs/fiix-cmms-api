package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

public class FindByIdRequest<T extends CmmsDto> extends CrudRequest<T>
{
	private Long id;
	private String fields;

	public FindByIdResponse<T> createResponse(Error error)
	{
		return new FindByIdResponse<T>(error);
	}

	public String getFields()
	{
		return fields;
	}

	public void setFields(String fields)
	{
		this.fields = fields;
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
