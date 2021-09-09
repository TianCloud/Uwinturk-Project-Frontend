$(function (){

	var $inform = $('#inform');
	var $newproject = $('#proproject');
	var $project = $('#revproject');
	var informTemplate = $('#information').html();
	var projectTemplate = $('#processing-projects').html();
	var reviewedProjectTemplate = $('#reviewed-projects').html();

	function showInform(message) {
		$inform.append(Mustache.render(informTemplate, message))
	}
	
	function showProcessProject(message) {
		$project.append(Mustache.render(projectTemplate, message))
	}

	function showReviewedProject(message) {
		$project.append(Mustache.render(reviewedProjectTemplate, message))
	}

	$.ajax({
		type: 'GET',
		url: '/client/inform',
		dataType:'json',
		contentType: 'application/json',
		success: function(information){
			if(inform == null)
				alert("no data");
			showInform(information);
		},
		error: function(){
			alert('error getting information');
		},
	});

	$.ajax({
		type: 'GET',
		url: '/client/process_projects',
		dataType:'json',
		contentType: 'application/json',
		success: function(process_projects){
			if(process_projects == null)
				alert("no data");
			$.each(process_projects, function(i, process_project){
				showProcessProject(process_project);
			});
		},
		error: function(){
			alert('error getting information');
		},
	});

	$.ajax({
		type: 'GET',
		url: '/client/reviewed_projects',
		dataType:'json',
		contentType: 'application/json',
		success: function(reviewed_projects){
			if(reviewed_projects == null)
				alert("no data");
			$.each(reviewed_projects, function(i, reviewed_project){
				showReviewedProject(reviewed_project);
			});
		},
		error: function(){
			alert('error getting information');
		},
	});

})