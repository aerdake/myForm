//生成uuid
function uuid() {
	var s = [];
	var hexDigits = "0123456789abcdef";
	for (var i = 0; i < 36; i++) {
		s[i] = hexDigits.substr(Math.floor(Math.random() * 0x10), 1);
	}
	s[14] = "4"; // bits 12-15 of the time_hi_and_version field to 0010
	s[19] = hexDigits.substr((s[19] & 0x3) | 0x8, 1); // bits 6-7 of the clock_seq_hi_and_reserved to 01
	s[8] = s[13] = s[18] = s[23] = "-";
	return s.join("");
}
function len_uuid(len, radix) {
    var chars = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'.split('');
    var uuid = [], i;
    radix = radix || chars.length;
    if (len) {
        // Compact form
        for (i = 0; i < len; i++) uuid[i] = chars[0 | Math.random()*radix];
    } else {
        // rfc4122, version 4 form
        var r;
        // rfc4122 requires these characters
        uuid[8] = uuid[13] = uuid[18] = uuid[23] = '-';
        uuid[14] = '4';
        // Fill in random data.  At i==19 set the high bits of clock sequence as
        // per rfc4122, sec. 4.1.5
        for (i = 0; i < 36; i++) {
            if (!uuid[i]) {
                r = 0 | Math.random()*16;
                uuid[i] = chars[(i === 19) ? (r & 0x3) | 0x8 : r];
            }
        }
    }
    return uuid.join('');
}
//生成序号
function squid(){
    //1 开始 2结束
    var maxid=0;
    $('.node').each(function (i,v) {
        if(parseInt(maxid)<parseInt($(v).attr('squid'))){
            maxid=parseInt($(v).attr('squid'));
        }
    });
    return parseInt(maxid)+1;
}
//创建副条件节点
function subNode(index,uuidClass){
	var lstr=
		'<div class="shadeBox">'+
			'<div class="branch_topShade_left"></div>'+
			'<div class="branch_bottomShade_left"></div>'+
		'</div>';
	var rstr=
		'<div class="shadeBox">'+
			'<div class="branch_topShade_right"></div>'+
			'<div class="branch_bottomShade_right"></div>'+
		'</div>';
	var n_node='';
	for(i=1;i<=index;i++){
		if(i===1){
			var node='<div style="order:'+i+';position:relative;display:inline-flex;flex-direction: column;" class="'+uuidClass+'">'+
					lstr+
					'<div class="branch_sub_node node" id="'+uuid()+'">'+
						'<div class="baranch_box node_box">'+
							'<div class="node_title edit_box sign_drug" contenteditable="tur">'+
								'<div contenteditable="true">条件'+                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             i+'</div>'+
								// '<span class="node_priority">等级'+i+'</span>'+
								'<i class="close_btn">x</i>'+
							'</div>'+
							'<div class="node_content">'+
								'<div class="node_text sign_drug">请设置条件</div>'+
							'</div>'+
						'</div>'+
						'<div class="add_node">'+
							'<a href="#none" class="add_btn">+</a>'+
						'</div>'+
					'</div>'+
				'</div>';
			n_node+=node;	
		} else if(i===index){
			var node= '<div style="order:'+i+';position:relative;display:inline-flex;flex-direction: column;" class="'+uuidClass+'">'+
					rstr+
					'<div class="branch_sub_node node" id="'+uuid()+'">'+
						'<div class="baranch_box node_box">'+
							'<div class="node_title edit_box sign_drug">'+
								'<div contenteditable="true">条件'+i+'</div>'+
								// '<span class="node_priority">等级'+i+'</span>'+
								'<i class="close_btn">x</i>'+
							'</div>'+
							'<div class="node_content">'+
								'<div class="node_text sign_drug">请设置条件</div>'+
							'</div>'+
						'</div>'+
						'<div class="add_node">'+
							'<a href="#none" class="add_btn">+</a>'+
						'</div>'+
					'</div>'+
				'</div>';
			n_node+=node;	
		} else {
			var node='<div style="order:'+i+';position:relative;display:inline-flex;flex-direction: column;" class="'+uuidClass+'">'+
					'<div class="branch_sub_node node" id="'+uuid()+'">'+
						'<div class="baranch_box node_box">'+
							'<div class="node_title edit_box sign_drug">'+
								'<div>条件'+i+'</div>'+
								// '<span class="node_priority">等级'+i+'</span>'+
								'<i class="close_btn">x</i>'+
							'</div>'+
							'<div class="node_content">'+
								'<div class="node_text sign_drug"></div>'+
							'</div>'+
						'</div>'+
						'<div class="add_node">'+
							'<a href="#none" class="add_btn">+</a>'+
						'</div>'+
					'</div>'+
				'</div>';
			n_node+=node;	
		}
		
	}
	return n_node;
}
//创建条件节点
function bNode(){
	var index=2;
	var uuidName=uuid(); 
	var uuidClass=uuid();
	var subStr=subNode(index,uuidClass);
	var n_node='<div class="branch_node" id="'+uuidName+'">'+
		'<div class="branch_addBtn" >'+
			'<a href="#none" data-class="'+uuidClass+'">添加条件</a>'+
		'</div>'+
		'<div class="branch_innerBox">'+subStr+'</div>'+
		'<div class="add_node sign_addNode">'+
			'<a href="#none" class="add_btn">+</a>'+
		'</div>'+
	'</div>';
	return n_node;
}
//创建审批节点
function  cNode(){
	// var ren='审批人';
	var uuidName=uuid();
	var maxid=squid();
	var n_node=$('<div class="approval_node node" id="'+uuidName+'" squid="'+maxid+'">'+
		'<div class="approval_box node_box">'+
			'<div class="node_title edit_box sign_drug">'+
				'<div contenteditable="true">审批人</div>'+
				'<i class="close_btn">x</i>'+
			'</div>'+
			'<div class="node_content">'+
				'<div class="node_text sign_drug">选择审批人</div>'+
			'</div>'+
		'</div>'+
		'<div class="add_node">'+
			'<a href="#none" class="add_btn">+</a>'+
		'</div>'+
	'</div>');
	return n_node;
}
//获取单个json  并返回 本身json和nextjson
function getUnitJson(nodID,data){
	var self_node={},next_idArr=[],next_node=[];
	$.each(data,function(i,v){
		if(parseInt(v.act_step_id)===nodID) {
			self_node = v;
			next_idArr = v.next_node;
		}
	});
	var arr1 = data.filter(function(value, index){
		return next_idArr.includes(parseInt(value.act_step_id))
	});
	console.log(arr1)
	return {
		"self_node":self_node,
		"next_node":next_node,
		"next_idArr":next_idArr
	}
}
//根据form生成表单权限表单
function setFormAccess(layero) {
	$(layero[0]).find('.access_box').empty();
	if(typeof getFormJson() =='string'){
		var str='<div class="access_title layui-container no_msg" style="width:100%;">'+
					'<div class="layui-row">' +
						'暂无支持权限设置的字段'+
					'</div>' +
				' </div>';
		if(getFormJson()==='form_empty'){
			$(layero[0]).find('.access_box').append(str);
		}
	}else {
		var strTit='<div class="access_title layui-container" style="width:100%;">'+
						'<div class="layui-row">'+
							'<span class="layui-col-xs3 layui-col-sm3 layui-col-lg3 layui-col-md3 layui-show-*-inline-block">表单字段</span>'+
							'<span class="layui-col-xs3 layui-col-sm3 layui-col-lg3 layui-col-md3 layui-show-*-inline-block"><input type="radio" name="a" title="可编辑" lay-filter="all_edit" checked class="all_edit"></span>'+
							'<span class="layui-col-xs3 layui-col-sm3 layui-col-lg3 layui-col-md3 layui-show-*-inline-block"><input type="radio" name="a" title="只读" lay-filter="all_readOnly" class="all_readOnly"></span>'+
							'<span class="layui-col-xs3 layui-col-sm3 layui-col-lg3 layui-col-md3 layui-show-*-inline-block"><input type="radio" name="a" title="隐藏" lay-filter="all_hidden" class="all_hidden"></span>'+
						'</div>'+
					'</div>';
		$(layero[0]).find('.access_box').append(strTit);
		var form_data = getFormJson().form_data;
		$(layero[0]).find('.access_box').append('<ul class="access_content layui-container" style="width:100%;"></ul>');
		$.each(form_data,function(index,item){
			var strCon='<li class="layui-row">'+
							'<span class="layui-col-xs3 layui-col-sm3 layui-col-lg3 layui-col-md3 layui-show-*-inline-block">'+item.field_label+'</span>'+
							'<span class="layui-col-xs3 layui-col-sm3 layui-col-lg3 layui-col-md3 layui-show-*-inline-block"><input type="radio" name="'+item.field_datakey+'" value="0" title="可编辑" checked lay-filter="subRadio1" class="subRadio1"></span>'+
							'<span class="layui-col-xs3 layui-col-sm3 layui-col-lg3 layui-col-md3 layui-show-*-inline-block"><input type="radio" name="'+item.field_datakey+'" value="1" title="只读" lay-filter="subRadio2" class="subRadio2"></span>'+
							'<span class="layui-col-xs3 layui-col-sm3 layui-col-lg3 layui-col-md3 layui-show-*-inline-block"><input type="radio" name="'+item.field_datakey+'" value="2" title="隐藏" lay-filter="subRadio3" class="subRadio3"> </span>'+
						'</li>';
			$(layero[0]).find('.access_content').append(strCon)
		});
	}
}
/*根据form生成条件表单*/
//添加promoter 条件box
function inst_promoter(tree,$location,arrJson,dValue){
	var promoterStr='<li class="promoter-box con-box" title="发起人" con-type="promoter">' +
					'<div class="layui-form-item">'+
					'<label class="layui-form-label">发起人</label>'+
					'<div class="layui-input-block">'+
					'<input type="text" name="promoter" required  lay-verify="required" placeholder="请输入发起人" autocomplete="off" class="layui-input">'+
					'</div>' +
					'<a href="#none" class="condition_del"><i class="fa fa-trash-o" aria-hidden="true"></i></a>'+
					'</div>' +
					'</li>';
	$location.append(promoterStr);
	$location.find('input[name="promoter"]').on('click',function(){
		//重新绑定监听
		var inp=layer.open({
			type:1,
			title:'请选择发起人',
			content:$('#screen_msg'),
			area:['680px','540px'],
			btn: ['确定', '取消'],
			success:function(){
				$('input[name="promoter"]').data('v','');
			},
			yes:function(){
				var getData = tree.getCheckData('obj').varStr;
				$('input[name="promoter"]').data('v',tree.getCheckData('obj'));
				$('input[name="promoter"]').val(getData);
				tree.resetPlug()
				layer.close(inp);
			}
		});
	});
	//绑定删除
	$('.condition_del').unbind('click').on('click',function(){
        var sumNum=(typeof getFormJson())=='string'?1:getFormJson().form_data.length;
	    var this_=this;
	    var dname='';
        var narrJson = arrJson;
		$.each(narrJson,function(i,v){
			if(v.name==$(this_).parents('.con-box').attr('con-type')){
				arrJson.splice(i, 1);
                dname=v.name;
			} else {
				return;
			}
		});
		$('.condition_list_sum').text(sumNum-arrJson.length);
		$('.condition_sum').text(arrJson.length);
		$('#condition_msg').data('cv',arrJson);
        $('#'+$('#condition_msg').data('pId')).data('cv',arrJson);
        if(dValue){
            var index  =dValue.findIndex(function (item){return item.type === dname });
            dValue.splice(index,1);
        }
        console.log(dValue);
        $('#'+$('#condition_msg').data('pId')).data('dValue',dValue);
        $(this).parents('.con-box').remove();
        tree.resetPlug();
	});
}
//添加number 条件box
function  inst_number(json,$location,form,arrJson,dValue) {
	var numberStr='<li class="number-box con-box" title="'+json.field_label+'" con-type="'+json.field_datakey+'">'+
		'<div class="layui-form-item layui-double-input">'+
		'<label class="layui-form-label">'+json.field_label+'</label>'+
		'<div class="layui-input-block">'+
		'<div class="layui-nomal-box layui-double-box">'+
		'<select name="logical_sum_select" lay-filter="logical-select">'+
		'<option value="0">小于</option>'+
		'<option value="1">大于</option>'+
		'<option value="2">小于等于</option>'+
		'<option value="3">等于</option>'+
		'<option value="4">大于等于</option>'+
		'<option value="5">介于(两个数之间)</option>'+
		'</select>'+
		'</div>'+
		'<div class="layui-nomal-box layui-double-box">'+
		'<input type="text" name="sigValue" required  lay-verify="required" placeholder="请输入数字  " autocomplete="off" class="layui-input">'+
		'</div>'+
		'<div class="layui-quattuor-input layui-row layui-col-space5">'+
		'<div class="layui-col-md2 layui-col-sm2">'+
		'<input type="text" name="douValueA" required  lay-verify="required" placeholder="0" autocomplete="off" class="layui-input">'+
		'</div>'+
		'<div class="layui-col-md2 layui-col-sm3">'+
		'<select name="logical_sub_selectA" lay-verify="">'+
		'<option value="1">大于</option>'+
		'<option value="4">大于等于</option>'+
		'</select>'+
		'</div>'+
		'<div class="layui-col-md2 layui-col-sm2">输入框</div>'+
		'<div class="layui-col-md2 layui-col-sm3">'+
		'<select name="logical_sub_selectB" lay-verify="">'+
		'<option value="2">小于</option>'+
		'<option value="3">小于等于</option>'+
		'</select>'+
		'</div>'+
		'<div class="layui-col-md2 layui-col-sm2">'+
		'<input type="text" name="douValueB" required  lay-verify="required" placeholder="0" autocomplete="off" class="layui-input">'+
		'</div>'+
		'</div>'+
		'</div>'+
		'<a href="#none" class="condition_del"><i class="fa fa-trash-o" aria-hidden="true"></i></a>'+
		'</div>'+
		'</li>';
	$location.append(numberStr);
	form.render();
	//绑定删除
	$('.condition_del').unbind('click').on('click',function(){
        var sumNum=getFormJson().form_data.length+1;
        var dname='';
        var this_=this;
        var narrJson = arrJson;
		$.each(narrJson,function(i,v){
			if(v.name==$(this_).parents('.con-box').attr('con-type')){
                dname=v.name;
				arrJson.splice(i, 1);
			} else {
				return;
			}
		});
		$('.condition_list_sum').text(sumNum-arrJson.length);
		$('.condition_sum').text(arrJson.length);
		$('#condition_msg').data('cv',arrJson);
        $('#'+$('#condition_msg').data('pId')).data('cv',arrJson);
        if(dValue){
            var index  =dValue.findIndex(function (item){return item.type === dname });
            dValue.splice(index,1);
        }
        $('#'+$('#condition_msg').data('pId')).data('dValue',dValue);
        $(this).parents('.con-box').remove();

	});
	//当选择介于时的重渲染
	form.on('select(logical-select)', function(data){
		if(data.value==5){
			$(this).parents('.number-box').find('.layui-quattuor-input').css('display','block');
			$(this).parents('.number-box').find('.layui-nomal-box').removeClass('layui-double-box');
		} else{
			$(this).parents('.number-box').find('.layui-quattuor-input').css('display','none');
			$(this).parents('.number-box').find('.layui-nomal-box').addClass('layui-double-box');
		}
	});
}
//添加select 条件box
function  inst_select(json,$location,form,arrJson,dValue) {
	var subStr='';
	$.each(JSON.parse(json.field_attribute).value,function(i,v){
		subStr+='<span>'+
			'<input type="checkbox" name="'+v+'" title="'+v+'" lay-skin="primary">'+
			'</span>';
	});
	var selectStr=  '<li class="select-box con-box" title="'+json.field_label+'" con-type="'+json.field_datakey+'">'+
		'<div class="layui-form-item">'+
		'<label class="layui-form-label">'+json.field_label+'</label>'+
		'<div class="layui-input-block">' +
		subStr+
		'</div>'+
		'<a href="#none" class="condition_del"><i class="fa fa-trash-o" aria-hidden="true"></i></a>'+
		'</div>'+
		'</li>';
	$location.append(selectStr);
	form.render();
	//绑定删除
	$('.condition_del').unbind('click').on('click',function(){
        var sumNum=getFormJson().form_data.length+1;
	    var this_=this;
        var dname='';
        var narrJson = arrJson;
		$.each(narrJson,function(i,v){
			if(v.name==$(this_).parents('.con-box').attr('con-type')){
				arrJson.splice(i, 1);
                var dname=v.name;
			} else {
				return;
			}
		});
		$('.condition_list_sum').text(sumNum-arrJson.length);
		$('.condition_sum').text(arrJson.length);
		$('#condition_msg').data('cv',arrJson);
        $('#'+$('#condition_msg').data('pId')).data('cv',arrJson);
        if(dValue){
            var index  =dValue.findIndex(function (item){return item.type === dname });
            dValue.splice(index,1);
        }
        console.log(dValue);
        $('#'+$('#condition_msg').data('pId')).data('dValue',dValue);
        $(this).parents('.con-box').remove();
	});
}
//更新node文字
function update_node_text(id,dValue) {
    var pStr='',sStr='',nStr='',slength=0,plength=0,nlength=0;
    $.each(dValue,function(i,v){
        switch (v['type']) {
            case 'promoter':
                plength++;
                var str= '发起人属于:';
                $.each(v['content'],function(j,k){
                    $.each(k.value,function (n,m) {
                        str+=m.name+'或'
                    });
                });
                pStr+=str.substr(0,str.length-1);
                break;
            case 'number':
                nlength++;
                var str='';
                if(v['content'].length>=2){
                    str+=v['content'][0].value+symSel(v['content'][0].operator)+ ' 并且 ';
                    str+=v['content'][1].value+symSel(v['content'][1].operator)+ ' 并且 ';
                }else {
                    str+=v['content'][0].value+symSel(v['content'][0].operator)+ ' 并且 ';
                }
                nStr+=str;
                break;
            case 'select':
                slength++;
                var str='单选框属于';
                $.each(v['content'],function (j,k) {
                   str+= k.value+ '或';
                });
                sStr+=str.substr(0,str.length-1);
                break;
        }
        if(plength!=0 && (slength!=0 || nlength!=0)){
            pStr+=' 并且 ';
        }
        if(slength!=0 && nlength!=0){
            sStr+= ' 并且 ';
        }
        $('#'+id).find('.node_text').text(pStr+sStr+nStr.substr(0,nStr.length-4));

    });
    for (var jsIndex in dValue) {
        switch (dValue[jsIndex].type) {
            case 'promoter':
            case 'number':
            case 'select':
                break;
            default:
                break;
        }
    }
}
// 判断符号
function symSel(n){
    var s='';
    switch (n) {
        case 0:
            s='小于';
            break;
        case 1:
            s='大于';
            break;
        case 2:
            s='小于等于';
            break;
        case 3:
            s='等于';
            break;
        case 4:
            s='大于等于';
            break;
        case 5:
            s='介于';
            break;
        case 6:
			s='无';
            break;
		default:
			break;
    }
    return s;
}
//判断审批节点上一节点
function prevNode(){
	$node=$('.node[squid="2"]');
	//查询当前节点的上一节点进行判断是否是条件节点
	if($node.prev().hasClass('star_node')){
		console.log('开始节点')
	}
	if($node.prev().hasClass('approval_node')){
		console.log('审批节点'+ $node.prev().attr('squid'));
	}
	if($node.prev().hasClass('branch_node')){
		// var arr=[];
		$node.prev().find('.branch_innerBox').each(function(i,v){
			// if($(v)
		})
	}
}
//查询节点的下一个节点的数组
function getextNode($node){

}
// 可编辑div非空判断
function divIsNull(layer){
    $('.node_title').on('input',function(e){
        if($(e.target).text()===''){
            layer.msg('标题不能为空');
            if($(e.target).parent().parent().hasClass('baranch_box')){
                $(e.target).text('条件'+($(e.target).parent().parent().parent().parent().index()+1));
            } else if ($(e.target).parent().parent().hasClass('approval_box')){
                $(e.target).text('审批人');
            }
        }
        console.log(e)
    });
}
//全部验证
function verifyInit(form){
    form.verify({
		//不能为空
		not_null:function(value, item){
			if(value.replace(/^\s+|\s+$/g,"")===''){
				return '基础设置表单必填项不能为空'
			}
		},
        //申请表名验证
        application_verify:function(value, item){
            if(!new RegExp("^[a-z]([a-z]+|_[a-z]+){0,}(_+)([a-z]{0,}|[a-z]{0,}_){0,}[a-z]$").test(value)){
                return '基础设置申请表名只能输入小写字母,单词间以下划线分隔';
            }
        },
        //限制20个字符
        max_length20:function(value, item){
            if(value.length>20){
                return '基础设置申请表名不能输入超过20个字符';
            }
        },
        //中文验证
        chinese_only:function(value,item){
            if(!new RegExp("^[\u4e00-\u9fa5]+$").test(value)){
                return '基础设置流程名称只能输入中文';
            }
        }
        //
    });
}
//验证数据完整性
function isFinished() {
	//验证基础设置完整性
	// var base_data=false;
	//验证流程完整性
	var flow_data=false;
	var flow_arr=$('.step_con_select').data('v');
	flow_arr.each(function (i,v) {
		if(v.step_node_type===0){
			flow_data=true
		}
	});
	//验证表单完整性
	var form_data=false;
	if(typeof getFormJson() != 'string'){
		if(getFormJson().form_data.length>=1){
			form_data=true;
		}
	}
	return {
		"base_data":form_data,
		"flow_data":flow_data,
		"form_data":form_data
	}
}

//读取数据
//部门用户树形结构
// /office/officeTreeData
function getUserJson(){
	var data;
	$.ajax({
		type:'post',
		async:false,
		url:'/office/officeTreeData',
		success:function (res) {
			if(res.code==200){
				data=res.data;
			}

		},
		error:function(e){
			data='error';
		}
	})
	return data
}
//菜单树形结构
// /menu/menuTreeData
function getMenuJson(){
	var data;
	$.ajax({
		type:'post',
		async:false,
		url:'/menu/menuTreeData',
		success:function (res) {
			if(res.code==200){
				data=res.data;
			}
		},
		error:function(e){
			data='error';
		}
	})
	return data
}