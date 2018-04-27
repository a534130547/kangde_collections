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
<div >
      <div id="toolbar">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newSysPosition()">新增</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editSysPosition()">修改</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removeSysPosition()">删除</a>
    </div>
   <div  id="sysPositionListInner" class="easyui-datagrid"></div>
        <div id="dlg_position" class="easyui-dialog" style="width:500px;height:300px;padding:20px 40px"
            closed="true" buttons="#dlg-buttons">
        <div class="ftitle">职位信息</div>
        <form id="fm_position" method="post"  novalidate>
     
            <div class="fitem">
                <label>上级职位:</label>
                <input name="parentId" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>职位类型:</label>
                <input name="type" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>职位名称:</label>
                <input name="name" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>职位描述:</label>
                <input name="description" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>排序:</label>
                <input name="orderNo" class="easyui-validatebox" required="true">
            </div>
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveSysPosition()">提交</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg_position').dialog('close')">取消</a>
    </div>
     <div id="dlg_udpate_position" class="easyui-dialog" style="width:500px;height:300px;padding:20px 40px"
            closed="true" buttons="#dlg-update_buttons" >
        <div class="ftitle">职位信息</div>
        <form id="fm_udpate_position" method="post"  novalidate>
           <input type=“hidden”  id="up_id"  name="id" >
            <div class="fitem">
                <label  >上级职位:</label>
                <input id="parentId" name="parentId" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label >职位类型:</label>
                <input  id="tyid" name="type" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>职位名称:</label>
                <input  id="nameId"  name="principalId" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>职位描述:</label>
                <input id="descriptionId"  name="name" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>排序:</label>
                <input  id="orderNoId" name="address" class="easyui-validatebox" required="true">
            </div>
        </form>
    </div>
        <div id="dlg-update_buttons">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" onclick="updateSysPosition()">提交</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg_udpate_position').dialog('close')">取消</a>
    </div>
	<script type="text/javascript">
	$(function(){
		$('#sysPositionListInner').treegrid({    
		    url:'get_SysPosition.do',
		    idField:'id',    
		    treeField:'name',
		    columns:[[    
		    	{field:'id',title:'职位id',width:100},    
		        {field:'name',title:'职位名称',width:100},    
		        {field:'type',title:'职位类型',width:100},    
		        {field:'description',title:'职位描述',width:100},   
		        {field:'createTime',title:'创建时间',width:100},   
		        {field:'modifyTime',title:'修改时间',width:100}
		        		    ]]    
		});
	});
	
    function newSysPosition(){
        $('#dlg_position').dialog('open').dialog('setTitle','新增');
        $('#fm_position').form('clear');

    }
    
    function editSysPosition(){
      var row = $('#sysPositionListInner').treegrid('getSelected');
      if (row){
    	var id=row.id;
    	  $.post("get_SysPosition_by_id.do",{id:id},function(json){
    		  $("#up_id").val(json.id); 
    		    	 
         	$("#tyid").val(json.type);   
			$("#parentId").val(json.parentId);   
			$("#tyid").val(json.type);   
			$("#nameId").val(json.name);   
			$("#descriptionId").val(json.description);   
			$("#orderNoId").val(json.orderNo);  
    	  });
    	  $('#dlg_udpate_position').dialog('open').dialog('setTitle','更新');
         }
    }
    
    function updateSysPosition(){
    	
   $("#fm_udpate_position").form("submit",{
	   url:"update_SysPosition.do",
   });	

   $('#sysPositionListInner').treegrid('reload');  
    }
    
    
    function saveSysPosition(){
        $('#fm_position').form('submit',{
            url: "add_SysPosition.do",
            onSubmit: function(){
                return $(this).form('validate');
            },
            success: function(result){

      
                    $('#dlg_position').dialog('close');        // close the dialog
                    $('#sysPositionListInner').treegrid('reload');    // reload the user data
                    reflush();
      
            }
        });
    }
    function removeSysPosition(){
        var row = $('#sysPositionListInner').treegrid('getSelected');
        alert(row.id);
        if (row){
            $.messager.confirm('确认','您确定要删除该职位吗？该职位的子职位也会删除',function(r){
                if (r){
                    $.post('delete_SysPosition.do',{id:row.id},function(result){
                        if (result.success){
                            $.messager.show({    // show error message
                                    title: '提示',
                                    msg: result.message
                                });
                            $('#sysPositionListInner').treegrid('reload');    // reload the user data
                            
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
</script>
</body>
</html>