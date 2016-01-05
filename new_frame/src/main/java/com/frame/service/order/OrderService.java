package com.frame.service.order;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frame.mapper.order.OrderMapper;
import com.frame.service.base.BusinessException;
import com.frame.service.base.CommonEnum;
import com.frame.service.base.Constants;

@Service
public class OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Transactional
	public HashMap<Object,Object> getOrderInfo(HashMap<Object, Object> param) {
		HashMap<Object,Object> resultMap = new HashMap<Object, Object>();
		try
		{
			List<HashMap<Object,Object>> KHQSDList = orderMapper.getKHQSDList(param);
			if(KHQSDList.size()>0&&KHQSDList.get(0)!=null&&(param.get("F_KHQSD")!=null&&!param.get("F_KHQSD").equals("")))
			{
				param.put("F_KHQSD", (KHQSDList.get(0)).get("F_KHQSD"));
			}
			HashMap<Object,Object> KHDD = orderMapper.getKHDD(param);
			HashMap<Object,Object> KHDDZT = orderMapper.getKHDDZT(param);
			List<HashMap<Object,Object>> ysddList = orderMapper.getYSDDSJList(param);
			HashMap<Object,Object> YDSJZT = ysddList.size()==0?null:ysddList.get(0);
			HashMap<Object,Object> YDZT = orderMapper.getYDZT(param);
			param.put("F_KHDDBH", KHDD.get("F_KHDDBH"));
			param.put("F_SHRLLFS", KHDD.get("F_SHRLLFS"));
			param.put("F_SHLLR", KHDD.get("F_SHLLR"));
			List<HashMap<Object,Object>> DDGZList = orderMapper.getDDGZList(param);
			//状态判定
			int GZZT = -1;
			if(YDZT!=null&&Integer.parseInt(YDZT.get("F_YSDMXZT")==null?"0":YDZT.get("F_YSDMXZT").toString())>=Constants.YDZT_WC)
			{
				GZZT = Constants.DDGZZT_WC;
			}else if(YDSJZT!=null&&YDSJZT.get("YSDDSJZT").equals(Constants.YDSJZT_DD))
			{
				GZZT = Constants.DDGZZT_DD;
			}else if(YDSJZT!=null&&YDSJZT.get("YSDDSJZT").equals(Constants.YDSJZT_QY))
			{
				GZZT = Constants.DDGZZT_QY;
			}else if(YDSJZT!=null&&YDSJZT.get("YSDDSJZT").equals(Constants.YDSJZT_PC))
			{
				GZZT = Constants.DDGZZT_PC;
			}else if(KHDDZT!=null&&Integer.parseInt(KHDDZT.get("F_DDZT")==null?"0":KHDDZT.get("F_DDZT").toString())>=Constants.KHDDZT_JS)
			{
				GZZT = Constants.KHDDZT_JS;
			}else if(KHDDZT!=null&&Integer.parseInt(KHDDZT.get("F_DDZT")==null?"0":KHDDZT.get("F_DDZT").toString())>=Constants.KHDDZT_ZC)
			{
				GZZT = Constants.KHDDZT_ZC;
			}
			resultMap.put("GZZT", GZZT);
			resultMap.put("KHQSDList", KHQSDList);
			resultMap.put("KHDD", KHDD);
			resultMap.put("DDGZList", DDGZList);
		}catch(BusinessException e)
		{
			throw e;
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return resultMap;
	}
	
	@Transactional
	public HashMap<Object,Object> getOrderInfoByKHDD(HashMap<Object,Object> param) {
		HashMap<Object,Object> resultMap = new HashMap<Object, Object>();
		try
		{
			List<HashMap<Object,Object>> KHDDList = orderMapper.getKHDDByKHDD(param);
			resultMap.put("KHDDList", KHDDList);
		}catch(BusinessException e)
		{
			throw e;
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return resultMap;
	}
}
