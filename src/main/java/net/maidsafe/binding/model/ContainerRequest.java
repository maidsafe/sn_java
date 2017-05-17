package net.maidsafe.binding.model;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class ContainerRequest extends Structure {
	
	public AppExchangeInfo app_exchange_info;
	public ContainerPermissions[] container_permissions;
	public long containers_len;
	public long containers_cap;
	
	public ContainerRequest(AppExchangeInfo appInfo, List<ContainerPermissions> permissions) {
		this.app_exchange_info = appInfo;
		containers_cap = containers_len = permissions.size();
		container_permissions = new ContainerPermissions[(int) (containers_len == 0 ? 1 : containers_len)];
		for (int i=0; i<containers_len; i++){
			container_permissions[i] = permissions.get(i);
		}
	}

	@Override
	protected List<String> getFieldOrder() { 
		return Arrays.asList("app_exchange_info", 
				"container_permissions", "containers_len", 
				"containers_cap");
	}
}