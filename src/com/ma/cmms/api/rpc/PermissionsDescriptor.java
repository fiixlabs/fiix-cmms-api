package com.ma.cmms.api.rpc;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Used to transfer the permissions to the client.
 */
public class PermissionsDescriptor
{
	public Map<String, Long> resourceIdsByName;
	public boolean multisiteEnabled = false;
	public Long defaultSiteId;
	public Set<Long> accessibleSiteIds;
	public boolean isAdministrator;
	public Map<Long, String> permissionsByGroupId;
	public Map<String, Object> additionalInfo;
	public List<Map<String, Object>> groupIdsBySiteId;
	public Map<Long, Map<String, String>> crudPermissions;
	public boolean fullSecurityChecksEnabled;
	public Set<Long> enabledFeatures;
}
