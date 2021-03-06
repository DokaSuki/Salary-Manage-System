<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>DisplayEmployeeInfo</title>
	<link rel="stylesheet" href="css/form/form_layout.css">
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function findEmployee() {
			var topWin = window.top.document.getElementById("mainFrame").contentWindow;
			var myform1 = topWin.document.getElementById("myform1");
			myform1.action = "employee/getEmployeeInfo_DisplayEmployeeInfo";
			myform1.method = "post";
			myform1.submit();
		}
	function checkLogin() {
		var nid = "<%=session.getAttribute("user.id")%>";
		if (nid == "null" || nid == "") {			
			window.location.href="login.jsp";
			$(".alert").alert("请先登录！");
		}
	}
	
	function showError() {
		var resultInfo = "<%=session.getAttribute("resultInfo")%>";
		<%session.removeAttribute("resultInfo");%>
		if (resultInfo != "null" && resultInfo != "" && resultInfo != null) {			
				alert(resultInfo);
			}
	}

	showError();
</script>
</head>

<body onload="checkLogin()">
<div class="panel panel-info form_card">
	<div class="panel-heading">
		<h3 class="panel-title">
			查找职工
		</h3>
	</div>
	<div class="panel-body">
		<form class="form-horizontal" role="form"  id="myform1">
		<div class="form-group">
			<label for="input" class="col-sm-2 control-label">输入职工号：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" name="employee.id" id="input" placeholder="工号范围111111-999999">
			</div>
			<button type="button" class="btn btn-success" onclick="findEmployee()">查询</button>
		</div>
		</form>
	</div>
</div>
<div class="panel panel-success form_card">
	<div class="panel-heading">
		<h3 class="panel-title">
			职工信息
		</h3>
	</div>
	<div class="panel-body">
			<table class="table table-hover" id="myform">
				<tbody >
				<tr >
					<td style="width:40%;">职工号：</td> <td><s:property value="#session.eInfo.id"/></td>
				</tr>

				<tr>
					<td>姓名:</td> <td><s:property  value="#session.eInfo.name"/></td>
				</tr>

				<tr>
					<td>邮箱:</td> <td><s:property  value="#session.eInfo.email"/></td>
				</tr>

				<tr>
					<td>性别:</td> <td><s:property  value="#session.eInfo.gender"/> </td>
				</tr>

				<tr>
					<td>出生日期:</td> <td><s:date  name="#session.eInfo.birthday" format="yyyy-MM-dd"/></td>
				</tr>

				<tr>
					<td>身份证号:</td> <td><s:property  value="#session.eInfo.uid" /></td>
				</tr>

				<tr>
					<td>单位:</td> <td><s:property  value="#session.eInfo.department" /></td>
				</tr>

				<tr>
					<td>岗位性质:</td> <td><s:property  value="#session.eInfo.jobType" /></td>
				</tr>

				<tr>
					<td>人员身份:</td> <td><s:property  value="#session.eInfo.type" /></td>
				</tr>

				<tr>
					<td>进校来源:</td> <td><s:property  value="#session.eInfo.source" /></td>
				</tr>

				<tr>
					<td>入校报到时间:</td> <td><s:date  name="#session.eInfo.reachSchoolDate" format="yyyy-MM-dd"/></td>
				</tr>

				<tr>
					<td>最高学历:</td> <td><s:property  value="#session.eInfo.maxEducation" /></td>
				</tr>

				<tr>
					<td>最高学历获得时间:</td> <td><s:date  name="#session.eInfo.maxEducationDate" format="yyyy-MM-dd"/></td>
				</tr>

				<tr>
					<td>最高学位:</td> <td><s:property  value="#session.eInfo.maxDegree" /></td>
				</tr>

				<tr>
					<td>最高学位获得时间:</td> <td><s:date  name="#session.eInfo.maxDegreeDate" format="yyyy-MM-dd"/></td>
				</tr>

				<tr>
					<td>聘任职务:</td> <td><s:property  value="#session.eInfo.hireWork" /></td>
				</tr>

				<tr>
					<td>职务级别:</td> <td><s:property  value="#session.eInfo.workLevel" /></td>
				</tr>
				<tr>
					<td>任职时间:</td> <td><s:date  name="#session.eInfo.startWorkDate" format="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td>聘任职称:</td> <td><s:property  value="#session.eInfo.hireTitle" /></td>
				</tr>
				<tr>
					<td>职称级别:</td> <td><s:property  value="#session.eInfo.titleLevel" /></td>
				</tr>
				<tr>
					<td>聘任时间:</td> <td><s:date  name="#session.eInfo.hireDate" format="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td>(拟)聘任岗位:</td> <td><s:property  value="#session.eInfo.hireJob" /></td>
				</tr>
				<tr>
					<td>聘岗级别:</td> <td><s:property  value="#session.eInfo.jobLevel" /></td>
				</tr>
				<%session.removeAttribute("eInfo"); %>
				</tbody>
			</table>
	</div>
</div>

</body>
</html>