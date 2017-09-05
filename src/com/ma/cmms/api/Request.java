package com.ma.cmms.api;

abstract public class Request implements PolymorphicApiObject
{
	//	Only the top-level Request gets the following three fields:
	private long requestId;
	private long requestSentUnixTime;
	private Version clientVersion;
	private String originatingIp;
	private Sync syncRev;

	abstract public Response createResponse(Error error);

	public long getRequestId()
	{
		return requestId;
	}

	public void setRequestId(long requestId)
	{
		this.requestId = requestId;
	}

	public long getRequestSentUnixTime()
	{
		return requestSentUnixTime;
	}

	public void setRequestSentUnixTime(long requestSentUnixTime)
	{
		this.requestSentUnixTime = requestSentUnixTime;
	}

	public Version getClientVersion()
	{
		return clientVersion;
	}

	public void setClientVersion(Version clientVersion)
	{
		this.clientVersion = clientVersion;
	}

	public String getOriginatingIp()
	{
		return originatingIp;
	}

	public void setOriginatingIp(String originatingIp)
	{
		this.originatingIp = originatingIp;
	}

	public Sync getSyncRev()
	{
		return syncRev;
	}

	public void setSyncRev(Sync syncRev)
	{
		this.syncRev = syncRev;
	}
}
