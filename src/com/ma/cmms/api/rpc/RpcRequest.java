package com.ma.cmms.api.rpc;

import com.ma.cmms.api.Error;
import com.ma.cmms.api.SimpleRequest;

import java.util.Map;

public class RpcRequest extends SimpleRequest
{
	static final public String P_NAME = "name";
	static final public String P_ACTION = "action";

	private String name;
	private String action;
	private Map<String, Object> parameters;

	public RpcRequest()
	{
	}

	public RpcRequest(String name, String action, Map<String, Object> parameters)
	{
		this.name = name;
		this.action = action;
		this.parameters = parameters;
	}

	public RpcResponse createResponse(Error error)
	{
		return new RpcResponse(error);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public Map<String, Object> getParameters()
	{
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters)
	{
		this.parameters = parameters;
	}
}
