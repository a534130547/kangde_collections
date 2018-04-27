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
<form action="javascript:;"  id="searchBatchFormId">
<div>
             批次号：<input id="batchCodeId"    name="batchCode"   type="text" />
            案件类型：<input   id="typeIdId"    name="typeId"     type="text" />
            委托方：  <input   id="entrustIdId"     name="entrustId"   type="text" />
            委案日期： <input id="beginDateId"   name="beginDate"     type="text" class="easyui-datebox" >
             至：<input id="endDateId"    name="endDate"    type="text" class="easyui-datebox">
           <input type="submit" value="查询"   onclick="searchCaseBatch()">
           <input  type="submit" value="重置查询"   onclick="reflushCaseBatchSearch()">
</div>
</form>
<div >
      <div id="toolbar">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newBatch()">新增</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editBatch()">修改</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removeBatch()">删除</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick="deriveBatch()">导出批次</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="refreshBatch()">更新批次</a>
    </div>
   <div  id="CashBatchListInner" class="easyui-datagrid"></div>
        <div id="dlg_batch" class="easyui-dialog" style="width:500px;height:300px;padding:20px 40px"
            closed="true" buttons="#dlg-buttons">
        <div class="ftitle">添加批次</div>
        <form id="fm_batch" method="post"  enctype="multipart/form-data"   action="add_caseBatch.do" novalidate>
              <div class="fitem">
                <label>案件类型:</label>
                <input name="typeId" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>委案日期：</label>
                <input  name="beginDate" class="easyui-datebox" >
            </div>
                 <div class="fitem">
                <label>退案日期:</label>
                <input  name="endDate" class="easyui-datebox">
            </div>
                <div class="fitem">
                <label>导入文件:</label>
               <input id="excelId" type="file" name="files" />
            </div>
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveBatch()">提交</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg_batch').dialog('close')">取消</a>
    </div>
     <div id="dlg_udpate_entrust" class="easyui-dialog" style="width:500px;height:300px;padding:20px 40px"
            closed="true" buttons="#dlg-update_buttons" >
        <div class="ftitle">委托方信息</div>
        <form id="fm_udpate_entrust" method="post"  novalidate>
                   <div class="fitem">
                <label>委托方id:</label>
                <input id="up_id"  name="id" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>委托方名称:</label>
                <input id="nameId"  name="name" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>委托方简码:</label>
                <input  id="codeId"  name="code" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>产品名称:</label>
                <input  id="productNameId"  name="productName" class="easyui-validatebox" required="true">
            </div>
                       <div class="fitem">
                <label>产品名称类型:</label>
                <input id="caseTypeIdId"   name="caseTypeId" class="easyui-validatebox" required="true">
            </div>
                   <div class="fitem">
                <label>委托方联系地址:</label>
                <input id="addressId"   name="address" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>委托方客务热线:</label>
                <input  id="serviceHotlineId"  name="serviceHotline" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>'委托方对接人:</label>
                <input id="abutmentPersonId"   name="abutmentPerson" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>对接邮箱:</label>
                <input  id="abutmentEmailId"  name="abutmentEmail" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>对接电话/传真:</label>
                <input id="abutmentPhoneId"   name="abutmentPhone" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>委案频率 1周 2月 3季:</label>
                <input  id="caseFrequencyId"  name="caseFrequency" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>有效还款期段:</label>
                <input  id="effecRepayPeriodId"  name="effecRepayPeriod" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>催收名义:</label>
                <input id="collecNominalId"   name="collecNominal" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>留案要求:</label>
                <input  id="stayRequireId"  name="stayRequire" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>退案要求:</label>
                <input  id="backRequireId"  name="backRequire" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>报告周期 1周 2月 3季:</label>
                <input  id="reportPeriodId"  name="reportPeriod" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>结算周期 1周 2月 3季:</label>
                <input  id="settlementPeriodId"  name="settlementPeriod" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>还款方式:</label>
                <input id="repaymentMethodId"   name="repaymentMethod" class="easyui-validatebox" required="true">
            </div>
              <div class="fitem">
                <label>折扣减免:</label>
                <input  id="discountReductionId"   name="discountReduction" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>分期还款要求:</label>
                <input  id="periodRepaymentRequireId"  name="periodRepaymentRequire" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>如何销卡/销户:</label>
                <input id="cancelAccountId"   name="cancelAccount" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>源资取调要求:</label>
                <input  id="resourceRetrieveRequireId"  name="resourceRetrieveRequire" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>催记提交要求:</label>
                <input id="collecSubmitRequireId"   name="collecSubmitRequire" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>投诉处理要求:</label>
                <input id="complaintHandleRequireId"   name="complaintHandleRequire" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>录音提交要求:</label>
                <input id="tapeSubmitRequireId"   name="tapeSubmitRequire" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>资料销毁要求:</label>
                <input  id="dataDestrucRequireId"  name="dataDestrucRequire" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>'信函回收要求':</label>
                <input  id="letterRecoveryRequireId"  name="letterRecoveryRequire" class="easyui-validatebox" required="true">
            </div>
                  <div class="fitem">
                <label>报告/报表要求:</label>
                <input  id="reportRequireId"  name="reportRequire" class="easyui-validatebox" required="true">
            </div>
                         <div class="fitem">
                <label>客户特别指示:</label>
                <input  id="cusSpecialInstrucId"  name="cusSpecialInstruc" class="easyui-validatebox" required="true">
            </div>
                         <div class="fitem">
                <label>启用/停用:</label>
                <input  id="stateId"  name="state" class="easyui-validatebox" required="true">
            </div>
                         <div class="fitem">
                <label>合同名称:</label>
                <input  id="contractNameId"  name="contractName" class="easyui-validatebox" required="true">
            </div>
                         <div class="fitem">
                <label>'备注:</label>
                <input id="remarkId"   name="remark" class="easyui-validatebox" required="true">
            </div>
                         <div class="fitem">
                <label>创建人ID:</label>
                <input id="createEmpIdId"   name="createEmpId" class="easyui-validatebox" required="true">
            </div>
                         <div class="fitem">
                <label>创建人名称:</label>
                <input  id="createEmpNameId"  name="createEmpName" class="easyui-validatebox" required="true">
            </div>
        </form>
    </div>
        <div id="dlg-update_buttons">
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-ok" onclick="updateBatch()">提交</a>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg_udpate_entrust').dialog('close')">取消</a>
    </div>
	<script type="text/javascript">
	$(function(){
		$('#CashBatchListInner').datagrid({    
		    url:'get_CaseBatch.do',
		    pagination:true, //如果为true，则在DataGrid控件底部显示分页工具栏
		    pageSize:5,    //在设置分页属性的时候初始化页面大小        
			pageList:[5,10,15],//在设置分页属性的时候 初始化页面大小选择列表
			loadFilter:pagerFilter,
		    columns:[[    
		    	{field:'id',title:'',width:100},    
		        {field:'batchCode',title:'批次号',width:100},    
		        {field:'entrustId',title:'委托方',width:100},    
		        {field:'achieve',title:'业绩率',width:100},    
		        {field:'totalNumber',title:'总户数',width:100},   
		        {field:'totalMoney',title:'总金额',width:100},   
		        {field:'typeId',title:'案件类型',width:100},   
		    	{field:'beginDate',title:'委案开始日期',width:100,
		        	formatter:function(value,row,index){
	        		var d = new Date(value);
	        		var str = d.toLocaleString();//js日期格式化
	        		return str;
	        	}},   
		    	{field:'endDate',title:'委案截止日期',width:100,
		        	formatter:function(value,row,index){
		        		var d = new Date(value);
		        		var str = d.toLocaleString();//js日期格式化
		        		return str;
		        	}}
		        		    ]]    
		});
	});
	   function reflushCaseBatchSearch(){
		   $("#batchCodeId").val("");
		   $("#typeIdId").val("");
		   $("#entrustIdId").val("");
		   $("#beginDateId").datebox("setValue","");
		  $("#endDateId").datebox("setValue","");
	   }  
	   
	  function searchCaseBatch(){
		  var batchCode=$("#batchCodeId").val();
		  var typeId=$("#typeIdId").val();
		  var entrustId=$("#entrustIdId").val();
		  var beginDate=$("#beginDateId").datebox("getValue");
		  var endDate=$("#endDateId").datebox("getValue");
		  
		  $.post("get_SearchcaseBatch.do",{batchCode:batchCode,typeId:typeId,entrustId:entrustId,beginDate:beginDate,endDate:endDate},function(result){
			  $('#CashBatchListInner').datagrid('load',result);
		  })
// 			$('#CashBatchListInner').datagrid({    
// 			    url:'get_SearchcaseBatch.do',
// 			   pagination:true, //如果为true，则在DataGrid控件底部显示分页工具栏
// 			   pageSize:5,    //在设置分页属性的时候初始化页面大小        
// 				pageList:[5,10,15],//在设置分页属性的时候 初始化页面大小选择列表
// 				loadFilter:pagerFilter,
// 			    queryParams: {
// 			    	batchCode: batchCode,
// 			    	typeId: typeId,
// 			    	entrustId:entrustId,
// 			    	beginDate:beginDate,
// 			    	endDate:endDate
// 				},
// 			    columns:[[    
// 			    	{field:'id',title:'',width:100},    
// 			        {field:'batchCode',title:'批次号',width:100},    
// 			        {field:'entrustId',title:'委托方',width:100},    
// 			        {field:'achieve',title:'业绩率',width:100},    
// 			        {field:'totalNumber',title:'总户数',width:100},   
// 			        {field:'totalMoney',title:'总金额',width:100},   
// 			        {field:'typeId',title:'案件类型',width:100},   
// 			    	{field:'beginDate',title:'委案开始日期',width:100,
// 			        	formatter:function(value,row,index){
// 		        		var d = new Date(value);
// 		        		var str = d.toLocaleString();//js日期格式化
// 		        		return str;
// 		        	}},   
// 			    	{field:'endDate',title:'委案截止日期',width:100,
// 			        	formatter:function(value,row,index){
// 			        		var d = new Date(value);
// 			        		var str = d.toLocaleString();//js日期格式化
// 			        		return str;
// 			        	}}
// 			        		    ]]  
// 			});
		
	}
	  
    function newBatch(){
        $('#dlg_batch').dialog('open').dialog('setTitle','新增');
        $('#fm_batch').form('clear');
    }
    
    function editEntrust(){
      var row = $('#EntrustListInner').datagrid('getSelected');
      if (row){
    	var id=row.id;
    	  $.post("get_Entrust_by_id.do",{id:id},function(json){
    	    $("#up_id").val(json.id); 
         	$("#nameId").val(json.name);   
			$("#codeId").val(json.code);   
			$("#productNameId").val(json.productName);   
			$("#caseTypeIdId").val(json.caseTypeId);   
			$("#descriptionId").val(json.description);   
			$("#cooperateDateId").val(json.cooperateDate);  
			$("#addressId").val(json.address);  
			$("#serviceHotlineId").val(json.serviceHotline);  
			$("#abutmentPersonId").val(json.abutmentPerson);  
			$("#abutmentEmailId").val(json.abutmentEmail);  
			$("#abutmentPhoneId").val(json.abutmentPhone);  
			$("#caseFrequencyId").val(json.caseFrequency);  
			$("#effecRepayPeriodId").val(json.effecRepayPeriod);  
			$("#collecNominalId").val(json.collecNominal);  
			$("#collecTermId").val(json.collecTerm);  
			$("#stayRequireId").val(json.stayRequire);  
			$("#backRequireId").val(json.backRequire);  
			$("#reportPeriodId").val(json.reportPeriod);  
			$("#settlementPeriodId").val(json.settlementPeriod);  
			$("#repaymentMethodId").val(json.repaymentMethod);  
			$("#discountReductionId").val(json.discountReduction);  
			$("#periodRepaymentRequireId").val(json.periodRepaymentRequire);  
			$("#cancelAccountId").val(json.cancelAccount);  
			$("#resourceRetrieveRequireId").val(json.resourceRetrieveRequire);  
			$("#collecSubmitRequireId").val(json.collecSubmitRequire);  
			$("#complaintHandleRequireId").val(json.complaintHandleRequire);  
			$("#tapeSubmitRequireId").val(json.tapeSubmitRequire);  
			$("#dataDestrucRequireId").val(json.dataDestrucRequire);  
			$("#letterRecoveryRequireId").val(json.letterRecoveryRequire);  
			$("#reportRequireId").val(json.reportRequire);  
			$("#cusSpecialInstrucId").val(json.cusSpecialInstruc);  
			$("#stateId").val(json.state);  
			$("#modifyTimeId").val(json.modifyTime);  
			$("#contractNameId").val(json.contractName);  
			$("#remarkId").val(json.remark);  
			$("#createEmpIdId").val(json.createEmpId);  
			$("#createEmpNameId").val(json.createEmpName);  
			$("#createTimeId").val(json.createTime)
    	  });
    	  $('#dlg_udpate_entrust').dialog('open').dialog('setTitle','更新');
         }
    }
    
    function updateEntrust(){
    	
   $("#fm_udpate_entrust").form("submit",{
	   url:"update_Entrust.do"
   });	

   $('#EntrustListInner').datagrid('reload');  
    }
    
    function saveBatch(){
        $('#fm_batch').form('submit',{
            url: "add_caseBatch.do",
            onSubmit: function(){
                return $(this).form('validate');
            },
            success: function(result){
                    $('#dlg_batch').dialog('close');        // close the dialog
                    $('#CashBatchListInner').datagrid('reload');    // reload the user data
                    reflush();
            }
        });
    }
    function removeEntrust(){
        var row = $('#EntrustListInner').datagrid('getSelected');
        alert(row.id);
        if (row){
            $.messager.confirm('确认','您确定要删除该委托人吗？',function(r){
                if (r){
                    $.post('delete_Entrust.do',{id:row.id},function(result){
                        if (result.success){
                            $.messager.show({    // show error message
                                    title: '提示',
                                    msg: result.message
                                });
                            $('#EntrustListInner').datagrid('reload');    // reload the user data
                            
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
    
    function endEntrust(){
        var row = $('#EntrustListInner').datagrid('getSelected');
        alert(row.id);
        if (row){
            $.messager.confirm('确认','您确定要停用该委托人吗？',function(r){
                if (r){
                    $.post('end_entrust.do',{id:row.id},function(result){
                        if (result.success){
                            $.messager.show({    // show error message
                                    title: '提示',
                                    msg: result.message
                                });
                            $('#EntrustListInner').datagrid('reload');    // reload the user data
                            
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
    
    function startEntrust(){
        var row = $('#EntrustListInner').datagrid('getSelected');
        alert(row.id);
        if (row){
            $.messager.confirm('确认','您确定要启用该委托人吗？',function(r){
                if (r){
                    $.post('start_entrust.do',{id:row.id},function(result){
                        if (result.success){
                            $.messager.show({    // show error message
                                    title: '提示',
                                    msg: result.message
                                });
                            $('#EntrustListInner').datagrid('reload');    // reload the user data
                            
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