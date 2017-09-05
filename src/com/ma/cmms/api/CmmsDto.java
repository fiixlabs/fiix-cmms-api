package com.ma.cmms.api;

import java.util.Map;

public interface CmmsDto extends Cloneable
{
	Long getId();

	Map<String, Object> getExtraFields();

	void setExtraFields(Map<String, Object> extraFields);
}
