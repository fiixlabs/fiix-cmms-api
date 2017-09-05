package com.ma.cmms.api.batch;

import com.ma.cmms.api.Response;
import com.ma.cmms.api.SimpleResponse;

import java.util.List;

public class BatchResponse extends Response
{
	private List<SimpleResponse> responses;

	public BatchResponse()
	{
	}

	public BatchResponse(com.ma.cmms.api.Error error)
	{
		super(error);
	}

	public List<SimpleResponse> getResponses()
	{
		return responses;
	}

	public void setResponses(List<SimpleResponse> responses)
	{
		this.responses = responses;
	}
}
