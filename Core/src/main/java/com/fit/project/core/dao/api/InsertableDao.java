package com.fit.project.core.dao.api;

import java.util.List;

import com.fit.entity.bean.common.BaseBean;
import com.fit.exceptions.DAOException;
import com.fit.exceptions.DuplicatedEntryException;

public interface InsertableDao<T extends BaseBean> {

	public long insert(T record, long recordRegId) throws DuplicatedEntryException, DAOException;

	public void insert(List<T> records, long recordRegId) throws DuplicatedEntryException, DAOException;
}
