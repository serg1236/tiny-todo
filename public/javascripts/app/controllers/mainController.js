define(['./module'],function(controllers){
	'use strict';
	controllers.controller('ToDoCtrl', ['$scope','$cookies','taskListService', function($scope,$cookies,taskListService){
		var cookielist = $cookies.getObject('todolist');
		$scope.tasklist=cookielist?cookielist:[];
		$scope.priority = 'normal';
		$scope.addTask = function(){
			//@todo: manage event injection to work with firefox
		  console.log(event.type);
			if((event.keyCode==13&&$scope.taskName)||event.type=="click"){
			  var newTask = {"name":$scope.taskName, "completed":false, "priority": $scope.priority};
			  if($scope.hasDescription){
			    newTask.description = $scope.taskDescription;
			  }
				$scope.tasklist.push(newTask);
				$scope.taskName="";
				$scope.taskDescription="";
				$scope.hasDescription=false;
				$scope.priority = "normal";
			}
		}

		$scope.deleteTask=function(index){
			$scope.tasklist.splice(index,1);
		}

		$scope.saveList=function(){
			console.log('Saving...');
			$cookies.putObject('todolist',$scope.tasklist,{'expires':'Fri, 31 Dec 9999 23:59:59 GMT','path':'/'});
			taskListService.save("serg1236",$scope.tasklist).then(function(response){
				Materialize.toast(response, 1000);
			});
		}
		
		$scope.order=function(target){
		 
		  if($scope.orderTarget==target){
		    if($scope.reverse){
		      $scope.orderTarget="";
		      $scope.reverse=false;
		    }else{
		       $scope.reverse=!$scope.reverse;
		    }
		  }else{
		    $scope.orderTarget=target;
		    $scope.reverse=false;
		  }
		}
		
		$scope.clear=function(){
		  $scope.tasklist=[];
		}
	}]);
})