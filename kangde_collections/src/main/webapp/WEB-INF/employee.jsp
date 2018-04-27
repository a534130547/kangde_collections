<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String basePath=request.getScheme()+"://"+request.getServerName()+":" +request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" >
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>催收系统</title>
</head>
<body>
<form action="javascript:;">
<div>
员工状态:<select  id="employeeStatusIdId"  name="employeeStatusId">
						       <option value="1">正在使用</option>
						       <option value="0">停止使用</option>
             </select>
机构：<select id="orgSearchIdId"   name="orgSearchId">
                 <!--
                      如果没有设置value属性值，提交的是option中的文本值
                      如果设置了value属性值，提交的就是value属性值
                  -->
						       <c:forEach  items="${sysList }"  var="sys">
						           <option value="${sys.id}">${sys.name }</option>
						       </c:forEach>
                 <!-- 通过selected="selected"设置默认被选中 -->
             </select>
             账号：<input id="accountId"    type="text" name="account"/>
             姓名：<input   id="userNameId"     type="text" name="userName"/>
           <input type="submit" value="查询"   onclick="searchEmployees()">
           <input  type="submit" value="重置查询"   onclick="reflushEmployeeSearch()">
</div>
</form>
<div >
      <div id="toolbar">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newEmployee()">新增</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editEmployee()">修改</a>
     	<a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" plain="true" onclick="startEmployee()">启用</a>
         <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-no" plain="true" onclick="endEmployee()">停用</a>
    </div>
   <div  id="employeeListInner" class="easyui-datagrid"></div>
        <div id="dlg_employee" class="easyui-dialog" style="width:500px;height:300px;padding:20px 40px"
            closed="true" buttons="#dlg-buttons">
        <div class="ftitle">员工信息</div>
        <form id="fm_employee" method="post"  novalidate>
       <div class="fitem">
                <label>账号:</label>
                <input name="number" class="easyui-validatebox" required="true">
            </div>
           <div class="fitem">
                <label>性别:</label>
               <input type="radio" name="sex" value="true" checked="checked">男
             <input type="radio" name="sex" value="false">女<br><br>
            </div>
            <div class="fitem">
                <label>坐席用户:</label>
                <input name="ccLogin" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>坐席号:</label>
                <input name="ccPhone" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>附加机构:</label>
                <input name="attachOrgId" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>初始密码:</label>
                <input name="password" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>联系方式:</label>
                <input name="contactMode" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>坐席密码:</label>
                <input name="ccPwd" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>所属机构:</label>
                          <select name="orgId">
                 <!--
                      如果没有设置value属性值，提交的是option中的文本值
                      如果设置了value属性值，提交的就是value属性值
                  -->
						       <c:forEach  items="${sysList }"  var="sys">
						       <option value="${sys.id}">${sys.name }</option>
						       </c:forEach>
                 <!-- 通过selected="selected"设置默认被选中 -->
             </select>
            </div>
            <div class="fitem">
                <label>姓名:</label>
                <input name="userName" class="easyui-validatebox" required="true">
            </div>
           <div class="fitem">
                <label>服务地址:</label>
                <input name="ccServer" class="easyui-validatebox" required="true">
            </div>
             <div class="fitem">
                            <label>岗位:</label>
                     <select name="positionId">
                 <!--
                      如果没有设置value属性值，提交的是option中的文本值
                      如果设置了value属性值，提交的就是value属性值
                  -->
                 <c:forEach  items="${poList }" var="position">
                 <option value="${position.id }">position.name</option>
                 </c:forEach>
                 <!-- 通过selected="selected"设置默认被选中 -->
             </select>
            </div>
            <div class="fitem">
                <label>委托方:</label>
                <input name="attachEntrustId" class="easyui-validatebox" required="true">
            </div>
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveEmployee()">提交</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg_employee').dialog('close')">取消</a>
    </div>
     <div id="dlg_udpate_employee" class="easyui-dialog" style="width:500px;height:300px;padding:20px 40px"
            closed="true" buttons="#dlg-update_buttons">
        <div class="ftitle">员工信息</div>
        <form id="fm_udpate_employee" method="post"  novalidate>
           <input type=“hidden”  id="up_id"  name="id" >
            <div class="fitem">
                <label>账号:</label>
                <input  id="numberId"  name="number" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>性别:</label>
               <input  id="sexId"   type="radio" name="sex" value="true" checked="checked">男
             <input type="radio" name="sex" value="false">女<br><br>
            </div>
            <div class="fitem">
                <label>坐席用户:</label>
                <input id="ccLoginId"   name="ccLogin"   class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>坐席号:</label>
                <input  id="ccPhoneId"  name="ccPhone" class="easyui-validatebox" required="true">
            </div>
           <div class="fitem">
                <label>附加机构:</label>
                <input  id="attachOrgIdId"  name="attachOrgId" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>初始密码:</label>
                <input  id="passwordId"  name="password" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>联系方式:</label>
                <input  id="contactModeId"  name="contactMode" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>坐席密码:</label>
                <input id="ccPwdId"   name="ccPwd" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>所属机构:</label>
                     <select name="orgId"  id="orgIdId" >
                  <!--
                      如果没有设置value属性值，提交的是option中的文本值
                      如果设置了value属性值，提交的就是value属性值
                  -->
						       <c:forEach  items="${sysList }"  var="sys">
						                  <option value="${sys.id}">${sys.name }</option>
						       </c:forEach>
                 <!-- 通过selected="selected"设置默认被选中 -->
             </select>
            </div>
           <div class="fitem">
                <label>姓名:</label>
                <input  id="userNameId"  name="userName" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>服务地址:</label>
                <input  id="ccServerId"  name="ccServer" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>岗位:</label>
                          <select  id="positionIdId"  name="positionId">
                 <!--
                      如果没有设置value属性值，提交的是option中的文本值
                      如果设置了value属性值，提交的就是value属性值
                  -->
                 <c:forEach  items="${poList }" var="position">
                 <option value="${position.id }">position.name</option>
                 </c:forEach>
                 <!-- 通过selected="selected"设置默认被选中 -->
             </select>
            </div>
            <div class="fitem">
                <label>委托方:</label>
                <input id="attachEntrustIdId"   name="attachEntrustId" class="easyui-validatebox" required="true">
            </div>
        </form>
    </div>
        <div id="dlg-update_buttons">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" onclick="updateEmployee()">提交</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg_udpate_employee').dialog('close')">取消</a>
    </div>
	<script type="text/javascript">
	$(function(){
	    $('#employeeListInner').datagrid({    
		    url:'get_Employee.do',
		    pagination:true, //如果为true，则在DataGrid控件底部显示分页工具栏
		    pageSize:5,    //在设置分页属性的时候初始化页面大小        
			pageList:[5,10,15],//在设置分页属性的时候 初始化页面大小选择列表
			loadFilter:pagerFilter,
			columns:[[    
		    	{field:'id',title:'id',width:100},    
		        {field:'employeeStatus',title:'员工状态',width:100},    
		        {field:'number',title:'账号',width:100},    
		        {field:'userName',title:'姓名',width:100},   
		        {field:'sex',title:'性别',width:100},  
		        {field:'joinTime',title:'入职时间',width:100},  
		        {field:'positionId',title:'岗位',width:100},  
		        {field:'orgId',title:'机构',width:100},  
		        {field:'createTime',title:'创建时间',width:100},  
		        {field:'modifyTime',title:'修改时间',width:100,
		        	formatter:function(value,row,index){
		        		var d = new Date(value);
		        		var str = d.toLocaleString();//js日期格式化
		        		return str;
		        	}}
		        		    ]]    
		});

	});
	function searchEmployees(){
		  var employeeStatusId=$("#employeeStatusIdId").val();
		  var orgSearchId=$("#orgSearchIdId").val();
		  var account=$("#accountId").val();
		  var userName=$("#userNameId").val();

		  if (account==""&&userName=="") {
			  $('#employeeListInner').datagrid({    
				    url:'get_Employee.do',
				    pagination:true, //如果为true，则在DataGrid控件底部显示分页工具栏
				    pageSize:5,    //在设置分页属性的时候初始化页面大小        
					pageList:[5,10,15],//在设置分页属性的时候 初始化页面大小选择列表
					loadFilter:pagerFilter,
					columns:[[    
				    	{field:'id',title:'id',width:100},    
				        {field:'employeeStatus',title:'员工状态',width:100},    
				        {field:'number',title:'账号',width:100},    
				        {field:'userName',title:'姓名',width:100},   
				        {field:'sex',title:'性别',width:100},  
				        {field:'joinTime',title:'入职时间',width:100},  
				        {field:'positionId',title:'岗位',width:100},  
				        {field:'orgId',title:'机构',width:100},  
				        {field:'createTime',title:'创建时间',width:100},  
				        {field:'modifyTime',title:'修改时间',width:100,
				        	formatter:function(value,row,index){
				        		var d = new Date(value);
				        		var str = d.toLocaleString();//js日期格式化
				        		return str;
				        	}}
				        		    ]]    
				});
		}
		  
	  // $('#employeeListInner').datagrid('loadData',{total:0,rows:[]});
	   
		    $('#employeeListInner').datagrid({    
			    url:'get_SearchEmployee.do',
			    queryParams: {
			    	employeeStatusId: employeeStatusId,
			    	orgSearchId: orgSearchId,
			    	account:account,
			    	userName:userName
				},
			    columns:[[    
			    	{field:'id',title:'id',width:100},    
			        {field:'employeeStatus',title:'员工状态',width:100},    
			        {field:'number',title:'账号',width:100},    
			        {field:'userName',title:'姓名',width:100},   
			        {field:'sex',title:'性别',width:100},  
			        {field:'joinTime',title:'入职时间',width:100},  
			        {field:'positionId',title:'岗位',width:100},  
			        {field:'orgId',title:'机构',width:100},  
			        {field:'createTime',title:'创建时间',width:100},  
			        {field:'modifyTime',title:'修改时间',width:100}
			        		    ]]    
			});

	}
	
    function newEmployee(){
        $('#dlg_employee').dialog('open').dialog('setTitle','新增');
        $('#fm_employee').form('clear');
    }
    function editEmployee(){
      var row = $('#employeeListInner').datagrid('getSelected');
      alert(row);
      if (row){
    	var id=row.id;
    	  $.post("get_Employee_by_id.do",{id:id},function(json){
    		$("#up_id").val(json.id); 
         	$("#numberId").val(json.number);   
         	$("#sexId").val(json.sex);   
         	$("#ccLoginId").val(json.ccLogin);   
         	$("#ccPhoneId").val(json.ccPhone);   
         	$("#attachOrgIdId").val(json.attachOrgId);   
         	$("#passwordId").val(json.password);   
         	$("#contactModeId").val(json.contactMode);   
         	$("#ccPwdId").val(json.ccPwd);   
         	$("#orgIdId").val(json.orgId);   
         	$("#userNameId").val(json.userName);   
         	$("#ccServerId").val(json.ccServer);   
         	$("#positionIdId").val(json.positionId);   
         	$("#attachEntrustIdId").val(json.attachEntrustId);   
         	select_attachOrg();
        	select_positionId();
    	  });
    	  $('#dlg_udpate_employee').dialog('open').dialog('setTitle','更新');
         }
    }
    
	function select_positionId(){
		
	    var positionIdId=	$("#positionIdId").val();
    	         $.post("select_positionIdId.do",{positionIdId:positionIdId},function(data){
    		
    		$("#positionIdId").val(data.name);
    	});
		
	}
    function select_attachOrg(){
    var attachOrgIdId=	$("#attachOrgIdId").val();
    	$.post("select_attachOrg.do",{attachOrgIdId:attachOrgIdId},function(data){
    		
    		$("#attachOrgIdId").val(data.name);
    	});
    }
    
    function updateEmployee(){
   $("#fm_udpate_employee").form("submit",{
	   url:"update_Employee.do",
   });	
   $('#employeeListInner').datagrid('reload');  
    }
    
    function saveEmployee(){
        $('#fm_employee').form('submit',{
            url: "add_Employee.do",
            onSubmit: function(){
                return $(this).form('validate');
            },
            success: function(result){
                    $('#dlg_employee').dialog('close');        // close the dialog
                    $('#employeeListInner').datagrid('reload');    // reload the user data
                    reflush();
            }
        });
    }
    function endEmployee(){
        var row = $('#employeeListInner').datagrid('getSelected');
        alert(row.id);
        if (row){
            $.messager.confirm('确认','您确定要停用该员工吗？',function(r){
                if (r){
                    $.post('end_employee.do',{id:row.id},function(result){
                        if (result.success){
                            $.messager.show({    // show error message
                                    title: '提示',
                                    msg: result.message
                                });
                            $('#employeeListInner').datagrid('reload');    // reload the user data
                            
                            reflush();
                        } else {
                            $.messager.show({    // show error message
                                title: '提示',
                                msg: result.message
                            });
                        }
                    },'json');
                }
            });
        }
    }
    
    function startEmployee(){
        var row = $('#employeeListInner').datagrid('getSelected');
        alert(row.id);
        if (row){
            $.messager.confirm('确认','您确定要启用该员工吗？',function(r){
                if (r){
                    $.post('start_employee.do',{id:row.id},function(result){
                        if (result.success){
                            $.messager.show({    // show error message
                                    title: '提示',
                                    msg: result.message
                                });
                            $('#employeeListInner').datagrid('reload');    // reload the user data
                            
                            reflush();
                        } else {
                            $.messager.show({    // show error message
                                title: '提示',
                                msg: result.message
                            });
                        }
                    },'json');
                }
            });
        }
    }
    
   function reflush(){
	   
	   window.location.href="index.do";
	   
   }
   
   function reflushEmployeeSearch(){
		  $("#accountId").val("");
		  $("#userNameId").val("");
   }   
   
	function pagerFilter(data){
        if (typeof data.length == 'number' && typeof data.splice == 'function'){    // 判断数据是否是数组
            data = {
                total: data.length,
                rows: data
            }
        }
        var dg = $(this);
        var opts = dg.datagrid('options');
        var pager = dg.datagrid('getPager');
        pager.pagination({
            onSelectPage:function(pageNum, pageSize){
                opts.pageNumber = pageNum;
                opts.pageSize = pageSize;
                pager.pagination('refresh',{
                    pageNumber:pageNum,
                    pageSize:pageSize
                });
                dg.datagrid('loadData',data);
            }
        });
        if (!data.originalRows){
            data.originalRows = (data.rows);
        }
        var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
        var end = start + parseInt(opts.pageSize);
        data.rows = (data.originalRows.slice(start, end));
        return data;
    }
   
</script>
</body>
</html>