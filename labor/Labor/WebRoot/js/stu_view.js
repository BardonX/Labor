		function _select(is){
					//alert("进入get");
					var p=$(is).next().text();
					var stu_id=1;
					//alert(p);
					$.ajax({
						type:"get",
						url:"Stu_Servlet",
						data:{"type":"select",
							  "student_id":stu_id,
							  "message":p},
					    success:function(data){
					    	alert(data);
					    	//document.getElementById("right").innerHTML="";
					    	//$("#right").empty();
					    	//$("#right").html("");
					    }
					});						
			}		
		function btn_stu_che_timetable(){
					var stu_id=1;
					$.ajax({
						type:"get",
						url:"Stu_Servlet",
						data:{"type":"che_timetable",
							  "student_id":stu_id},
					    success:function(data){
					    	//alert(data);
					    	document.getElementById("right").innerHTML="";
					    	var datas=JSON.parse(data);
					    	$('#right').append("<table border='1' cellpadding='20' width='1000px'height='450px'>"+
					    			"      <tr>"+
					    			"          <td></td>"+
					    			"          <td>星期一</td>"+
					    			"          <td>星期二</td>"+
					    			"          <td>星期三</td>"+
					    			"          <td>星期四</td>"+
					    			"          <td>星期五</td>"+
					    			"          <td>星期六</td>"+
					    			"          <td>星期天</td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>1</td>"+
					    			"          <td id='0101'></td>"+
					    			"          <td id='0201'></td>"+
					    			"          <td id='0301'></td>"+
					    			"          <td id='0401'></td>"+
					    			"          <td id='0501'></td>"+
					    			"          <td id='0601'></td>"+
					    			"          <td id='0701'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>2</td>"+
					    			"          <td id='0102'></td>"+
					    			"          <td id='0202'></td>"+
					    			"          <td id='0302'></td>"+
					    			"          <td id='0402'></td>"+
					    			"          <td id='0502'></td>"+
					    			"          <td id='0602'></td>"+
					    			"          <td id='0702'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>3</td>"+
					    			"          <td id='0103'></td>"+
					    			"          <td id='0203'></td>"+
					    			"          <td id='0303'></td>"+
					    			"          <td id='0403'></td>"+
					    			"          <td id='0503'></td>"+
					    			"          <td id='0603'></td>"+
					    			"          <td id='0703'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>4</td>"+
					    			"          <td id='0104'></td>"+
					    			"          <td id='0204'></td>"+
					    			"          <td id='0304'></td>"+
					    			"          <td id='0404'></td>"+
					    			"          <td id='0504'></td>"+
					    			"          <td id='0604'></td>"+
					    			"          <td id='0704'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>5</td>"+
					    			"          <td id='0105'></td>"+
					    			"          <td id='0205'></td>"+
					    			"          <td id='0305'></td>"+
					    			"          <td id='0405'></td>"+
					    			"          <td id='0505'></td>"+
					    			"          <td id='0605'></td>"+
					    			"          <td id='0705'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>6</td>"+
					    			"          <td id='0106'></td>"+
					    			"          <td id='0206'></td>"+
					    			"          <td id='0306'></td>"+
					    			"          <td id='0406'></td>"+
					    			"          <td id='0506'></td>"+
					    			"          <td id='0606'></td>"+
					    			"          <td id='0706'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>7</td>"+
					    			"          <td id='0107'></td>"+
					    			"          <td id='0207'></td>"+
					    			"          <td id='0307'></td>"+
					    			"          <td id='0407'></td>"+
					    			"          <td id='0507'></td>"+
					    			"          <td id='0607'></td>"+
					    			"          <td id='0707'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>8</td>"+
					    			"          <td id='0108'></td>"+
					    			"          <td id='0208'></td>"+
					    			"          <td id='0308'></td>"+
					    			"          <td id='0408'></td>"+
					    			"          <td id='0508'></td>"+
					    			"          <td id='0608'></td>"+
					    			"          <td id='0708'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>9</td>"+
					    			"          <td id='0109'></td>"+
					    			"          <td id='0209'></td>"+
					    			"          <td id='0309'></td>"+
					    			"          <td id='0409'></td>"+
					    			"          <td id='0509'></td>"+
					    			"          <td id='0609'></td>"+
					    			"          <td id='0709'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>10</td>"+
					    			"          <td id='0110'></td>"+
					    			"          <td id='0210'></td>"+
					    			"          <td id='0310'></td>"+
					    			"          <td id='0410'></td>"+
					    			"          <td id='0510'></td>"+
					    			"          <td id='0610'></td>"+
					    			"          <td id='0710'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>11</td>"+
					    			"          <td id='0111'></td>"+
					    			"          <td id='0211'></td>"+
					    			"          <td id='0311'></td>"+
					    			"          <td id='0411'></td>"+
					    			"          <td id='0511'></td>"+
					    			"          <td id='0611'></td>"+
					    			"          <td id='0711'></td>"+
					    			"      </tr>"+
					    			"      <tr>"+
					    			"          <td>12</td>"+
					    			"          <td id='0112'></td>"+
					    			"          <td id='0212'></td>"+
					    			"          <td id='0312'></td>"+
					    			"          <td id='0412'></td>"+
					    			"          <td id='0512'></td>"+
					    			"          <td id='0612'></td>"+
					    			"          <td id='0712'></td>"+
					    			"      </tr>"+
					    			"    </table>");
					    	for(var i=0;i<datas.length;i++){
					    		var course_id=datas[i][0];
					    		var time=datas[i][1];
					    		var course_name=datas[i][2];
					    		var course_addr=datas[i][3];
					    		var teacher=datas[i][4];
					    		if(time.length==6){
					    			var id=time.substring(0,4);
					    			//break;
					    			var td=document.getElementById(id);
					    			td.setAttribute("rowspan",2);
					    			td.setAttribute("name",course_id);
					    			td.innerText=course_name+course_addr+teacher;
					    			var iddel1=time.substring(0,2);
					    			var iddel2=time.substring(4,6);
					    			var tddel=document.getElementById(iddel1+iddel2);
					    			tddel.parentNode.removeChild(tddel);
					    		}else{
					    			var td=document.getElementById(time.substring(0,4));
					    			td.setAttribute("rowspan",3);
					    			td.setAttribute("name",course_id);
					    			td.innerText=course_name+course_addr+teacher;
					    			var iddel1=time.substring(0,2);
					    			var iddel2=time.substring(4,6);
					    			var iddel3=time.substring(6,8);
					    			//数据重复了，重复数据就找不要要删的单元格
					    			var tddel1=document.getElementById(iddel1+iddel2);
					    			var tddel2=document.getElementById(iddel1+iddel3);
					    			tddel1.parentNode.removeChild(tddel1);
					    			tddel2.parentNode.removeChild(tddel2);
					    		}
					    	}
					    	/*for(var key in datas){
					    		var str=key+"_"+obj[key];
					    		var dateStart=str.indexOf("@");
					    		var lessonStart=str.indexOf("_");
					    		var lessonEnd=str.lastIndexOf("@");
					    		var date=str.substring(dateStart+1,dateStart+5);
					    		var lesson=str.substring(lessonStart+1,lessonEnd);
					    		var place=str.substring(lessonEnd+1);

					    		var td=document.getElementById(date);
					    		if(str.substring(dateStart+1,lessonStart).length==6){
					    			td.setAttribute("rowspan",2);
					    			var tdNext=str.substring(dateStart+1,dateStart+3)+str.substring(dateStart+5,lessonStart);
					    			var tdDele=document.getElementById(tdNext);
					    			tdDele.parentNode.removeChild(tdDele);
					    		}else{
					    			td.setAttribute("rowspan",3);
					    			var tdNext1=str.substring(dateStart+1,dateStart+3)+str.substring(dateStart+5,dateStart+7);
					    			var tdNext2=str.substring(dateStart+1,dateStart+3)+str.substring(dateStart+7,lessonStart);
					    			var tdDele1=document.getElementById(tdNext1);
					    			tdDele1.parentNode.removeChild(tdDele1);
					    			var tdDele2=document.getElementById(tdNext2);
					    			tdDele2.parentNode.removeChild(tdDele2);
					    		}
					    		var tdText1=document.createTextNode(lesson);
					    		var tdText2=document.createTextNode(place);
					    		td.appendChild(tdText1);
					    		td.appendChild(tdText2);
					    	}*/
					    	//$("#right").empty();
					    	//$("#right").html("");
					    	//var td=document.getElementById("0101");
							//td.setAttribute("rowspan",2);
							//var tdText1=document.createTextNode(lesson);
					    }
					});
		    		
				}
		function btn_stu_che_message(){
			var stu_id=1;
			$.ajax({
				type:"get",
				url:"Stu_Servlet",
				data:{"type":"che_message",
					  "student_id":stu_id},
			    success:function(data){
			    	document.getElementById("right").innerHTML="";
			    	var datas=JSON.parse(data);
			    	//alert(datas);
			    	$("#right ul li").remove();
			    	var ul=$("<ul></ul>");
			    	for(var i=0;i<datas.length;i++){
			    		var course_id=datas[i].course_id;
			    		var notice_contrent=datas[i].notice_contrent;
			    		var notice_id=datas[i].notice_id;
			    		var notice_regenerator=datas[i].notice_regenerator;
			    		var notice_updateTime=datas[i].notice_updateTime;
			    		var notice_uploadTime=datas[i].notice_uploadTime;
			    		var notice_uploader=datas[i].notice_uploader;
			    		var li=$("<li></li>");
			    		li.append(
			    				"<p><a href=''>"+notice_regenerator+"："+notice_contrent+"("+notice_uploader+")</a> "+
			    				"<input type='hidden' name='notice_id' value='"+notice_id+"'  />"+
			    				"<input type='hidden' name='course_id' value='"+course_id+"'  />"+
			    				"<input type='hidden' name='notice_updateTime' value='"+notice_updateTime+"'  />"+
			    				"<input type='hidden' name='notice_uploadTime' value='"+notice_uploadTime+"'  />"+
			    				"</p>");
			    		ul.append(li);
			    	}
			    	$("#right").append(ul);
			    }
			});			
		}
		function btn_stu_che_grades(){
			var stu_id=1;
			$.ajax({
				type:"get",
				url:"Stu_Servlet",
				data:{"type":"che_grades",
					  "student_id":stu_id},
			    success:function(data){
			    	//alert(data);
			    	document.getElementById("right").innerHTML="";
			    	var datas=JSON.parse(data);
			    	//alert(datas[0][0]);
			    	var table=$("<table border='1' cellpadding='0' width='1000' height=300 align='center'></table>");
			    	table.append("<tr><th>课程</th><th>学分</th><th>平均分</th><th>成绩</th></tr>");
			    	for(var i=0;i<datas.length;i++){
			    		var course_name=datas[i][0];
		    			var credit=datas[i][1];
		    			var average=datas[i][2];
		    			var grade=datas[i][3];
		    			var tr=$("<tr align='center'></tr>");
		    			tr.append(
		    					"<td>"+course_name+"</td>"+
		    					"<td>"+credit+"</td>"+
		    					"<td>"+average+"</td>"+
		    					"<td>"+grade+"</td>");
		    			table.append(tr);
			    	}
			    	$("#right").append(table);
			    }
			});
			
		}
		function btn_stu_che_balance(){
			var stu_id=1;
			$.ajax({
				type:"get",
				url:"Stu_Servlet",
				data:{"type":"che_balace",
					  "student_id":stu_id},
			    success:function(data){
			    	document.getElementById("right").innerHTML="";
			    	//alert(data);
			    	/*//先清楚iframe
			    	var frame=$('iframe');
			    	frame[0].contentWindow.document.write('');//清空iframe的内容
			    	frame[0].contentWindow.close();//避免iframe内存泄漏
			    	frame.remove();//删除iframe
			    	//$("#right").remove();*/
			    	$("#right").append("<div align='center'><h3>所剩余额：</h3><br/><input type='text' name='balance' value='"+data+"'/></div>");
			    }
			});
		   
		}
	
		function btn_stu_elective_course_back(){
			document.getElementById("right").innerHTML="";
			var stu_id=1;
			$.ajax({
				type:"get",
				url:"Stu_Servlet",
				data:{"type":"elective_course_back",
					  "student_id":stu_id},
			    success:function(data){
			    	//alert(data);
			    	document.getElementById("right").innerHTML="";
			    	var datas=JSON.parse(data);
			    	var div=$("<div id='divsel1' style='float: left'></div>");
			    	var ul=$("<ul></ul>");
			    	for(var i=0;i<datas.length;i++){
			    		var course_id=datas[i][0];
			    		var course_name=datas[i][1];
			    		var course_time=datas[i][2];
			    		var course_addr=datas[i][3];
			    		var course_credit=datas[i][4];
			    		var li=$("<li></li>");
			    		li.append("<input type='checkbox' onchange='_select(this)' value='"+course_id+"' name='"+course_time+"' /><p>"+course_name+" "+course_time+" "+course_addr+" "+course_credit+"学分</p>" );
			    		ul.append(li);
			    	}
			    	div.append(ul);
			    	$("#right").append(div);
			    }
			});
					
		}
		
		function btn_stu_course_evaluation(){
			var stu_id=1;
			$.ajax({
				type:"get",
				url:"Stu_Servlet",
				data:{"type":"course_evaluation",
					  "student_id":stu_id},
			    success:function(data){
			    	//alert(data);
			    	document.getElementById("right").innerHTML="";
			    	var datas=JSON.parse(data);
			    	var table=$("<table border='1' align='center' cellpadding='20' width='1000px' height='450px'>");
			    	table.append("<tr><th>老师</th><th>课程</th><th>状态</th><th>评价</th><th>提交</th></tr>");
			    	for(var i=0;i<datas.length;i++){
			    		var tr=$("<tr align='center'></tr>");
			    		var course_id=datas[i][0];
			    		var course_evaluation=datas[i][1];
			    		var course_name=datas[i][2];
			    		var course_teacher=datas[i][3];
			    		var course_teacher_id=datas[i][4];
			    		var course_evaluation_condition=datas[i][5];
			    		tr.append("<td>"+course_teacher+"<input type='hidden' name='course_teacher_id' value='"+course_teacher_id+"'  /></td>");
			    		tr.append("<td>"+course_name+"<input type='hidden' name='course_id' value='"+course_id+"'  /></td>");
			    		if(course_evaluation=="null"){
			    			tr.append("<td>未评价</td><td><a href=''>评价</a></td><td><a href=''>提交</a></td>");
			    		}else{
			    			//tr.append("<td>已评价</td>");
			    			if(course_evaluation_condition=="1"){
			    				//未提交
				    			tr.append("<td>已评价</td><td><a href=''>修改</a></td><td><a href=''>提交</a></td>");
				    		}else{
				    			tr.append("<td>已评价</td><td>不可修改</td><td>已提交</td>");
				    		}
			    		}
			    		table.append(tr);
			    	}
			    	$("#right").append(table);
			    }
			});
			
		}
		