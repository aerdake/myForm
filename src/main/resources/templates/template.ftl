<!DOCTYPE html>
<html lang="zh" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="window-target" content="_top"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8;"/>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" >
    <meta name="apple-mobile-web-app-status-bar-style" content="black"/>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no, minimal-ui" />
    <title>主页</title>
    <meta http-equiv="description" content="">
    <meta name="keywords" content=""/>
    <link rel="stylesheet" type="text/css" th:href="@{/lib/layui-v2.5.4/layui/css/layui.css}"/>
    <link rel="stylesheet" type="text/css" th:href="@{/css/reset.css}"/>
    <link rel="stylesheet" type="text/css" th:href="@{/css/common.css}"/>
    <link rel="stylesheet" type="text/css" th:href="@{/css/image.css}"/>
    <link rel="stylesheet" type="text/css" th:href="@{/css/main.css}"/>
    <link rel="stylesheet" type="text/css" th:href="@{/css/index.css}"/>
    <style>
        .layui-laypage .layui-laypage-curr .layui-laypage-em{
            background-color: #1F7BBC;
        }
        .layui-laypage a:hover{
            color: #1F7BBC;
        }
        .layui-btn{
            background-color: #1F7BBC;
        }
        .layui-btn-primary{
            background-color: #fff;
        }
        .layui-form-item{
            display:inline-block;
        }
        .layui-form-label{
            font-size: initial;
            color: #666;
        }
        input {
            font-size: initial;
        }
        .layui-table-view{
            margin:10px 10px;
        }
        .search-collapse,.select-table {
            width: auto;
            margin-left: 10px;
            margin-right: 10px;
            background: #fff;
            border-radius: 6px;
            margin-top: 10px;
            padding-top: 10px;
            padding-bottom: 10px;
            box-shadow: 1px 1px 3px rgba(0,0,0,.2);
        }
    </style>
</head>
<body class="">
<!--机构搜索表单-->
<div class="search-collapse">
    <form class="layui-form" autocomplete="off" style="width: 90%; margin-top: inherit;">
        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">申请人</label>
            <div class="layui-input-block">
                <input type="text" name="employeeName" th:value="${r'${session.user.employeeName}'}" readonly="readonly" autocomplete="off" class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">申请人部门</label>
            <div class="layui-input-block">
                <input type="text" name="officeName" th:value="${r'${session.user.officeName}'}" readonly="readonly" autocomplete="off" class="layui-input" >
            </div>
        </div>
        <#list formField as field>
        <div class="layui-form-item" style="width: 200px">
            <label class="layui-form-label">假期类型
                <span style="color:red">*</span>
            </label>
            <div class="layui-input-block">
                <select name="leaveType" lay-verify="required">
                    <option value=""></option>
                    <option value="事假">事假</option>
                    <option value="病假">病假</option>
                    <option value="调休假">调休假</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">起始日期
                <span style="color:red">*</span>
            </label>
            <div class="layui-input-block">
                <input id="startDate" type="text" name="startDate" lay-verify="required" class="layui-input" readonly="readonly" >
            </div>
        </div>
        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">结束日期
                <span style="color:red">*</span>
            </label>
            <div class="layui-input-block">
                <input id="endDate" type="text" name="endDate" lay-verify="required" class="layui-input" readonly="readonly" >
            </div>
        </div>

        <#if field.fieldTag == "input" && field.fieldTag == "number">
            <div class="layui-form-item" style="width: 200px">
                <label class="layui-form-label">${field.label}
                    <#if field.isRequired=="1">
                    <span style="color:red">*</span>
                    </#if>
                </label>
                <div class="layui-input-block">
                    <input type="number" name="leaveDays" lay-verify="<#if field.isRequired=="1">required</#if>" class="layui-input" >
                </div>
            </div>
        </#if>
        <#if field.fieldTag == "textarea">
        <div class="layui-form-item" style="width: 600px">
            <label class="layui-form-label">${field.label}
                <#if field.isRequired=="1">
                    <span style="color:red">*</span>
                </#if>
            </label>
            <div class="layui-input-block">
                <textarea type="text" name="leaveCause" lay-verify="required" class="layui-textarea" ></textarea>
            </div>
        </div>
        </#if>


        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="leave_apply">确认申请</button>
            </div>
        </div>
        </#list>
    </form>
</div>


<!--头工具栏模板-->
<script type="text/html" id="toolbar_apply">
    <p>申请记录</p>
</script>

<!--状态模板-->
<script type="text/html" id="tpl_officeStatus">
    {{#  if(d.status == 0){ }}
    <span>正常</span>
    {{#  } else { }}
    <span style="color: red;">停用</span>
    {{#  } }}
</script>

</body>
<script th:src="@{/lib/layui-v2.5.4/layui/layui.js}" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    layui.use(['form', 'table','layer','laydate'], function () {
        var form = layui.form;
        var table = layui.table;
        var layer = layui.layer;
        var $ = layui.jquery;
        //初始化加载表格数据
        table.render({
            id: 'leave_record',
            elem: '#leave_record',
            url: '/apply/queryByUserId',
            align: 'center',
            toolbar: '#toolbar_apply',
            page: true,
            cols: [
                [ //表头
                    <#list rows as row>
                    {field: '${row.field}', width: 80, title: '${row.title}'},
                    </#list>
                ]
            ],
            response: {
                statusCode: 200 //规定成功的状态码，默认：0
            },
            //处理表格对不齐的问题
            done: function(res, curr, count){
                $(".layui-table-main  tr").each(function (index ,val) {
                    $($(".layui-table-fixed .layui-table-body tbody tr")[index]).height($(val).height());
                });
            }
        });
        //监听确认申请
        form.on('submit(add_apply)', function (data) {
            var applyData = data.field;
            applyData['startDate']=new Date(applyData.startDate);
            applyData['endDate']=new Date(applyData.endDate);
            applyData['actStepId']=1;
            applyData['actId']=1;
            layer.confirm('确定申请？', function () {
                $.ajax({
                    url: "/apply/add",
                    type: "POST",
                    data: {applyData:JSON.stringify(applyData)},
                    success: function (data) {
                        if (data.code == '200') {
                            layer.alert('申请成功！', {
                                icon: 5,
                                title: "提示"
                            });
                            table.reload('leave_record', {});
                        }
                    },
                    error: function () {
                        layer.msg("申请失败！！！")
                    }
                })
            });
            return false;
        });

        var laydate = layui.laydate;
        var nowDate = dateFormat('YYYY-mm-dd',new Date());
        var newDate = new Date();
        //执行一个laydate实例
        var startDate=laydate.render({
            elem: '#startDate', //指定元素
            value: nowDate,
            type: 'date',
            min: nowDate,
            max:"2099-12-31",//设置一个默认最大值
            done: function(value, date){
                console.log(date);
                console.log(newDate);
                if(JSON.stringify(date)=="{}"){
                    endDate.config.min={
                        year:newDate.getFullYear().toString(),
                        month:newDate.getMonth().toString(),
                        date: newDate.getDate().toString(),
                    };
                }else {
                    endDate.config.min ={
                        year:date.year,
                        month:date.month-1,
                        date: date.date,
                    };
                }
            }

        });

        var endDate=laydate.render({
            elem: '#endDate', //指定元素
            type: 'date',
            min:nowDate,//设置min默认最小值
            done: function(value,date){
                if(JSON.stringify(date) == "{}"){
                    startDate.config.max={
                        year:'2099',
                        month:'12',
                        date: '31',
                    }
                }else {
                    startDate.config.max={
                        year:date.year,
                        month:date.month-1,
                        date: date.date,
                    }
                }

            }
        });


    });
</script>



</html>
