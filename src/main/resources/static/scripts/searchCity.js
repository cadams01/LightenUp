const list = document.querySelectorAll(".city")
const btn = document.querySelector('.searchbtn')
const input = document.querySelector('.cityinput')

btn.addEventListener('click', function(){
	list.forEach(x => {
		console.log(x.textContent)
		console.log(input.value)
		if(x.textContent.toLowerCase() != input.value.toLowerCase()){
			x.parentElement.parentElement.parentElement.parentElement.style = "display: none";
			x.parentElement.parentElement.parentElement.parentElement.nextSibling.nextSibling.style = "display:none"
		}
	})
})

