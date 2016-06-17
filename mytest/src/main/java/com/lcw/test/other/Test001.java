package com.lcw.test.other;

import java.util.ArrayList;
import java.util.List;

import com.lcw.test.user.UserDto;

public class Test001 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		UserDto dto = new UserDto();
		List<String> lists = new ArrayList<String>();
		System.out.println(lists);
		if (lists.isEmpty())
			System.out.println(convertToRoleIds(lists));
		dto.setA(lists + "a");
		System.out.println(dto.getA());
		String abc = "aaa,bbb,ccc,";
		String a = null;
		List<String> lista = java.util.Arrays.asList("");
		System.out.println(lista);
		String newRoleIds = abc.substring(0, abc.length() - 1);
		List<String> list = java.util.Arrays.asList(newRoleIds);
		System.out.println(list);
	}

	private static String convertToRoleIds(List<String> roleIdList) {
		StringBuffer roleIds = new StringBuffer();
		for (String roleId : roleIdList) {
			roleIds.append(",");
			roleIds = roleIds.append(roleId);
		}
		roleIds.append(",");
		return roleIds.toString();
	}

}
