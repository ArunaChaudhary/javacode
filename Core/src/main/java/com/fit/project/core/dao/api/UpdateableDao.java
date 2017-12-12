package com.fit.project.core.dao.api;

import java.util.HashMap;
import java.util.List;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.DAOException;
import com.fit.exceptions.DuplicatedEntryException;

public interface UpdateableDao<T extends BaseBean, C extends BaseCriteria> {

	public long update(T record, long recordUpdId) throws DuplicatedEntryException, DAOException;

	public void update(List<T> records, long recordUpdId) throws DuplicatedEntryException, DAOException;

	public long update(C criteria, HashMap<String, Object> updateItems, long recordUpdId) throws DAOException, DuplicatedEntryException;
}
