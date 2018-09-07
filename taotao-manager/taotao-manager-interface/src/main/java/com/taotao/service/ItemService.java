package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	/**
	 * 根据id查商品
	 * @param itemId
	 * @return 商品信息
	 */
	TbItem getItemById(long itemId);
	/**
	 * 根据页面传递过来的参数分页显示商品信息
	 * @param page 当前页
	 * @param rows 每一页显示的条数
	 * @return 总记录条数 每一个商品信息
	 */
	EasyUIDataGridResult getItems(int page, int rows);
	/**
	 * 添加商品基本信息 基本描述 规格参数
	 * @param item	基本信息
	 * @param itemDesc 基本描述
	 * @return 状态码 message json
	 */
	TaotaoResult addItem(TbItem item, String itemDesc);
}
