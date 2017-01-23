/**
 * 
 */

function onClickLock(){
	var name=prompt("里面内容涉及个人隐私，请输入您认为正确的内容","郭靖好帅");//将输入的内容赋给变量 name ，
	
    if(name == "郭靖好帅")//如果返回的有内容
 
    {
         alert("感谢您由衷的赞美，该内容管理员拒绝开放~")

    } else { 
    	 alert("应该输入郭靖好帅哦~")
    }
}