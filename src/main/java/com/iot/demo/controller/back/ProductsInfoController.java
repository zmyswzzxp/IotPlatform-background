package com.iot.demo.controller.back;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iot.demo.bean.ProductInfo;
import com.iot.demo.bean.ProductInfoExample;
import com.iot.demo.bean.ProductInfoQueryVo;
import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.service.ProductsInfoService;
import com.iot.demo.utils.PageBean;



@Controller
@RequestMapping("/back/productinfo/")
public class ProductsInfoController {
	
	@Autowired
	private ProductsInfoService productInfoService;
	
	
	@RequestMapping("loadadd")
	public String loadAdd()
	{
		return "back/productinfo/productinfo_add";
	}
	
	@RequestMapping("uploadimg")
	public @ResponseBody String uploadImg(@RequestParam MultipartFile upload){
		System.out.println("upload="+upload);
		String url=productInfoService.doPutToFilesServer(upload);
		return url;
		
	}
	
	@RequestMapping("uploadimg2")
	public @ResponseBody String uploadImg2(@RequestParam MultipartFile upload2){
		System.out.println("upload="+upload2);
		String url=productInfoService.doPutToFilesServer(upload2);
		return url;
		
	}
	
	@RequestMapping("uploadfile")
	public void uploadFile(@RequestParam MultipartFile upload,HttpServletResponse response,HttpServletRequest request){
		String url = productInfoService.doPutToFilesServer(upload);
		try {
			PrintWriter out = response.getWriter();
			String callBack = request.getParameter("CKEditorFuncNum");
			out.println("<script>window.parent.CKEDITOR.tools.callFunction(" + callBack + ",'" + url + "')</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	@RequestMapping("list")
	public String list(ProductInfo productInfo,Model model,Integer page){
		PageBean<ProductInfoExample> pageBean=productInfoService.getProductInfoList(productInfo, page);
	   model.addAttribute("pageBean",pageBean);
	   model.addAttribute("ProductInfoExample",productInfo);
	   return "back/productInfo/productInfo_list";
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
	@RequestMapping("add")
	public String add(ProductInfo productInfo,@RequestParam("files") MultipartFile[] files,Model model)
	{
		try {
			List<String> listimage=new ArrayList<String>();
			for	(int i=0;i<files.length;i++)
			{
				listimage.add(productInfoService.doPutToFilesServer(files[i]));
			}
			
			
			productInfo.setProductUrl(listimage.get(0));
			
			productInfoService.addProductInfo(productInfo,listimage);
			model.addAttribute("result","添加产品成功");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("result","添加产品失败");
		}
		return "back/productinfo/productinfo_info";
	}

//	
	@RequestMapping("loadupdate")
	public String loadUpdate(ProductInfo productInfo,Model model)
	{
//		ProductInfoQueryVo productInfoQueryVo=new ProductInfoQueryVo();
//		ProductInfo productInfo1=new ProductInfo();
//		productInfo1.setProductId(16);
//		productInfoQueryVo.setProductInfo(productInfo1);
//		ProductInfoExample productInfoExample=productInfoService.getproductInfoQueryVo(productInfoQueryVo);
		
		 ProductInfo pproductInfo=productInfoService.getProductInfo(productInfo);
		 model.addAttribute("productinfo",pproductInfo);
		 return "back/productInfo/productInfo_update";
	}
//	
	@RequestMapping("update")
	public String update(ProductInfo productInfo,Model model)
	{
		try {
			productInfoService.updateProductInfo(productInfo);
		model.addAttribute("result","产品修改成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("result","产品修改失败");
		}
		return "back/productinfo/productinfo_info";
	}
//		
//	
	@RequestMapping("upproduct")
	public String upGoods(ProductInfo productInfo,Model model)
	{
		try {
			productInfoService.updateProductInfo(productInfo);
		model.addAttribute("result","产品上架成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("result","产品上架失败");
		}
		return "back/productinfo/productinfo_info";
	}
//	
//	
	@RequestMapping("downproduct")
	public String downGoods(ProductInfo productInfo,Model model)
	{
		try {
			productInfoService.downProductInfo(productInfo);
			model.addAttribute("result", "产品下架成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("result", "产品下架失败");
		}
		return "back/productinfo/productinfo_info";
	}
	
	
	@RequestMapping("delete")
	public String deleteProductInfo(ProductInfo productInfo,Model model){
		try {
			productInfoService.deleteProductInfo(productInfo);
			model.addAttribute("result", "删除产品信息成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("result", "删除产品信息失败");
		}
		return "back/productinfo/productinfo_info";
	}
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
	
	@RequestMapping("goto_spu_add")
	public String goto_spu_add(ModelMap map,ProductInfo spu)
	{
		map.put("spu", spu);
		return "spuAdd";
	}
	
	


}
