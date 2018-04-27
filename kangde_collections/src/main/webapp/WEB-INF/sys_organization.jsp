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
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newSysOrganization()">新增</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editSysOrganization()">修改</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removeSysOrganization()">删除</a>
                <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removeSysOrganizationBatch()">批量删除</a>
    </div>
   <div  id="sysOrganizationListInner" class="easyui-treegrid"></div>
        <div id="dlg" class="easyui-dialog" style="width:500px;height:300px;padding:20px 40px"
            closed="true" buttons="#dlg-buttons">
        <div class="ftitle">组织机构信息</div>
        <form id="fm" method="post"  novalidate>
            <div class="fitem">
                <label>上级机构:</label>
           <input name="parentId" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>机构类型:</label>
                <input name="type" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>负责人id:</label>
                <input name="principalId" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>机构名称:</label>
                <input name="name" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>地                         址:</label>
                <input name="address" class="easyui-validatebox" required="true">
            </div>
                <div class="fitem">
                <label>手机号码:</label>
                <input name="phone" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>邮政编码:</label>
                <input name="postCode" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>传 真 号:   </label>
                <input name="fax" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>排                         序:       </label>
                <input name="orderNo" class="easyui-validatebox" required="true">
            </div>
        </form>
    </div>
    </form>
    <div id="dlg-buttons">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveSysOrganization()">提交</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">取消</a>
    </div>
     <div id="dlg_udpate" class="easyui-dialog" style="width:500px;height:300px;padding:20px 40px"
            closed="true" buttons="#dlg-update_buttons" >
        <div class="ftitle">组织机构信息</div>
        <form id="fm_udpate" method="post"  novalidate>
           <input type=“hidden”  id="up_id"  name="id" >
            <div class="fitem">
                <label  >上级机构:</label>
                <input  id=parid name="parentId" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label >机构类型:</label>
                <input  id="tyid" name="type" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>负责人id:</label>
                <input  id="prinId"  name="principalId" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>机构名称:</label>
                <input id="nameId"  name="name" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>地址:</label>
                <input  id="add" name="address" class="easyui-validatebox" required="true">
            </div>
                 <div class="fitem">
                <label>手机号码:</label>
                <input  id="phoneId" name="phone" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>邮政编码:</label>
                <input  id="pcId" name="postCode" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>传真号:</label>
                <input  id="faxId" name="fax" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>排序:</label>
                <input id="orId" name="orderNo" class="easyui-validatebox" required="true">
            </div>
        </form>
    </div>
        <div id="dlg-update_buttons">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" onclick="updateSysOrganization()">提交</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg_udpate').dialog('close')">取消</a>
    </div>
	<script type="text/javascript">
	$(function(){
		$('#sysOrganizationListInner').treegrid({    
		    url:'get_SysOrganization.do',
		    idField:'id',    
		    treeField:'name',
		    loadFilter:pagerFilter1,	//返回过滤后的数据进行展示
			pagination:true, //如果为true，则在DataGrid控件底部显示分页工具栏
			pageSize:4,    //在设置分页属性的时候初始化页面大小        
			pageList:[4,8,12],//在设置分页属性的时候 初始化页面大小选择列表
		    columns:[[    
		          {field:'id',title:'用户id', width:100,
		            			formatter: function(value,row,index){
		            				var d = '<input type="checkbox"   value='+row.id+'   class="checkbox"  onclick=clickFunction() />';
		            				return d;
		            			}},
		        {field:'type',title:'机构类型',width:100},    
		        {field:'principalId',title:'负责人id',width:100},  
		        {field:'parentId',title:'Pid',width:100}, 
		        {field:'name',title:'机构名称',width:100},   
		        {field:'address',title:'地址',width:100},    
		        {field:'phone',title:'手机号码',width:100},   
		        {field:'postCode',title:'邮政编码',width:100},   
		        {field:'fax',title:'传真号',width:100},   
		        {field:'orderNo',title:'排序',width:100}
		       ]]    
		});
	});
	
    function newSysOrganization(){
        $('#dlg').dialog('open').dialog('setTitle','新增');
        $('#fm').form('clear');
    }
    
    function editSysOrganization(){
      var row = $('#sysOrganizationListInner').treegrid('getSelected');
      if (row){
    	var id=row.id;
    	  $.post("get_SysOrganization_by_id.do",{id:id},function(json){
    		 $("#up_id").val(json.id); 
         	$("#tyid").val(json.type);   
			$("#prinId").val(json.principalId);   
			$("#nameId").val(json.name);   
			$("#add").val(json.address);   
			$("#phoneId").val(json.phone);   
			$("#pcId").val(json.postCode);   
			$("#faxId").val(json.fax);   
			$("#orId").val(json.orderNo);   
	        $("#parid").val(json.parentId);    	
    	  });
    	  $('#dlg_udpate').dialog('open').dialog('setTitle','更新');
         }
    }
    
    function updateSysOrganization(){
    	
   $("#fm_udpate").form("submit",{
	   url:"update_SysOrganization.do",
   });	
   reflush();
    }
    
    function saveSysOrganization(){
        $('#fm').form('submit',{
            url: "add_SysOrganization.do",
            onSubmit: function(){
                return $(this).form('validate');
            },
            success: function(result){
                var result = eval('('+result+')');
                if (result.success){
                    $.messager.show({
                        title: '提示',
                        msg: result.message
                    });
                    $('#dlg').dialog('close');        // close the dialog
                    $('#sysOrganizationListInner').treegrid('reload');    // reload the user data
                    reflush();
                } else {
                    $.messager.show({
                        title: '提示',
                        msg: result.message
                    });
                }
            }
        });
    }
    
    function clickFunction(){
    	
// alert($(":checked").val());
    	
    }
    
    function removeSysOrganizationBatch(){
    	var list=$(":checked");
    	var bs="";
    	$.each( list, function(i, n){
    		  bs=n.value+"_"+bs;
    		});
    	 $.post('delete_SysOrganizationBatch.do',{ds:bs},function(data){
    		 if(data){
    			 $('#sysOrganizationListInner').treegrid('reload'); 
    		 }
    	 })
    };
    
    function removeSysOrganization(){
        var row = $('#sysOrganizationListInner').treegrid('getSelected');
        alert(row.id);
        if (row){
            $.messager.confirm('确认','您确定要删除该机构吗？该机构的子机构也会删除',function(r){
                if (r){
                    $.post('delete_SysOrganization.do',{id:row.id},function(result){
                        if (result.success){
                            $.messager.show({    // show error message
                                    title: '提示',
                                    msg: result.message
                                });
                            $('#sysOrganizationListInner').treegrid('reload');    // reload the user data
                            
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
   
 //treegrid分页
	function pagerFilter1(data){
       if ($.isArray(data)){    // is array  
           data = {  
               total: data.length,  
               rows: data  
           }  
       }
       var dg = $(this);  
		var state = dg.data('treegrid');
       var opts = dg.treegrid('options');  
       var pager = dg.treegrid('getPager');  
       pager.pagination({  
           onSelectPage:function(pageNum, pageSize){  
               opts.pageNumber = pageNum;  
               opts.pageSize = pageSize;  
               pager.pagination('refresh',{  
                   pageNumber:pageNum,  
                   pageSize:pageSize  
               });  
               dg.treegrid('loadData',state.originalRows);  
           }  
       });  
       if (!state.originalRows){
       	state.originalRows = data.rows;
       }
       var topRows = [];
       var childRows = [];
       $.map(state.originalRows, function(row){
       	row._parentId ? childRows.push(row) : topRows.push(row);
       });
       data.total = topRows.length;
       var start = (opts.pageNumber-1)*parseInt(opts.pageSize);  
       var end = start + parseInt(opts.pageSize);  
		data.rows = $.extend(true,[],topRows.slice(start, end).concat(childRows));
		return data;
	}

	
	
	
   
</script>
</body>
</html>