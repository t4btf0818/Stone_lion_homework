package com.bjtu.edu.web.admin;

import com.bjtu.edu.entity.Homework;
import com.bjtu.edu.service.HomeworkService;
import com.bjtu.edu.util.HttpServletRequestUtil;
import com.bjtu.edu.util.Layui;
import com.bjtu.edu.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @project: HMS-mvc
 * @description: 作业管理类-管理员界面
 */
@Controller
@RequestMapping("/admin")
public class HomeworkManagementController {
    @Autowired
    private HomeworkService homeworkService;

    /**
     * @description: 列出所有作业列表-返回为Layui类型
     *
     * @param
     * @return com.bjtu.edu.util.Layui
     */
    @RequestMapping(value = "/listHomework",method = RequestMethod.GET)
    @ResponseBody
    public Layui listHomework(){
        //查询作业列表数据
        List<Homework> homeworkList = homeworkService.getHomeworkList();
        return Layui.data(homeworkList.size(),homeworkList);
    }

    /**
     * @description: 删除作业信息
     *
     * @param homeworkId
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    //根据前端路由路径中传递的homeworkId值删除指定作业信息
    @RequestMapping(value = "/deleteHomework",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> deleteHomework(@RequestParam("homeworkId") Long homeworkId){
        Map<String,Object> modelMap = new HashMap<>();
        homeworkService.deleteHomework(homeworkId);
        modelMap.put("success",true);
        return modelMap;
    }

    /**
     * @description: 下载作业
     *
     * @param request
     * @param response
     * @return void
     */
    @RequestMapping(value="/downloadHomework",method = RequestMethod.GET)
    @ResponseBody
    public void downloadHomework(HttpServletRequest request, HttpServletResponse response) throws IOException {
        long homeworkId = HttpServletRequestUtil.getLong(request,"homeworkId");
        Homework homework = new Homework();
        homework = homeworkService.getHomeworkById(homeworkId);

        //获取所要下载文件的路径
        String homeworkFile = homework.getHomeworkFile();
        homeworkFile = new String(homeworkFile.getBytes("GB2312"), "ISO_8859_1");
        String path = PathUtil.getFileBasePath() + homeworkFile;

        //得到要下载的文件
        File file = new File(path);
        if (!file.exists()) {
            response.setContentType("text/html; charset=UTF-8");//注意text/html，和application/html
            response.getWriter().print("<html><body><script type='text/javascript'>alert('您要下载的资源已被删除！');</script></body></html>");
            response.getWriter().close();
            System.out.println("您要下载的资源已被删除！！");
            return;
        }
        //设置文件下载头，同时将文件名转码，免得文件名中文乱码
        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(file.getName(),"UTF-8"));
        //设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        // 读取要下载的文件，保存到文件输入流
        FileInputStream in = new FileInputStream(path);
        // 创建输出流
        OutputStream out = response.getOutputStream();
        // 创建缓冲区
        byte[] buffer = new byte[1024]; // 缓冲区的大小设置
        int len = 0;
        //循环将输入流中的内容读取到缓冲区当中
        while((len = in.read(buffer)) > 0){
            out.write(buffer, 0, len);
        }
        //关闭文件输入流
        in.close();
        // 关闭输出流
        out.close();
    }
}
