package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;
import com.ma.cmms.api.SimpleRequest;

abstract public class CrudRequest<T extends CmmsDto> extends SimpleRequest
{
	private String className;
	private String fields;

	@Override
	abstract public CrudResponse createResponse(Error error);

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public String getFields()
	{
		return fields;
	}

	public void setFields(String fields)
	{
		this.fields = fields;
	}
}
