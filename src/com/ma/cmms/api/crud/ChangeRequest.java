package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

public class ChangeRequest<T extends CmmsDto> extends CrudRequest<T>
{
	private T object;
	private String fields;
	private String changeFields;

	public ChangeResponse<T> createResponse(Error error)
	{
		return new ChangeResponse<T>(error);
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

	public String getChangeFields()
	{
		return changeFields;
	}

	public void setChangeFields(String updateFields)
	{
		this.changeFields = updateFields;
	}
}
