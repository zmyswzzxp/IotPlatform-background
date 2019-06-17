package com.iot.demo.controller.back;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.iot.demo.service.ProductsInfoService;



@Controller
@RequestMapping("/back/productsinfo/")
public class ProductsInfoController {
	
	@Autowired
	private ProductsInfoService productsInfoService;
	
	
	@RequestMapping("loadadd")
	public String loadAdd()
	{
		return "back/productsinfo/productsinfo_add";
	}
	
	@RequestMapping("uploadimg")
	public @ResponseBody String uploadImg(@RequestParam MultipartFile upload){
		System.out.println("upload="+upload);
		String url=productsInfoService.doPutToFilesServer(upload);
		return url;
		
	}
//	
//	
//	@RequestMapping("uploadfile")
//	public void uploadFile(@RequestParam MultipartFile upload,HttpServletResponse response,HttpServletRequest request){
//		String url = goodsInfoService.doPutToFilesServer(upload);
//		try {
//			PrintWriter out = response.getWriter();
//			String callBack = request.getParameter("CKEditorFuncNum");
//			out.println("<script>window.parent.CKEDITOR.tools.callFunction(" + callBack + ",'" + url + "')</script>");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//	}
//	
//	@RequestMapping("add")
//	public String add(GoodsInfo goodsInfo,Model model)
//	{
//		try {
//			goodsInfoService.addGoodsInfo(goodsInfo);
//		model.addAttribute("result","添加商品成功");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			model.addAttribute("result","添加商品失败");
//		}
//		return "back/goodsinfo/goodsinfo_info";
//	}
//	
//	
//	
//	@RequestMapping("list")
//	public String list(GoodsInfo goodsInfo,Model model,Integer page){
//		PageBean<GoodsInfo> pageBean=goodsInfoService.getGoodsInfoList(goodsInfo, page);
//	   model.addAttribute("pageBean",pageBean);
//	   model.addAttribute("goodsInfo",goodsInfo);
//	   return "back/goodsInfo/goodsInfo_list";
//	}
//	
//	@RequestMapping("loadupdate")
//	public String loadUpdate(GoodsInfo goodsInfo,Model model)
//	{
//		GoodsInfo pgoods=goodsInfoService.getGoodsInfo(goodsInfo);
//		 model.addAttribute("goodsinfo",pgoods);
//		 return "back/goodsInfo/goodsInfo_update";
//	}
//	
//	@RequestMapping("update")
//	public String update(GoodsInfo goodsInfo,Model model)
//	{
//		try {
//			goodsInfoService.updateGoodsInfo(goodsInfo);
//		model.addAttribute("result","商品修改成功");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			model.addAttribute("result","商品修改失败");
//		}
//		return "back/goodsinfo/goodsinfo_info";
//	}
//		
//	
//	@RequestMapping("upgoods")
//	public String upGoods(GoodsInfo goodsInfo,Model model)
//	{
//		try {
//			goodsInfoService.upGoodsInfo(goodsInfo);
//		model.addAttribute("result","商品上架成功");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			model.addAttribute("result","商品上架失败");
//		}
//		return "back/goodsinfo/goodsinfo_info";
//	}
//	
//	
//	@RequestMapping("downgoods")
//	public String downGoods(GoodsInfo goodsInfo,Model model)
//	{
//		try {
//			goodsInfoService.downGoodsInfo(goodsInfo);
//		model.addAttribute("result","商品下架成功");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			model.addAttribute("result","商品下架失败");
//		}
//		return "back/goodsinfo/goodsinfo_info";
//	}
//	
//	
//	@RequestMapping("delete")
//	@CacheEvict(cacheNames="zy",allEntries=true)
//	public String deleteGoodsInfo(GoodsInfo goodsInfo,Model model){
//		try {
//			goodsInfoService.deleteGoodsInfo(goodsInfo);
//			model.addAttribute("result","删除商品信息成功");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			model.addAttribute("result","删除商品信息失败");
//		}
//		return "back/goodsinfo/goodsinfo_info";
//	}

}
