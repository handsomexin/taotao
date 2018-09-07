package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;

public interface ItemCatService {
	/**
	 * 根据分类id查询分类
	 * @param parentId 分类id
	 * @return json集合数据 包含id text state
	 */
	List<EasyUITreeNode> getCatList(long parentId);
}
