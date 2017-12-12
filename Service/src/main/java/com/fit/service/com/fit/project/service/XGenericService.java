package com.fit.service.com.fit.project.service;

import java.util.List;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.BusinessException;
import com.fit.exceptions.ConsistencyViolationException;
import com.fit.exceptions.DuplicatedEntryException;
import com.fit.project.entity.util.FetchMode;
import com.fit.service.com.fit.project.service.common.BaseService;

public interface XGenericService<T extends BaseBean, C extends BaseCriteria> extends BaseService<T> {

	public void insert(T record, long recordRegId) throws DuplicatedEntryException, BusinessException;

	public void insert(List<T> records, long recordRegId) throws DuplicatedEntryException, BusinessException;

	public void insert(long key1, long key2, long recordRegId) throws DuplicatedEntryException, BusinessException;

	public long delete(long key1, long key2, long recordUpdId) throws ConsistencyViolationException, BusinessException;

	public long delete(C criteria, long recordUpdId) throws ConsistencyViolationException, BusinessException;

	public void merge(long mainKey, List<Long> relatedKeys, long recordUpdId) throws DuplicatedEntryException, ConsistencyViolationException, BusinessException;

	public List<Long> selectByKey1(long key1) throws BusinessException;

	public List<Long> selectByKey2(long key2) throws BusinessException;

	public T select(long key1, long key2, FetchMode fetchMode) throws BusinessException;

	public List<T> selectList(C criteria, FetchMode fetchMode) throws BusinessException;

	public long selectCounts(C criteria) throws BusinessException;
}
