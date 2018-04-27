<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <script type="text/javascript" src="easyui/jquery-1.8.2.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>

  </head>
  
  <script type="text/javascript">
          var url;
        function newUser(){
            $('#dlg').dialog('open').dialog('setTitle','新增');
            $('#fm').form('clear');
            url = 'UserServlet?f=add';
        }
        function editUser(){
            var row = $('#mTb').datagrid('getSelected');
            if (row){
                $('#dlg').dialog('open').dialog('setTitle','修改');
                $('#fm').form('load',row);
                url = 'UserServlet?f=update&id=' + row.id;
            }
        }
        function saveUser(){
            $('#fm').form('submit',{
                url: url,
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
                        $('#mTb').datagrid('reload');    // reload the user data
                    } else {
                        $.messager.show({
                            title: '提示',
                            msg: result.message
                        });
                    }
                }
            });
        }
        function removeUser(){
            var row = $('#mTb').datagrid('getSelected');
            if (row){
                $.messager.confirm('确认','您确定要删除吗？',function(r){
                    if (r){
                        $.post('UserServlet?f=delete',{id:row.id},function(result){
                            if (result.success){
                                $.messager.show({    // show error message
                                        title: '提示',
                                        msg: result.message
                                    });
                                $('#mTb').datagrid('reload');    // reload the user data
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
        function doSearch(){
            $('#mTb').datagrid('load',{
                name: $('#username').val(),
                xueli: $('#userxueli').val()
            });
        }
  </script>
  
  <body>
      <table id="mTb" 
          class="easyui-datagrid" width="100%" 
          url="UserServlet?f=query"
          toolbar="#toolbar" pagination="true"
        rownumbers="true" fitColumns="true" singleSelect="true"
        pageSize="5"        
        pageList="[3,5,8,10]">
        <thead>
            <tr>
                <th field="id" width="50" data-options="hidden: true">编号</th>
                <th field="name" width="50">姓名</th>
                <th field="pass" width="50">密码</th>
                <th field="sex" width="50">性别</th>
                <th field="age" width="50">年龄</th>
                <th field="xueli" width="50">学历</th>
                <th field="address" width="50">地址</th>
            </tr>
        </thead>
      </table>
      
      <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">修改</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removeUser()">删除</a>
    </div>
    
    <div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
            closed="true" buttons="#dlg-buttons">
        <div class="ftitle">用户信息</div>
        <form id="fm" method="post" novalidate>
            <div class="fitem">
                <label>姓名:</label>
                <input name="name" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>密码:</label>
                <input name="pass" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>性别:</label>
                <input name="sex" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>年龄:</label>
                <input name="age" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>学历:</label>
                <input name="xueli" class="easyui-validatebox" required="true">
            </div>
            <div class="fitem">
                <label>地址:</label>
                <input name="address" class="easyui-validatebox" required="true">
            </div>
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">提交</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">取消</a>
    </div>
      
  </body>
</html>