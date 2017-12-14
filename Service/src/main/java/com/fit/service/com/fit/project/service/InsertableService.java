package com.fit.service.com.fit.project.service;

import java.util.List;

import com.fit.exceptions.BusinessException;
import com.fit.exceptions.DuplicatedEntryException;
import com.fit.project.common.bean.BaseBean;
import com.fit.service.com.fit.project.service.common.BaseService;

public interface InsertableService<T extends BaseBean> extends BaseService<T> {
	public long insert(T record, long recordRegId) throws DuplicatedEntryException, BusinessException;

	public void insert(List<T> records, long recordRegId) throws DuplicatedEntryException, BusinessException;
}
