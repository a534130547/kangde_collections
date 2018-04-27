package com.atguigu.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.atguigu.bean.CaseBatch;
import com.atguigu.bean.CaseBatchWithBLOBs;
import com.atguigu.bean.SearchBatchBean;
import com.atguigu.service.CaseBatchService;
import com.atguigu.util.MyFileUpload;

@Controller
public class CaseBatchController {

	@Autowired
	CaseBatchService caseBatchService;

	@RequestMapping("get_CaseBatch_by_id")
	@ResponseBody
	public CaseBatch getCaseBatchById(int id) {

		CaseBatch cb = caseBatchService.getCaseBatchById(id);

		return cb;
	}

	@RequestMapping("get_CaseBatch")
	@ResponseBody
	public List<CaseBatchWithBLOBs> get_CaseBatch() {

		List<CaseBatchWithBLOBs> selectAll = caseBatchService.selectAll();

		return selectAll;
	}

	@RequestMapping("get_SearchcaseBatch")
	@ResponseBody
	public List<CaseBatchWithBLOBs> get_SearchcaseBatch(SearchBatchBean searchBatchBean) {

		Map<Object, Object> map = new HashMap<Object, Object>();
		// String name = searchcaseBatch.getName();
		// String endTime = searchcaseBatch.getEndTime();
		// String startTime = searchcaseBatch.getStartTime();
		// map.put("name", name);
		// map.put("endTime", endTime);
		// map.put("startTime", startTime);
		// 修改date格式
		if (searchBatchBean.getBeginDate() != null && searchBatchBean.getBeginDate() != ""
				&& searchBatchBean.getEndDate() != null && searchBatchBean.getEndDate() != "") {
			String beginDate = searchBatchBean.getBeginDate();
			String replace = beginDate.replace("/", "-");
			String[] split = replace.split("-");
			String begin = split[2] + "-" + split[0] + "-" + split[1];
			System.out.println(begin);
			String endDate = searchBatchBean.getEndDate();
			String replace2 = endDate.replace("/", "-");
			String[] split2 = replace2.split("-");
			String end = split2[2] + "-" + split2[0] + "-" + split2[1];
			System.out.println(end);
			// 放在map中
			map.put("batchCode", searchBatchBean.getBatchCode());
			map.put("typeId", searchBatchBean.getTypeId());
			map.put("entrustId", searchBatchBean.getEntrustId());
			map.put("beginDate", begin);
			map.put("endDate", end);
		}
		// 根据map查询
		List<CaseBatchWithBLOBs> list = caseBatchService.selectSerchcaseBatch(map);

		return list;
	}

	@RequestMapping("goto_CaseBatch")
	public String goto_caseBatch(ModelMap map) {

		List<CaseBatchWithBLOBs> list = caseBatchService.selectAll();

		map.put("caseBatchlist", list);

		return "case_batch";
	}

	// 有文件上传
	@RequestMapping("add_caseBatch")
	public String addcaseBatch(@RequestParam("files") MultipartFile[] files, CaseBatchWithBLOBs caseBatch) {

		List<String> list_file = MyFileUpload.image_uploaf(files);
		System.out.println(list_file);

		caseBatch.setUploadTime(new Date());

		caseBatch.setBatchXls(list_file.get(0));
		// 设置创建时间
		caseBatch.setCreateTime(new Date());
		// 设置更新时间
		caseBatch.setModifyTime(new Date());

		caseBatchService.add(caseBatch);

		return "redirect:/get_CaseBatch.do";
	}

	@RequestMapping("delete_caseBatch")
	public String deletecaseBatch(int id) {

		caseBatchService.deleteById(id);

		return "redirect:/goto_CaseBatch.do";
	}

	@RequestMapping("update_caseBatch")
	public String updateCaseBatch(CaseBatchWithBLOBs caseBatch) {

		// 更新修改时间
		caseBatch.setModifyTime(new Date());

		// 查询caseBatch
		CaseBatch caseBatchById = caseBatchService.getCaseBatchById(caseBatch.getId());

		// 设置创建时间
		if (caseBatch.getCreateTime() == null) {

			caseBatch.setCreateTime(caseBatchById.getCreateTime());
		}

		// 设置修改时间
		if (caseBatch.getModifyTime() == null) {

			caseBatch.setModifyTime(new Date());
		}

		caseBatchService.update(caseBatch);

		return "redirect:/index.do";
	}

}