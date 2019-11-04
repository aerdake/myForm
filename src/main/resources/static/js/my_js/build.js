//当 DOM（文档对象模型） 已经加载，并且页面（包括图像）已经完全呈现时，会发生 ready 事件。
$(document).ready(function () {
    setup_draggable();
    $("#n-columns").on("change", function () {
        var v = $(this).val();
        if (v === "1") {
            var $col = $(".form-body .col-md-12").toggle(true);
            $(".form-body .col-md-6 .draggable").each(function (i, el) {
                $(this).remove().appendTo($col)
            });
            $(".form-body .col-md-6").toggle(false)
        } else {
            var $col = $(".form-body .col-md-6").toggle(true);
            $(".form-body .col-md-12 .draggable").each(function (i, el) {
                $(this).remove().appendTo(i % 2 ? $col[1] : $col[0])
            });
            $(".form-body .col-md-12").toggle(false)
        }
    });
    $("#copy-to-clipboard").on("click", function () {
        var $copy = $(".form-body").clone().appendTo(document.body);
        $copy.find(".tools, :hidden").remove();
        $.each(["draggable", "droppable", "sortable", "dropped", "ui-sortable", "ui-draggable", "ui-droppable", "form-body"], function (i, c) {
            $copy.find("." + c).removeClass(c).removeAttr("style")
        });
        var html = html_beautify($copy.html());
        $copy.remove();
        $modal = get_modal(html).modal("show");
        $modal.find(".btn").remove();
        $modal.find(".modal-title").html("复制HTML代码");
        $modal.find(":input:first").select().focus();
        return false
    })
});

var setup_draggable = function () {
    $(".draggable").draggable({appendTo: "body", helper: "clone"});
    $(".droppable").droppable({
        accept: ".draggable",hoverClass: "droppable-active", drop: function (event, ui) {
            var $orig = $(ui.draggable);
            if (!$(ui.draggable).hasClass("dropped")) {
                var num=uuid();
                var $el = $orig.clone().attr('field_num',num).addClass("dropped").css({
                    "position": "static",
                    "left": null,
                    "right": null,
                    "border":'1px solid #000'
                }).appendTo(this);

                var type = $orig.attr("my_field_type");
                common(num,type);
                var id = $orig.find(":input").attr("id");
                $('<p class="tools col-sm-12 col-sm-offset-3">						<a class="edit-link">编辑HTML<a> | 						<a class="remove-link">移除</a></p>').appendTo($el)
            } else {
                if ($(this)[0] != $orig.parent()[0]) {
                    var $el = $orig.clone().css({"position": "static", "left": null, "right": null}).appendTo(this);
                    $orig.remove()
                }
                var type = $orig.attr("my_field_type");
                var num = $orig.attr("field_num");
                common(num,type);

            }
        }
    }).sortable()
};
var get_modal = function (content) {
    var modal = $('<div class="modal" style="overflow: auto;" tabindex="-1">	<div class="modal-dialog"><div class="modal-content"><div class="modal-header"><a type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a><h4 class="modal-title">编辑HTML</h4></div><div class="modal-body ui-front">	<textarea class="form-control textarea-show-src"  style="min-height: 200px; margin-bottom: 10px;font-family: Monaco, Fixed"></textarea><button class="btn btn-success">更新HTML</button></div></div></div></div>').appendTo(document.body);
    var doms = document.getElementsByClassName("textarea-show-src");
    for (var i = 0; i < doms.length; i++) {
        doms.item(i).innerHTML = content;
    }
    return modal
};
$("#text_attribute").on('input', function(e){
    //获取input 元素,并实时监听用户输入
    var num=$("#text_attribute").attr('attr_num');
    var field_num="[field_num="+num+"]";
    var attr_num="[attr_num="+num+"]";
    var field_placeholder=$(attr_num).find('[name="field_placeholder"]').val();
    $(field_num).find(":input").attr("placeholder",field_placeholder);
    $(field_num).find('[myattr="myattr"]').attr("field_placeholder",field_placeholder);

    var field_label=$(attr_num).find('[name="field_label"]').val();
    $(field_num).find("label").text(field_label);
    $(field_num).find('[myattr="myattr"]').attr("field_label",field_label);


    var field_id=$(attr_num).find('[name="field_id"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_id",field_id);

    var field_datakey=$(attr_num).find('[name="field_datakey"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_datakey",field_datakey);


    var field_filter=$(attr_num).find('[name="field_filter"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_filter",field_filter);

    var field_class=$(attr_num).find('[name="field_class"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_class",field_class);

    var field_length=$(attr_num).find('[name="field_length"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_length",field_length);

});
$("#number_attribute").on('input', function(e){
    //获取input 元素,并实时监听用户输入
    var num=$("#number_attribute").attr('attr_num');
    var field_num="[field_num="+num+"]";
    var attr_num="[attr_num="+num+"]";
    var field_placeholder=$(attr_num).find('[name="field_placeholder"]').val();
    $(field_num).find(":input").attr("placeholder",field_placeholder);
    $(field_num).find('[myattr="myattr"]').attr("field_placeholder",field_placeholder);

    var field_label=$(attr_num).find('[name="field_label"]').val();
    $(field_num).find("label").text(field_label);
    $(field_num).find('[myattr="myattr"]').attr("field_label",field_label);


    var field_id=$(attr_num).find('[name="field_id"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_id",field_id);

    var field_datakey=$(attr_num).find('[name="field_datakey"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_datakey",field_datakey);


    var field_filter=$(attr_num).find('[name="field_filter"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_filter",field_filter);

    var field_class=$(attr_num).find('[name="field_class"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_class",field_class);

    var field_length=$(attr_num).find('[name="field_length"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_length",field_length);

});



$("#textarea_attribute").on('input', function(e){
    //获取input 元素,并实时监听用户输入
    var num=$("#textarea_attribute").attr('attr_num');
    var field_num="[field_num="+num+"]";
    var attr_num="[attr_num="+num+"]";
    var field_placeholder=$(attr_num).find('[name="field_placeholder"]').val();
    $(field_num).find(":input").attr("placeholder",field_placeholder);
    $(field_num).find('[myattr="myattr"]').attr("field_placeholder",field_placeholder);

    var field_label=$(attr_num).find('[name="field_label"]').val();
    $(field_num).find("label").text(field_label);
    $(field_num).find('[myattr="myattr"]').attr("field_label",field_label);


    var field_id=$(attr_num).find('[name="field_id"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_id",field_id);

    var field_datakey=$(attr_num).find('[name="field_datakey"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_datakey",field_datakey);


    var field_filter=$(attr_num).find('[name="field_filter"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_filter",field_filter);

    var field_class=$(attr_num).find('[name="field_class"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_class",field_class);


});

$("#select_attribute").on('input', function(e){
    //获取input 元素,并实时监听用户输入
    var num=$("#select_attribute").attr('attr_num');
    var field_num="[field_num="+num+"]";
    var attr_num="[attr_num="+num+"]";
    var field_label=$(attr_num).find('[name="field_label"]').val();
    $(field_num).find("label").text(field_label);
    $(field_num).find('[myattr="myattr"]').attr("field_label",field_label);

    option=$("#select").find("input");
    select=$(field_num).find("option");

    option.each(function(index,val){
        select[index].innerText=val.value;
        select[index].value=val.value;
    })
    var field_id=$(attr_num).find('[name="field_id"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_id",field_id);

    var field_datakey=$(attr_num).find('[name="field_datakey"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_datakey",field_datakey);

    var field_filter=$(attr_num).find('[name="field_filter"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_filter",field_filter);

    var field_class=$(attr_num).find('[name="field_class"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_class",field_class);

});
$("#date_attribute").on('input', function(e){
    //获取input 元素,并实时监听用户输入
    var num=$("#date_attribute").attr('attr_num');
    var field_num="[field_num="+num+"]";
    var attr_num="[attr_num="+num+"]";

    var field_label=$(attr_num).find('[name="field_label"]').val();
    $(field_num).find("label").text(field_label);
    $(field_num).find('[myattr="myattr"]').attr("field_label",field_label);

    var field_id=$(attr_num).find('[name="field_id"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_id",field_id);

    var field_datakey=$(attr_num).find('[name="field_datakey"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_datakey",field_datakey);

    var field_filter=$(attr_num).find('[name="field_filter"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_filter",field_filter);

    var field_class=$(attr_num).find('[name="field_class"]').val();
    $(field_num).find('[myattr="myattr"]').attr("field_class",field_class);



});


//验证必选的改变事件
$('[name="is_required"]').on('ifChanged',function(e){
    var parents=$(this).parents();
    var num;
    parents.each(function(index,val){
        num=val.getAttribute('attr_num');
        if(num!=undefined){
            return false;
        }
    })
    var field_num="[field_num="+num+"]";
    var attr_num="[attr_num="+num+"]";
    if($(this).is(":checked")){
        if($(field_num).find("[myattr='myattr']").attr("is_required")=='0'){
            $(field_num).find('label').after('<span class="span_required">*</span>');
            $(field_num).find("[myattr='myattr']").attr("is_required","1");
        }
    }else {
        $(field_num).find('.span_required').remove();
        $(field_num).find("[myattr='myattr']").attr("is_required","0");
    }
});
$('[name="is_hidden"]').on('ifChanged',function(e){
    var parents=$(this).parents();
    var num;
    parents.each(function(index,val){
        num=val.getAttribute('attr_num');
        if(num!=undefined){
            return false;
        }
    })
    var field_num="[field_num="+num+"]";
    var attr_num="[attr_num="+num+"]";
    if($(this).is(":checked")){
        if($(field_num).find("[myattr='myattr']").attr("is_hidden")=='0'){
            $(field_num).find("[myattr='myattr']").attr("is_hidden","1");
        }
    }else {
        $(field_num).find("[myattr='myattr']").attr("is_hidden","0");
    }
});

//拖拽后点击事件
$(document).on('click', '.dropped',function (e) {
    var type = $(this).attr("my_field_type");
    var num = $(this).attr("field_num");

    common(num,type);
})
//下拉框属性的减号点击事件
$(document).on("click", ".icon-jian", function (ev){
    var num=$("#select_attribute").attr("attr_num");
    var field_num="[field_num="+num+"]";
    if ($(this).parent().parent().find(":input").length>1) {
        var thisParent = $(this).parent().parent();
        $(this).parent().remove();
        var option=$("#select_attribute").find("#select").find("input");
        $(field_num).find('select').empty();

        if (thisParent.find(":input").length == 1) {
            thisParent.find(".icon-jian").attr("disabled","disabled")
        }
        option.each(function(index,val){
            $(field_num).find('select').append('<option value=""></option>');
            $(field_num).find("option")[index].innerText= val.value;
            $(field_num).find("option")[index].value= val.value;
        })
    }
})
//下拉框属性的加号点击事件
$(document).on("click", ".icon-wuuiconxiangjifangda", function (ev){
    var num=$("#select_attribute").attr("attr_num");
    var field_num="[field_num="+num+"]";
    var option=$("#select_attribute").find("#select").find("input");
    for(var i=1;i<=option.length+1;i++){
        var j=true;
        option.each(function(index,item){
            if (("选项"+i)==item.value) {
                j = false;
                return false;
            }
        })
        if (j){
            $(this).parent().after('<div><input type="text" value="选项'+i+'" class="form-control"><i class="iconfont icon-wuuiconxiangjifangda"></i><i class="iconfont icon-jian"></i></div>');
            return false;
        }
    }
    option=$("#select_attribute").find("#select").find("input");
    //var select=$(attr).find("option");
    $(field_num).find('select').empty();
    option.each(function(index,val){
        $(field_num).find('select').append('<option>选项</option>');
        $(field_num).find("option")[index].innerText= val.value;
        $(field_num).find("option")[index].value= val.value;
    })
})

//验证规则select的change事件
$("[name='validate']").on("change",function(){
    var parents=$(this).parents();
    var num;
    parents.each(function(index,val){
        num=val.getAttribute('attr_num');
        if(num!=undefined){
            return false;
        }
    })
    var field_num="[field_num="+num+"]";
    var validate=$(this).val();
    $(field_num).find("[myattr='myattr']").attr("validate",validate);
})
//数据类型select的change事件
$("[name='data_type']").on("change",function(){
    var parents=$(this).parents();
    var num;
    parents.each(function(index,val){
        num=val.getAttribute('attr_num');
        if(num!=undefined){
            return false;
        }
    })
    var field_num="[field_num="+num+"]";
    var data_type=$(this).val();
    $(field_num).find("[myattr='myattr']").attr("data_type",data_type);
})
//日期类型选择select的change事件
$("[name='field_type']").on("change",function(){
    var parents=$(this).parents();
    var num;
    parents.each(function(index,val){
        num=val.getAttribute('attr_num');
        if(num!=undefined){
            return false;
        }
    })
    var field_num="[field_num="+num+"]";
    var field_type=$(this).val();
    $(field_num).find("[myattr='myattr']").attr("field_type",field_type);
    $(field_num).find("[myattr='myattr']").attr("date_type",field_type);
})


$(document).on("click", ".edit-link", function (ev) {
    var $el = $(this).parent().parent();
    var $el_copy = $el.clone();
    var $edit_btn = $el_copy.find(".edit-link").parent().remove();
    var $modal = get_modal(html_beautify($el_copy.html())).modal("show");
    $modal.find(":input:first").focus();
    $modal.find(".btn-success").click(function (ev2) {
        var html = $modal.find("textarea").val();
        if (!html) {
            $el.remove()
        } else {
            $el.html(html);
            $edit_btn.appendTo($el)
        }
        $modal.modal("hide");
        return false
    })
});
$(document).on("click", ".remove-link", function (ev) {
    $(this).parent().parent().remove()
});
$(".input-group.date").datetimepicker({
    format: "yyyy-mm-dd",
    minView: "month",
    autoclose: true
});
function uuid() {
    var s = [];
    var hexDigits = "0123456789abcdef";
    for (var i = 0; i < 36; i++) {
        s[i] = hexDigits.substr(Math.floor(Math.random() * 0x10), 1);
    }
    s[14] = "4"; // bits 12-15 of the time_hi_and_version field to 0010
    s[19] = hexDigits.substr((s[19] & 0x3) | 0x8, 1); // bits 6-7 of the clock_seq_hi_and_reserved to 01
    s[8] = s[13] = s[18] = s[23] = "-";

    var uuid = s.join("");
    return uuid;
}
//字段公共部分
function common(num,type) {
    var field_num="[field_num="+num+"]";
    var attr_num="[attr_num="+num+"]";
    if(type=="单行输入框"){
        $(".attribute").addClass("hide");
        $("#text_attribute").removeClass("hide").attr('attr_num',num);

        var field_placeholder= $(field_num).find("[myattr='myattr']").attr("field_placeholder");
        $(attr_num).find('[name="field_placeholder"]').val(field_placeholder);

        var data_type= $(field_num).find("[myattr='myattr']").attr("data_type");
        $(attr_num).find("[name='data_type']").val(data_type);

        var field_length= $(field_num).find("[myattr='myattr']").attr("field_length");
        $(attr_num).find("[name='field_length']").val(field_length);
    }
    if(type=="数字输入框"){
        $(".attribute").addClass("hide");
        $("#number_attribute").removeClass("hide").attr('attr_num',num);

        var field_placeholder= $(field_num).find("[myattr='myattr']").attr("field_placeholder");
        $(attr_num).find('[name="field_placeholder"]').val(field_placeholder);

        var data_type= $(field_num).find("[myattr='myattr']").attr("data_type");
        $(attr_num).find("[name='data_type']").val(data_type);

        var field_length= $(field_num).find("[myattr='myattr']").attr("field_length");
        $(attr_num).find("[name='field_length']").val(field_length);
    }
    if(type=="多行输入框"){
        $(".attribute").addClass("hide");
        $("#textarea_attribute").removeClass("hide").attr('attr_num',num);

        var field_placeholder= $(field_num).find("[myattr='myattr']").attr("field_placeholder");
        $(attr_num).find('[name="field_placeholder"]').val(field_placeholder);
        var field_length= $(field_num).find("[myattr='myattr']").attr("field_length");
        $(attr_num).find("[name='field_length']").val(field_length);
    }
    if(type=="下拉框"){
        $(".attribute").addClass("hide");
        $("#select_attribute").removeClass("hide").attr('attr_num',num);
        $("#select").empty();
        var option=$(field_num).find("option");
        option.each( function( index, val){
            option_value = val.innerText;
            $("#select").append('<div><input type="text" class="form-control"><i class="iconfont icon-wuuiconxiangjifangda"></i><i class="iconfont icon-jian"></i></div>');
            $("#select").find("input")[index].value=option_value;
        })
    }
    if(type=="日期选择框"){
        $(".attribute").addClass("hide");
        $("#date_attribute").removeClass("hide").attr('attr_num',num);
        var field_type= $(field_num).find("[myattr='myattr']").attr("field_type");
        $(attr_num).find("[name='field_type']").val(field_type);
    }
    var field_label= $(field_num).find("[myattr='myattr']").attr("field_label");
    $(attr_num).find("[name='field_label']").val(field_label);

    var field_id= $(field_num).find("[myattr='myattr']").attr("field_id");
    $(attr_num).find("[name='field_id']").val(field_id);

    var field_datakey= $(field_num).find("[myattr='myattr']").attr("field_datakey");
    $(attr_num).find("[name='field_datakey']").val(field_datakey);

    var field_class= $(field_num).find("[myattr='myattr']").attr("field_class");
    $(attr_num).find("[name='field_class']").val(field_class);

    var field_filter= $(field_num).find("[myattr='myattr']").attr("field_filter");
    $(attr_num).find("[name='field_filter']").val(field_filter);

    var validate= $(field_num).find("[myattr='myattr']").attr("validate");
    $(attr_num).find("[name='validate']").val(validate);
    if($(field_num).find("[myattr='myattr']").attr("is_required")=='1'){
        $(attr_num).find('[name="is_required"]').iCheck('check');
    }else{
        $(attr_num).find('[name="is_required"]').iCheck('uncheck');
    }
    if($(field_num).find("[myattr='myattr']").attr("is_hidden")=='1'){
        $(attr_num).find('[name="is_hidden"]').iCheck('check');
    }else{
        $(attr_num).find('[name="is_hidden"]').iCheck('uncheck');
    }


}



var Single_line_input_box='<div class="layui-form-item" style="width: 400px">\n' +
    '                           <label class="layui-form-label"></label>\n' +
    '                           <div class="layui-input-block">\n' +
    '                               <input type="text" autocomplete="off" class="layui-input" >\n' +
    '                           </div>\n' +
    '                      </div>'

var Digital_input_box='<div class="layui-form-item" style="width: 400px">\n' +
    '                        <label class="layui-form-label"></label>\n' +
    '                        <div class="layui-input-block">\n' +
    '                             <input type="number" autocomplete="off" class="layui-input" >\n' +
    '                        </div>\n' +
    '                   </div>'

var Multi_line_input_box='<div class="layui-form-item layui-form-text">\n' +
    '                       <label class="layui-form-label"></label>\n' +
    '                       <div class="layui-input-block">\n' +
    '                           <textarea placeholder="" autocomplete="off" class="layui-textarea"></textarea>\n' +
    '                       </div>\n' +
    '                     </div>'
var Drop_down_box ='<div class="layui-form-item" style="width: 400px">\n' +
    '                <label class="layui-form-label"></label>\n' +
    '                <div class="layui-input-block">\n' +
    '                    <select>\n' +
    '                    </select>\n' +
    '                </div>\n' +
    '            </div>'
var Date_selection_box=' <div class="layui-form-item" style="width: 400px">\n' +
    '                       <label class="layui-form-label"></label>\n' +
    '                       <div class="layui-input-block">\n' +
    '                           <input type="date" autocomplete="off" class="layui-input" readonly="readonly" >\n' +
    '                       </div>\n' +
    '                     </div>'
$("#save-to-clipboard").on("click",function(){
    var form=getFormJson().form;
    if(typeof getFormJson() =='string' && getFormJson()=='required_null'){
        alert("必填项不能为空，请仔细检查必填项！");
    }
    console.log(form_data)
    console.log(form)
});
function getFormJson() {
    var form_field=$(".dropped");

    if(form_field.length==0){
        // alert("表单为空，请拖拽！");
        return "form_empty";
    }
    var i=1;
    var my_form = $("#my_form").find("form");
    my_form.empty();
    form_data=[];
    $.each(form_field,function(index,item){
        var my_field_type=$(item).attr("my_field_type");

        var field_tag = $(item).find('[myattr="myattr"]').attr("field_tag");
        var field_type = $(item).find('[myattr="myattr"]').attr("field_type");
        var data_type = $(item).find('[myattr="myattr"]').attr("data_type");
        var field_placeholder= $(item).find("[myattr='myattr']").attr("field_placeholder");
        var field_label= $(item).find("[myattr='myattr']").attr("field_label");
        if(field_label==undefined||field_label==""){
            // alert("必填项不能为空，请仔细检查必填项！")
            i=0;
            return 'required_null';
        }
        var field_id= $(item).find("[myattr='myattr']").attr("field_id");
        var field_datakey= $(item).find("[myattr='myattr']").attr("field_datakey");
        if(field_datakey==undefined||field_datakey==""){
            // alert("必填项不能为空，请仔细检查必填项！")
            i=0;
            return 'required_null';
        }
        var field_class= $(item).find("[myattr='myattr']").attr("field_class");
        var field_filter= $(item).find("[myattr='myattr']").attr("field_filter");
        var validate= $(item).find("[myattr='myattr']").attr("validate");
        var field_length= $(item).find("[myattr='myattr']").attr("field_length");
        var is_required=$(item).find("[myattr='myattr']").attr("is_required");
        var is_hidden=$(item).find("[myattr='myattr']").attr("is_hidden");
        SysActForm={};
        switch(my_field_type){
            case "单行输入框" :
                my_form.append(Single_line_input_box);
                SysActForm["field_tag"]=field_tag;
                SysActForm["field_type"]=field_type;
                SysActForm["data_type"]=data_type;
                var div=$(my_form.children("div")[index]);
                div.find("label").attr("field_label",field_label);
                SysActForm["field_label"]=field_label;
                var input=div.find(":input");
                if (!(field_placeholder==""||field_placeholder==undefined)){
                    input.attr("placeholder",field_placeholder);
                    SysActForm["field_placeholder"]=field_placeholder;
                }
                if (!(field_id==""||field_id==undefined)){
                    input.attr("id",field_id);
                    SysActForm["field_id"]=field_id;
                }
                if (!(field_datakey==""||field_datakey==undefined)){
                    input.attr("name",field_datakey);
                    SysActForm["field_datakey"]=field_datakey;
                }
                if (!(field_class==""||field_class==undefined)){
                    input.addClass(field_class);
                    SysActForm["field_class"]=field_class;
                }
                if (!(field_filter==""||field_filter==undefined)){
                    input.attr("lay-filter",field_filter);
                    SysActForm["field_filter"]=field_filter;
                }
                SysActForm["is_required"]=is_required;
                if(is_required=="1"){
                    input.attr("lay-verify","required");
                    if (!(validate=="0"||validate==undefined)){
                        input.attr("lay-verify","required|"+validate);
                        SysActForm["validate"]=validate;
                        if(!(field_length==""||field_length==undefined)){
                            input.attr("lay-verify","required|"+validate+"|field_length");
                            input.attr("field_length",field_length);
                            SysActForm["field_length"]=field_length;
                        }
                    }else {
                        if(!(field_length==""||field_length==undefined)){
                            input.attr("lay-verify","required|field_length");
                            SysActForm["field_length"]=field_length;
                            input.attr("field_length",field_length);
                        }
                    }

                }else {
                    if (!(validate=="0"||validate==undefined)){
                        input.attr("lay-verify",validate);
                        SysActForm["validate"]=validate;
                        if(!(field_length==""||field_length==undefined)){
                            input.attr("lay-verify",validate+"|field_length");
                            input.attr("field_length",field_length);
                            SysActForm["field_length"]=field_length;
                        }
                    }else {
                        if(!(field_length==""||field_length==undefined)){
                            input.attr("lay-verify","field_length");
                            SysActForm["field_length"]=field_length;
                            input.attr("field_length",field_length);
                        }
                    }
                }
                SysActForm["is_hidden"]=is_hidden;
                if (is_hidden=="1"){
                    div.addClass("hide");
                }
                form_data.push(SysActForm);
                break;
            case "数字输入框" :
                my_form.append(Digital_input_box);
                SysActForm["field_tag"]=field_tag;
                SysActForm["field_type"]=field_type;
                SysActForm["data_type"]=data_type;
                var div=$(my_form.children("div")[index]);
                div.find("label").attr("field_label",field_label);
                SysActForm["field_label"]=field_label;
                var input=div.find("input");
                if (!(field_placeholder==""||field_placeholder==undefined)){
                    input.attr("placeholder",field_placeholder);
                    SysActForm["field_placeholder"]=field_placeholder;
                }
                if (!(field_id==""||field_id==undefined)){
                    input.attr("id",field_id);
                    SysActForm["field_id"]=field_id;
                }
                if (!(field_datakey==""||field_datakey==undefined)){
                    input.attr("name",field_datakey);
                    SysActForm["field_datakey"]=field_datakey;
                }
                if (!(field_class==""||field_class==undefined)){
                    input.addClass(field_class);
                    SysActForm["field_class"]=field_class;
                }
                if (!(field_filter==""||field_filter==undefined)){
                    input.attr("lay-filter",field_filter);
                    SysActForm["field_filter"]=field_filter;
                }
                SysActForm["is_required"]=is_required;
                if(is_required=="1"){
                    input.attr("lay-verify","required");
                }
                SysActForm["is_hidden"]=is_hidden;
                if (is_hidden=="1"){
                    div.addClass("hide");
                }
                form_data.push(SysActForm);
                break;
            case "多行输入框" :
                my_form.append(Multi_line_input_box);
                SysActForm["field_tag"]=field_tag;
                SysActForm["field_type"]=field_type;
                SysActForm["data_type"]=data_type;
                var div=$(my_form.children("div")[index]);
                div.find("label").attr("field_label",field_label);
                SysActForm["field_label"]=field_label;
                var textarea=div.find("textarea");
                if (!(field_placeholder==""||field_placeholder==undefined)){
                    textarea.attr("placeholder",field_placeholder);
                    SysActForm["field_placeholder"]=field_placeholder;
                }
                if (!(field_id==""||field_id==undefined)){
                    textarea.attr("id",field_id);
                    SysActForm["field_id"]=field_id;
                }
                if (!(field_datakey==""||field_datakey==undefined)){
                    textarea.attr("name",field_datakey);
                    SysActForm["field_datakey"]=field_datakey;
                }
                if (!(field_class==""||field_class==undefined)){
                    textarea.addClass(field_class);
                    SysActForm["field_class"]=field_class;
                }
                if (!(field_filter==""||field_filter==undefined)){
                    textarea.attr("lay-filter",field_filter);
                    SysActForm["field_filter"]=field_filter;
                }
                SysActForm["is_required"]=is_required;
                if(is_required=="1"){
                    textarea.attr("lay-verify","required");
                    if(!(field_length==""||field_length==undefined)){
                        textarea.attr("lay-verify","required|field_length");
                        textarea.attr("field_length",field_length);
                        SysActForm["field_length"]=field_length;
                    }

                }else {
                    if(!(field_length==""||field_length==undefined)){
                        textarea.attr("lay-verify","field_length");
                        textarea.attr("field_length",field_length);
                        SysActForm["field_length"]=field_length;
                    }
                }
                SysActForm["is_hidden"]=is_hidden;
                if (is_hidden=="1"){
                    div.addClass("hide");
                }
                form_data.push(SysActForm);
                break;
            case "下拉框" :
                my_form.append(Drop_down_box);
                SysActForm["field_tag"]=field_tag;
                SysActForm["field_type"]=field_type;
                SysActForm["data_type"]=data_type;
                var div=$(my_form.children("div")[index]);
                var options=$(item).find("option");
                option_value=[];
                value={};
                options.each(function(index,option){
                    div.find("select").append("<option></option>");
                    div.find("option")[index].value=option.value;
                    div.find("option")[index].innerText=option.innerText;
                    option_value.push(option.value);
                });
                value["value"]=option_value;
                JSON.stringify(value);
                SysActForm["field_attribute"]=JSON.stringify(value);
                var select=div.find("select");
                div.find("label").attr("field_label",field_label);
                SysActForm["field_label"]=field_label;
                if (!(field_id==""||field_id==undefined)){
                    select.attr("id",field_id);
                    SysActForm["field_id"]=field_id;
                }
                if (!(field_datakey==""||field_datakey==undefined)){
                    select.attr("name",field_datakey);
                    SysActForm["field_datakey"]=field_datakey;
                }
                if (!(field_class==""||field_class==undefined)){
                    select.addClass(field_class);
                    SysActForm["field_class"]=field_class;
                }
                if (!(field_filter==""||field_filter==undefined)){
                    select.attr("lay-filter",field_filter);
                    SysActForm["field_filter"]=field_filter;
                }
                SysActForm["is_required"]=is_required;
                if(is_required=="1"){
                    select.attr("lay-verify","required");
                }
                SysActForm["is_hidden"]=is_hidden;
                if (is_hidden=="1"){
                    div.addClass("hide");
                }
                form_data.push(SysActForm);
                break;
            case "日期选择框" :
                my_form.append(Date_selection_box);
                SysActForm["field_tag"]=field_tag;
                SysActForm["field_type"]=field_type;
                SysActForm["data_type"]=data_type;
                var div=$(my_form.children("div")[index]);
                var input=div.find(":input");
                div.find("label").attr("field_label",field_label);
                SysActForm["field_label"]=field_label;
                if (!(field_id==""||field_id==undefined)){
                    input.attr("id",field_id);
                    SysActForm["field_id"]=field_id;
                }
                if (!(field_datakey==""||field_datakey==undefined)){
                    input.attr("name",field_datakey);
                    SysActForm["field_datakey"]=field_datakey;
                }
                if (!(field_class==""||field_class==undefined)){
                    input.addClass(field_class);
                    SysActForm["field_class"]=field_class;
                }
                if (!(field_filter==""||field_filter==undefined)){
                    input.attr("lay-filter",field_filter);
                    SysActForm["field_filter"]=field_filter;
                }
                SysActForm["is_required"]=is_required;
                if(is_required=="1"){
                    input.attr("lay-verify","required");
                }
                SysActForm["is_hidden"]=is_hidden;
                if (is_hidden=="1"){
                    div.addClass("hide");
                }
                form_data.push(SysActForm);
                break;
        }
    })
    if(i==0){
        return 'required_null';
    }
    return {
        'form_data':form_data,
        'form':$("#my_form")[0].innerHTML
    }
}
