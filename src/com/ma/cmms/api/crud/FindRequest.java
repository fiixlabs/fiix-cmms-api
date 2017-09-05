package com.ma.cmms.api.crud;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;

import java.util.List;

public class FindRequest<T extends CmmsDto> extends CrudRequest<T>
{
	private String orderBy;
	private Integer startIndex;
	private Integer maxObjects;
	private List<FindFilter> filters;

	public FindResponse<T> createResponse(Error error)
	{
		return new FindResponse<T>(error);
	}

	public String getOrderBy()
	{
		return orderBy;
	}

	public void setOrderBy(String orderBy)
	{
		this.orderBy = orderBy;
	}

	public List<FindFilter> getFilters()
	{
		return filters;
	}

	public void setFilters(List<FindFilter> filters)
	{
		this.filters = filters;
	}

	public Integer getStartIndex()
	{
		return startIndex;
	}

	public void setStartIndex(Integer startIndex)
	{
		this.startIndex = startIndex;
	}

	public Integer getMaxObjects()
	{
		return maxObjects;
	}

	public void setMaxObjects(Integer maxObjects)
	{
		this.maxObjects = maxObjects;
	}
}
