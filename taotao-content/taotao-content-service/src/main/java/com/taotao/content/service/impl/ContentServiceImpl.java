package com.taotao.content.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentService;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
@Service
public class ContentServiceImpl implements ContentService {
	@Autowired
	private TbContentMapper tbContentMapper;
	
	@Override
	public EasyUIDataGridResult findContentAll(long catgoryId) {
		List<TbContent> tbContentAll = tbContentMapper.findTbContentAll(catgoryId);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(tbContentAll.size());
		result.setRows(tbContentAll);
		
		return result;
	}

	@Override
	public TaotaoResult addContent(TbContent tbContent) {
		Date date = new Date();
		tbContent.setCreated(date);
		tbContent.setUpdated(date);
		tbContentMapper.addTbContent(tbContent);
		
		return TaotaoResult.ok();
	}

	@Override
	public List<TbContent> getTbContent(long catgoryId) {
		List<TbContent> result = tbContentMapper.findTbContentAll(catgoryId);
		return result;
	}

}
