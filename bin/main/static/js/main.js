/**
 * 의사 검진 메인페이지 함수
 */
 function getChildrenList(doc_id) {

	let doc={};
	doc.doctor_id = doc_id;
	fetch('https://jsonplaceholder.typicode.com/posts', 
		{method : "post",
		body : JSON.stringify(doc),
		})
		.then((response) => response.json())
		.then((json) => {
			let table = document.createElement("table");
			const body = document.getElementById("children_table");
			
			
			for (let i = 0; i < json.length; i++) {
				const tr = table.insertRow();
				const td1 = tr.insertCell();
				const td2 = tr.insertCell();
				const td3 = tr.insertCell();
				const btn = document.createElement("button");
				btn.innerHTML = "검진하기";
				btn.onclick = function() {
					select_child(json[i]["id"])
				};
				td1.appendChild(document.createTextNode(json[i]["id"]))
				td2.appendChild(document.createTextNode(json[i]["title"]))
				td3.appendChild(btn);
			}
			body.append(table);

		})
		.catch(console.log("error"));
}

function refresh() {
	document.getElementById("children_table").innerHTML = "";
	getChildrenList()
}

function select_child(num) {
	alert(num)
}