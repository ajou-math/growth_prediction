/**
 * 회원가입 함수 구현
 */
 function signup_check() {
	
	var signup_form = document.getElementById("signup");
	var formData = new FormData(signup_form);
	
	var id = (String)(formData.get("doctor_id"));
	var pw = (String)(formData.get("doctor_pw"));
	var pw_check = (String)(formData.get("pw_check"));
	
	if ((id.length<5)||(id.length>20)){
		alert("잘못된 아이디입니다.");
		return ;
	}
	if ((pw.length<10)||(pw.length>20)){
		alert("잘못된 비밀번호입니다.");
		return ;
	}
	for (i = 0; i < id.length ; i++){
		var ch = id[i];
		if ((ch < "a" || ch > "z") && (ch < "A" || ch > "Z") && (ch < "0" || ch > "9")){
			alert("잘못돤 형식의 아이디입니다.");
			return ;
		}
	}
	for (j = 0; j < pw.length ; j++){
		var ch = pw[j];
		if ((ch < "a" || ch > "z") && (ch < "A" || ch > "Z") && (ch < "0" || ch > "9")){
			alert("잘못돤 형식의 비밀번호입니다.");
			return ;
		}
	}
	if(!(pw_check===pw)){
		alert("비밀번호가 일치하지 않습니다.");
		return ;
	}
	
	fetch("/index", {
		method : "post",
		body : formData
	})
	.then((response)=>response.json)
	.catch(console.log("error"));
	
}