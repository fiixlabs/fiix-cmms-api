package com.ma.cmms.api.format.json;

public interface JsonFormatConstants
{
	/**
	 * 	The name of the 'magic' field, containing the 'logical class name', that the JSON library uses to correctly serialize/deserialize polymorphic objects.
	 */
	public String MAGICK_API_OBJECT_JSON_FIELD_NAME = "_maCn";
	public String MAGICK_DTO_JSON_FIELD_NAME = "className";
}
