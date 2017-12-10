var app = angular.module("MyApp",['ui.router']);

app.controller("controller",function($scope){
	$scope.bool=false;
	$scope.submit=function(){
		if($scope.myForm.firstName.$valid && $scope.myForm.lastName.$valid
			&& $scope.myForm.email.$valid && 
			$scope.myForm.cin.$valid)
		{$scope.bool=true;}
	};
	 // calculates current date
	
	
});
