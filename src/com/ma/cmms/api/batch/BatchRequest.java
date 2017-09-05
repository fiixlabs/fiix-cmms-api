package com.ma.cmms.api.batch;

import java.util.Arrays;
import java.util.List;

import com.ma.cmms.api.Error;
import com.ma.cmms.api.Request;
import com.ma.cmms.api.SimpleRequest;

public class BatchRequest extends Request
{
	private boolean singleTransaction;
	private List<SimpleRequest> requests;

	public BatchRequest()
	{
	}

	public BatchRequest(boolean singleTransaction, SimpleRequest... requests)
	{
		this.singleTransaction = singleTransaction;
		this.requests = Arrays.asList(requests);
	}

	@Override
	public BatchResponse createResponse(Error error)
	{
		return new BatchResponse(error);
	}

	public List<SimpleRequest> getRequests()
	{
		return requests;
	}

	public void setRequests(List<SimpleRequest> requests)
	{
		this.requests = requests;
	}

	public boolean isSingleTransaction()
	{
		return singleTransaction;
	}

	public void setSingleTransaction(boolean singleTransaction)
	{
		this.singleTransaction = singleTransaction;
	}
}
