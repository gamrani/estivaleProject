var app = angular.module("myApp",[]);

app.controller("myController",function($scope,$http){
	$scope.sejour=null;
	$scope.show=false;
	$scope.idSejour=null;
	$scope.show=null;
	
    
	$scope.chargerReservation=function(){
		
		$http({
		    method: 'get', 
		    url: '/sejour/'+$scope.idSejour
		    	
		}).then(
		  function (response) {
		    
			console.log(response.data);
			$scope.sejour=response.data;
			$scope.show=true;
		  
		},function (error){
			alert($scope.idSejour);
		    console.log(error, $scope.idSejour);
		});
		
	};

	
	$scope.modifierReservation=function(){
		alert("here");
	};
	
	$scope.annulerReservation=function(){
		alert("here");
	};
	
});