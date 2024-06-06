package com.jsp.whs.enums;

import java.util.List;

public enum AdminType {

	SUPER_ADMIN(List.of(Privilege.CREATE_ADDRESS,
			Privilege.create_admin,
			Privilege.CREATE_STORAGE,
			Privilege.create_warehouse,
			Privilege.REAR,

			Privilege.UPDARE_STORAGE,
			Privilege.UPDATE_ADMIN,
			Privilege.UPDATE_ADDRESS,
			Privilege.UPDATE_WAREHOUSE,

			Privilege.DELETE_ADDERESS,
			Privilege.DELETE_ADMIN,
			Privilege.DELETE_STORAGE,
			Privilege.DELETE_WAREHOUSE)),
	ADMIN(List.of(Privilege.CREATE_STORAGE,
			Privilege.UPDATE_ADMIN,
			Privilege.UPDARE_STORAGE,
			Privilege.DELETE_STORAGE));

	private List<Privilege> privileges;

	private AdminType(List<Privilege> privileges) {
		this.privileges=privileges;
	}

	public List<Privilege> getPrivileges(){
		return this.privileges;

	}


}
