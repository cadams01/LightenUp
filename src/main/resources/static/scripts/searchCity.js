var list = document.querySelectorAll(".city")

for(let city of list){
	if (city.innerHTML.toLowerCase() == "charlotte"){
		console.log(city)
	}
	else{
		city.parentElement.parentElement.parentElement.parentElement.parentElement.style.display ="none"
	}
}