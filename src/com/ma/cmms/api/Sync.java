package com.ma.cmms.api;

import java.util.Date;

/**
 * @see http://semver.org
 */
public class Sync
{
	private int revision;
	private boolean needToSync;
	private Date dateLastUpdated;

	public Sync()
	{
	}

	public int getRevision()
	{
		return revision;
	}

	public void setRevision(int revision)
	{
		this.revision = revision;
	}

	public boolean isNeedToSync()
	{
		return needToSync;
	}

	public void setNeedToSync(boolean needToSync)
	{
		this.needToSync = needToSync;
	}

	public Date getDateLastUpdated()
	{
		return dateLastUpdated;
	}

	public void setDateLastUpdated(Date dateLastUpdated)
	{
		this.dateLastUpdated = dateLastUpdated;
	}

	public Sync(int revision, boolean needToSync, Date dateLastUpdated)
	{
		super();
		this.revision = revision;
		this.needToSync = needToSync;
		this.dateLastUpdated = dateLastUpdated;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(dateLastUpdated);
		sb.append(".rev:");
		sb.append(revision);
		sb.append(':');
		sb.append(needToSync);

		String ret = sb.toString();

		return ret;
	}
}
