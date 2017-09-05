package com.ma.cmms.api.crud;

import java.util.List;
import java.util.Set;

public class FindFilter
{
	private String name;
	private List<Object> parameters;
	private String ql;
	private String fullText;
	private String fields;
	private Set<Long> selectedSites;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getQl()
	{
		return ql;
	}

	public void setQl(String ql)
	{
		this.ql = ql;
	}

	public String getFullText()
	{
		return fullText;
	}

	public void setFullText(String fullText)
	{
		this.fullText = fullText;
	}

	public String getFields()
	{
		return fields;
	}

	public void setFields(String fields)
	{
		this.fields = fields;
	}

	public List<Object> getParameters()
	{
		return parameters;
	}

	public void setParameters(List<Object> parameters)
	{
		this.parameters = parameters;
	}

	public void setSelectedSites(Set<Long> selectedSites)
	{
		this.selectedSites = selectedSites;
	}

	public Set<Long> getSelectedSites()
	{
		return selectedSites;
	}
}
