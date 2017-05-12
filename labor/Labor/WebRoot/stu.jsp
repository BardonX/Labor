<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息模块</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/mystyle.css" />
	<style>
			.btn{width: 100px;height: 40px;}
	</style>
  </head>
  
  <body>
        <script src="js/jquery-3.1.1.min.js" type="text/javascript" charset="UTF-8"></script>
		<script src="js/stu_view.js" type="text/javascript" charset="UTF-8"></script>
		<div id="header">
			<h1>XXX（学生姓名）</h1><!--student_id   -->
		</div>
		
		<div id="left" style="float: left">
			<button class="btn" type="button" onclick="btn_stu_che_timetable()">我的课表</button>
			<br /><br />
			<button class="btn" type="button" onclick="btn_stu_che_message()">我的消息</button>
			<br /><br />
			<button class="btn" type="button" onclick="btn_stu_che_grades()">查看成绩</button>
			<br /><br />
			<button class="btn" type="button" onclick="btn_stu_che_balance()">余额</button>
			<br /><br />
			<!-- <button class="btn" type="button" onclick="btn_stu_che_integration()">积分</button>
			<br /><br /> -->
			<button class="btn" type="button" onclick="btn_stu_elective_course_back()">选课退课</button>
			<br /><br />
			<button class="btn" type="button" onclick="btn_stu_course_evaluation()">课程评价</button>
		</div>

		<div id="right">
		        <table id="tabweb" border="1">  
					  <tr>  
					    <td>      index    </td>  
					  </tr>  
				</table> 
		</div>
		     	
		<div id=footer>
			<p>学生模块</p>
		</div>
       
		<script type="text/javascript">
		window.onload = function()
        {
			btn_stu_elective_course_back();
        };
        /* $(":checkbox").on("change",function(){
        	alert("选择");
        });
        $("#right").find(":checkbox").onchange(function(){
        	alert("进入");
        });
        $("#right").on("click","#10",function(){
        	alert("进来");
        }); */
        //alert("最后");
		</script>
	</body>
</html>
