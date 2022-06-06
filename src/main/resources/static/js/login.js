/**
 * 로그인 함수 구현
 */
 function login_check() {
	
	var login_form = document.getElementById("login");
	var formData = new FormData(login_form);
	
	var id = (String)(formData.get("doctor_id"));
	var pw = (String)(formData.get("doctor_pw"));
	
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
	// fetch("/login", {
	// 	method : "POST",
	// 	body : formData
	// })
	// .then((response)=>response.json)
	// .catch(console.log("error"));
	
}