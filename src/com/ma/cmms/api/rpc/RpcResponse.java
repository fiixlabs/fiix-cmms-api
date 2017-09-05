package com.ma.cmms.api.rpc;

import com.ma.cmms.api.Error;
import com.ma.cmms.api.SimpleResponse;

import java.util.Map;

public class RpcResponse extends SimpleResponse
{
	private Map<String, Object> object;

	public RpcResponse()
	{
	}

	public RpcResponse(Map<String, Object> object)
	{
		this.object = object;
	}

	public RpcResponse(Error error)
	{
		super(error);
	}

	public Map<String, Object> getObject()
	{
		return object;
	}

	public void setObject(Map<String, Object> object)
	{
		this.object = object;
	}
}
