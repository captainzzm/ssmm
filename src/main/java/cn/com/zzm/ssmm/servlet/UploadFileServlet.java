package cn.com.zzm.ssmm.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



/**文件上传servlet
 * @author zzm
 *
 */
@WebServlet("/uploadfile")
public class UploadFileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		String path = request.getServletContext().getRealPath("/upload");
		//设置磁盘缓冲路径
		diskFileItemFactory.setRepository(new File(path));
		//设置磁盘缓冲大小
		diskFileItemFactory.setSizeThreshold(1024*1024);
		
		ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
		//文件大小限制
		servletFileUpload.setSizeMax(1024*1024*5);
		try{
			List<FileItem> list = servletFileUpload.parseRequest(request);
			for(FileItem item:list){
				if(item.isFormField()){
					//表单域
					
				}else{
					//文件域
					String fieldName = item.getFieldName();
					String name = item.getName();
					InputStream in  = item.getInputStream();
					
				}
			}
		}catch(Exception e){
			
		}
		
		
	}

}
