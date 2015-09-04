define(['./module'],function(directives){
	directives.directive('listItem', function($timeout){
		  return{
		    restrict: 'A',
		    templateUrl: '/assets/javascripts/app/directives/listItem.html',
		    link: function(scope, element, attr){
		      if (scope.$last) {
		              
		        $timeout(function () {
		           //console.log($(element).parents('.collapsible'));
		           $(element).parents('.collapsible').collapsible();
		        });
		        }
		    }
		  }
		});
})