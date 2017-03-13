$(function(){
	$("#logoBtn").on("click", function(){
		$formData={};
		$("#logoForm").find('input').each(function(){$formData[this.name]=this.value});

		$("#username").blur(function(){//用户名文本框失去焦点触发验证事件  
	        if(!$(this).val() || !$(this).val().match(/([w]){2,15}$/))//只处验证不能为空并且只能为英文或者数字或者下划线组成的２－１５个字符  
	        {  
	            $("#userTip").html("<span style='color:red'>用户名不能为空且只能为英文或者数字</span>");  
	        }  
	        else  
	        {  
	            $("#userTip").html("<span style='color:green'>输入正确</span>");  
	        }  
	    });  
	    $("#password").blur(function(){//用户密码框失去焦点触发验证事件  
	        if(!$(this).val() || !$(this).val().match(/([w]){2,15}$/))//只处验证和上面一样  
	        {  
	            $("#pswTip").html("<span style='color:red'>密码不能为空且只能为英文或者数字</span>");  
	        }  
	        else  
	        {  
	            $("#pswTip").html("输入正确");  
	        }  
	    });

	    console.log($formData);  
		$.ajax({
			//url:"./datas/addProjects.json",
			url:"/gateway_admin/user/login",
			data:JSON.stringify($formData),
			contentType: "application/json; charset=UTF-8",
			type:"post",
			success:function(data){
				if (data.status ==0) {
					
					$("#tip").html("<span style='color:green'>"+data.msg+"</span>");
					window.location.href="index.html#"+$formData.username;
				}
				else if (data.status==1) {
					$("#tip").html("<span style='color:green'>"+data.msg+"</span>");

				}
			},
			error:function(XMLHttpRequest, textStatus, errorThrown)
			{
				console.log('错误'+errorThrown);

			}
		});

	});

});