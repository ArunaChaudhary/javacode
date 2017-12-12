package com.fit.project.core.dao.api;

import java.util.List;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.ConsistencyViolationException;
import com.fit.exceptions.DAOException;
import com.fit.exceptions.DuplicatedEntryException;
import com.fit.project.entity.util.FetchMode;

public interface XGenericDao<T extends BaseBean, C extends BaseCriteria> {

	public void insert(T record, long recordRegId) throws DuplicatedEntryException, DAOException;

	public void insert(List<T> records, long recordRegId) throws DuplicatedEntryException, DAOException;

	public void insert(long key1, long key2, long recordRegId) throws DuplicatedEntryException, DAOException;

	public long delete(long key1, long key2, long recordUpdId) throws ConsistencyViolationException, DAOException;

	public long delete(C criteria, long recordUpdId) throws ConsistencyViolationException, DAOException;

	public void merge(long mainKey, List<Long> relatedKeys, long recordUpdId) throws DuplicatedEntryException, ConsistencyViolationException, DAOException;

	public void merge(List<Long> relatedKeys, long joinKey, long recordUpdId) throws DuplicatedEntryException, ConsistencyViolationException, DAOException;

	public List<Long> selectByKey1(long key1) throws DAOException;

	public List<Long> selectByKey2(long key2) throws DAOException;

	public T select(long key1, long key2, FetchMode fetchMode) throws DAOException;

	public List<T> selectList(C criteria, FetchMode fetchMode) throws DAOException;

	public long selectCounts(C criteria) throws DAOException;
}
