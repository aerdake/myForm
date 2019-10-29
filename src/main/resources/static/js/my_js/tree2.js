if (window.jQuery || window.Zepto) {
	(function ($) {
		var transfertree2 = function (selector, config) {
			/*
			高亮样式设置
			*/
			function getFontCss(treeId, treeNode) {
				return (!!treeNode.highlight) ? {
					color: "#A60000",
					"font-weight": "bold"
				} : {
						color: "#333",
						"font-weight": "normal"
					};
			}
			/*
				zNodes:树图数据,
				filter：搜索关键字
				setting:树图配置
			 */
			var defaults = {
				zNodes: [],
				setting: {
					check: {
						enable: true
					},
					data: {
						simpleData: {
							enable: true
						}
					},
					view: {
						fontCss: getFontCss
					},
					callback: {
						onClick: this.checkFn,
						onCheck: this.checkFn
					}
				}
			}
			this.option = $.extend(defaults, config);
			this.$ztreeid = $(selector).attr("id");
			this.$ztree = $(selector);
			this.$inittree = $.fn.zTree.init(this.$ztree, this.option.setting, this.option.zNodes);
			this.$getzTree = $.fn.zTree.getZTreeObj(this.$ztreeid);
			// this.checkFn();
			return this;
		}
		transfertree2.prototype = {
			getzTree: function () {
				return this.$getzTree;
			},
			init: function () {
				this.checkFn();
				this.removeData();
				this.searchData();
			},
			
			clickFn: function (event, treeId, treeId) {
				//将点击事件与复选框事件关联
				this_.checkFn(event, treeId, treeNode,m);
				var zTree = $.fn.zTree.getZTreeObj("treeDemo_only");
				zTree.checkNode(treeNode, !treeNode.checked, true);
				// checkChangeFn(event, treeId, treeNode);
				// var curSelect = $ztree.find(".curSelectedNode"); //控制选中项背景样式
				// treeNode.checked == true ? (curSelect.hasClass("unactive") ? curSelect.removeClass("unactive") : '') : curSelect.addClass("unactive");
			},
			/*主要功能：将点击事件与checked事件关联，判断是否最后一个元素，如果是，将最后一个元素放入渲染数组，再将数组渲染到右侧
				eventjs event 对象
				treeIdString  对应 zTree 的 treeId，便于用户操控
				treeNodeJSON  被点击的节点 JSON 数据对象
			*/
			checkFn: function (event, treeId, treeNode) {
				var _this = this;
				var zTree = (this.$getzTree ? this.$getzTree : _this.getZTreeObj(treeId));//this
				var rightArr = [],parArr=[],parIdArr=[],chilArr=[];
				var eTpye;
				try {
				    eTpye=event.type
				}
				catch(err) {
				    console.log(1)
				} finally{
					if(eTpye=="click"){
						var zTree = $.fn.zTree.getZTreeObj("treeDemo_only");
						zTree.checkNode(treeNode, !treeNode.checked, true);
					}
				}
				var checkedNode = zTree.getCheckedNodes(true);
				// only:只添加成员   ellipsis:当全部选中时会自动添加上级 并删除下级
				$.each(checkedNode, function (i, item) {
						if(item.check_Child_State==-1){
							chilArr.push(item);
						}
				});
				var rightArr=chilArr;
				var rhtml = "";
				$.each(rightArr, function (i, item) {
					rhtml += "<li data-item='" + JSON.stringify(item) + "'><span>子" + item.name + "</span><span class='close'>x</span></li>";
				});
				$(".choose-content-only").html(rhtml);

			},
			checkNodeByData:function(node){
				var zTree = this.getzTree();
				zTree.checkNode(node, true, true);
			},
			resetData: function (zNodes) {
				var zTree = this.getzTree();
				if (zNodes.length != 0) {
					$.each(zNodes, function (i, item) {
						var node = zTree.getNodeByParam("id", item.id, null);
						if (item.checked == true) {
							zTree.checkNode(node, true, true);
						} else {
							zTree.checkNode(node, false, true);
						}
					});
					this.checkFn();
				}
			},
			resetDataByChild: function (zNodes) {
				//根据id查找子节点id，编辑初始化已授权菜单,后台数据为parent-child格式时候可用[
				// [{
				//     "mid": "20001",
				//     "isParent": true,
				//     "title": "用户管理",
				//     "ischecked": false,
				//     "child": [
				//         {
				//             "mid": "20002",
				//             "isParent": false,
				//             "title": "用户查询",
				//             "ischecked": false
				//         }
				//     ]
				// }]
				$.each(zNodes, function (i, item) {
					//if (item.child.length != 0) {
						//$.each(item.child, function (idx, val) {
							var node = this.$getzTree.getNodeByParam("id", val.mid, null);
							if (val.ischecked == true) {
								treeObj.checkNode(node, true, true);
							} else {
								treeObj.checkNode(node, false, true);
							}
						// });
					// }
				});
				treeObj.setting.callback.onCheck();//初始化onchecked函数
			},
			resetPlug:function(){
				this.$getzTree.checkAllNodes(false);
				$('.choose-content-only').empty();
			},
			/*
			以数组形式返回选中项id|对象
			params:id|obj
			 */
			getCheckData: function (params) {
				var Liarr = this.$getzTree.getCheckedNodes(true),Liid=[];
				parArr=[],parIdArr=[],chilArr=[];
				var varStr='';
				
				$.each(Liarr, function (i, item) {
					if(item.check_Child_State==-1){
						chilArr.push(item);
						varStr+=','+item.name;
					}
				})
				
				// $.each(Liarr, function (i, item) {
				// 	if(params=='id'){
				// 		Liid.push(item.id);
				// 	}
				// 	if(params=='obj'){
				// 		Liid.push(item);
				// 	}
				// });
				return {
					pArr:parArr,
					cArr:chilArr,
					varStr:varStr.substr(1)
				};
			},
            getMemData:function(){
                var Liarr = this.$getzTree.getCheckedNodes(true);
                chilArr=[];
                var varStr='';
                $.each(Liarr, function (i, item) {
                    if(item.check_Child_State==-1){
                        chilArr.push(item.id);
                        varStr+=','+item.name;
                    }
                })
                return {
                    pArr:parArr,
                    cArr:chilArr,
                    varStr:varStr.substr(1)
                };
            },
			removeData: function () {
				var zTree = this.getzTree();
				//右侧选框删除事件
				$(".choose-content-only").on("click", ".close", function () {
					var tId = $(this).parent("li").data("item").tId;
					//通过id找到节点，改变状态
					zTree.checkNode(zTree.getNodeByTId(tId), false, true);
					//移除元素
					$(this).parent("li").remove();
				});
			},
			searchData: function () {
				var zTree = this.getzTree();
				/*
				搜索树节点，如果找到则高亮显示，没找到提示
				*/
				function updateNodes(highlight, nodeList) {
					if ($("#filter-text-only").val() != "") { zTree.expandAll(false); }//先折叠所有节点，再展开相应的节点
					for (var i = 0, l = nodeList.length; i < l; i++) {
						nodeList[i].highlight = highlight;
						zTree.expandNode(nodeList[i].getParentNode(), true, false, false); //将搜索到的节点的父节点展开
						zTree.updateNode(nodeList[i]);
					}
				}
				function searchNode() {
					var filter = $("#filter-text-only").val();
					var filterArr = zTree.getNodesByParamFuzzy("name", filter, null);;
					if (filter === "") { updateNodes(false, filterArr); $(".no-data").css("display", "none"); return; };
					if (filter != "" && filterArr.length == 0) { $(".no-data").css("display", "block"); } else { $(".no-data").css("display", "none"); }
					updateNodes(true, filterArr);
				}
				/*输入框添加输入监听*/
				$("#filter-text-only").on("propertychange", searchNode).on("input", searchNode);
			}
		}
		$.fn.TransferTree2 = function (params) {
			var that = $(this);
			var instance = new transfertree2(that[0], params);
			instance.init();
			return instance;
		}
	})(window.jQuery || window.Zepto);
}