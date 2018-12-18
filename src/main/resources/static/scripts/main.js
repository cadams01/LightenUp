const editbtn = document.querySelector('#editbtn');
const deletebtn = document.querySelector('#deletebtn');

editbtn.addEventListener('mouseover', function(){
	deletebtn.style.display = 'flex';
});

editbtn.addEventListener('mouseout', function(){
	deletebtn.style.display = 'none';
});



function hideDelete(){
	
}