package com.fit.service.com.fit.project.service;

import java.util.HashMap;
import java.util.List;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.BusinessException;
import com.fit.exceptions.DuplicatedEntryException;
import com.fit.service.com.fit.project.service.common.BaseService;

public interface UpdatableService<T extends BaseBean, C extends BaseCriteria> extends BaseService<T> {
	public long update(T record, long recordUpdId) throws DuplicatedEntryException, BusinessException;

	public void update(List<T> records, long recordUpdId) throws DuplicatedEntryException, BusinessException;

	public long update(C criteria, HashMap<String, Object> updateItems, long recordUpdId) throws BusinessException, DuplicatedEntryException;

}
