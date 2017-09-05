package com.ma.cmms.api;

/**
 * @see http://semver.org
 */
public class Version
{
	static public final Version apiVersion = new Version(2, 3, 1, "alpha", null);

	private int major;
	private int minor;
	private int patch;
	private String preRelease;
	private String metadata;

	public Version()
	{
	}

	public Version(int major, int minor, int patch, String preRelease, String metadata)
	{
		this.major = major;
		this.minor = minor;
		this.patch = patch;
		this.preRelease = preRelease;
		this.metadata = metadata;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(major);
		sb.append('.');
		sb.append(minor);
		sb.append('.');
		sb.append(patch);
		if (preRelease != null)
		{
			sb.append('-');
			sb.append(preRelease);
		}
		if (metadata != null)
		{
			sb.append('+');
			sb.append(metadata);
		}

		String ret = sb.toString();

		return ret;
	}

	public int getMajor()
	{
		return major;
	}

	public void setMajor(int major)
	{
		this.major = major;
	}

	public int getMinor()
	{
		return minor;
	}

	public void setMinor(int minor)
	{
		this.minor = minor;
	}

	public int getPatch()
	{
		return patch;
	}

	public void setPatch(int patch)
	{
		this.patch = patch;
	}

	public String getPreRelease()
	{
		return preRelease;
	}

	public void setPreRelease(String preRelease)
	{
		this.preRelease = preRelease;
	}

	public String getMetadata()
	{
		return metadata;
	}

	public void setMetadata(String metadata)
	{
		this.metadata = metadata;
	}
}
