package com.taotao.service;

import com.taotao.common.pojo.PictureResult;

public interface PictureService {
	/**
	 * 
	 * @param bytes 图片的byte数组
	 * @param name 名称
	 * @return 返回一个json数据
	 */
	 PictureResult uploadFile(byte[] bytes, String name);
	 
}
