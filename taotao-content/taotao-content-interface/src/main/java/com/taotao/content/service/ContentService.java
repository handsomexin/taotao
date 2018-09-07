package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;

public interface ContentService {
	/**
	 * 根据分类id查询得到指定内容信息
	 * @param catgoryId 分类id
	 * @return json数据 包含总记录条数和每条记录的json数据
	 */
	EasyUIDataGridResult findContentAll(long catgoryId);
	/**
	 * 添加一个cms内容信息
	 * @param tbContent 
	 * @return 200表示成功
	 */
	TaotaoResult addContent(TbContent tbContent);
	/**
	 * 根据分类id查询指定内容
	 * @param catgoryId 分类ID
	 * @return 指定id多有内容
	 */
	List<TbContent> getTbContent(long catgoryId);
}
