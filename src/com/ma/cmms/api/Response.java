package com.ma.cmms.api;

public class Response implements PolymorphicApiObject
{
	/**
	 * Only the top-level request gets this field.
	 */
	private Version serverVersion;

	private Error error;

	private Sync sync;

	public Response()
	{
	}

	public Response(Error error)
	{
		this.error = error;
	}

	public Error getError()
	{
		return error;
	}

	public void setError(Error error)
	{
		this.error = error;
	}

	public Version getServerVersion()
	{
		return serverVersion;
	}

	public void setServerVersion(Version serverVersion)
	{
		this.serverVersion = serverVersion;
	}

	public Sync getSync()
	{
		return sync;
	}

	public void setSync(Sync sync)
	{
		this.sync = sync;
	}
}
