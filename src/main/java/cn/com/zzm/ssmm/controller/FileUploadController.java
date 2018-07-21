package cn.com.zzm.ssmm.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**文件上传处理
 * @author zzm
 *
 */
@Controller
@RequestMapping(value="/upload", method=RequestMethod.POST)
public class FileUploadController {
	
	@RequestMapping(value="/fileUpload.do")
	@ResponseBody
	public Map fileUpload(HttpServletRequest request,
			@RequestParam(value="imageFile",required=false) MultipartFile imageFile){
		try{
			if(!imageFile.isEmpty()){
				//validateImage(imageFile);
			}
			//上传文件路径
	        String path = request.getServletContext().getRealPath("/images/");
	           //上传文件名
           String filename = imageFile.getOriginalFilename();
           File filepath = new File(path,filename);
           //判断路径是否存在，如果不存在就创建一个
           if (!filepath.getParentFile().exists()) { 
               filepath.getParentFile().mkdirs();
           }
           //将上传文件保存到一个目标文件当中
           imageFile.transferTo(new File(path + File.separator + filename));
           return new HashMap();
		}catch(Exception e){
			//
		}
		
		return new HashMap();
		
		
	}
	
	/**验证类型
	 * @param imageFile
	 */
	private void validateImage(MultipartFile imageFile){
	 
		if(!imageFile.getContentType().equals("image/jpeg")){
			//
		}
			 
		 
		
		
	}
	

}
