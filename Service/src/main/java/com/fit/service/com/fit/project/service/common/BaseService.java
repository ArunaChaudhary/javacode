package com.fit.service.com.fit.project.service.common;

import java.util.List;

public interface BaseService<T> {
	public default String getObjectName(T record) {
		return " '" + record.getClass().getSimpleName().replace("Bean", "") + "' ";
	}

	public default String getObjectName(List<T> records) {
		if (records == null || records.isEmpty()) {
			return "";
		}
		return " '" + records.get(0).getClass().getSimpleName().replace("Bean", "") + "' ";
	}
}
