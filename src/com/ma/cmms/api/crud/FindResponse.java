package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

import java.util.List;

public class FindResponse<T extends CmmsDto> extends CrudResponse
{
	private List<T> objects;
	private int totalObjects;

	public FindResponse()
	{
	}

	public FindResponse(List<T> objects, int totalObjects)
	{
		this.objects = objects;
		this.totalObjects = totalObjects;
	}

	public FindResponse(Error error)
	{
		super(error);
	}

	public int getTotalObjects()
	{
		return totalObjects;
	}

	public void setTotalObjects(int totalObjects)
	{
		this.totalObjects = totalObjects;
	}

	public List<T> getObjects()
	{
		return objects;
	}

	public void setObjects(List<T> objects)
	{
		this.objects = objects;
	}
}
