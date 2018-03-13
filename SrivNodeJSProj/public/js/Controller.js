var myapp = angular.module('myloginapp',['ngRoute']);

myapp.config(function($routeProvider, $locationProvider){
	$locationProvider.hashPrefix('');	
	$routeProvider
		.when('/', {
			templateUrl: 'login.html',
			controller: 'loginCtrl'
		})
		.when('/home', 	{
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},
			templateUrl: 'home.html',
			controller: 'homeCtrl'
		})		
		.when('/vendorcomplainces', {
			/*resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},*/
			templateUrl: 'vendorcomplainces.html',
			controller: 'vendordetailsCtrl'
		})
		.when('/employeereports', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},
			templateUrl: 'employeereports.html',
			controller: 'employeereportsCtrl'
		})
		.otherwise({
			redirectTo:'/'
		});
});

myapp.controller('loginCtrl',function($scope, $location, $rootScope, $http){
	$scope.login = {};
	$scope.submit = function(){
		 
		console.log("inside click");
        console.log($scope.username);
        console.log($scope.password);
        
		var name = $scope.username;
		var pass = $scope.password;
		var data1 = {
				name : $scope.username,
				pass : $scope.password	
		};
		
		var baseurl ="http://localhost:3030/rest/loggedinuser";
		console.log(baseurl);
					
		$http({method:'POST', url:baseurl ,data:data1}).then(function(response) {
			//response.writeHead(200,{'Content-Type':'application/json'});
			console.log("Logged In Details ---",response.data);
			if(response.data !==null)
			{
				$rootScope.loggedIn = true;
				$location.path('/home');
			}else{
				$location.path('/login');
				alert("Wrong Credentials");
			}			
		});
		
	};		
}); 

myapp.controller('homeCtrl',function($scope, $http, $location, $routeParams, $rootScope) {
	
	$scope.generatereport = function() 
	{	
		$location.path('/employeereports');		
	}
});

myapp.controller('employeereportsCtrl',function($scope, $http, $location, $routeParams, $rootScope) {	
	
	$scope.vendorreport = function() 
	{	
		console.log("inside generatereport--click");
		$location.path('/vendorcomplainces');	
	}
	
});




myapp.controller('vendordetailsCtrl',function($scope, $http, $location, $routeParams, $rootScope) {	

	$scope.message = "test";
	//$scope.message2 = "test2";
	//$scope.vendorResults = "testname";
	//$scope.vendorResults[0].vendorAddress = "devname";
	//$scope.vendorResults =[{"SLNo":1,"FName":"Venkata","LName":"Dinesh","FatherName":"Madan Mohan","PFNum":"AEPF123455","ESINum":"ESI!2345EPF","Daysworked":20,"Basicwage":50000,"EmpDA":10000,"EmpHRA":10000,"EmpOverTimeHrs":10,"EmpOverTimeWages":2000,"Gross":60000,"DeductionEPF":5000,"DeductionESIC":200,"DeductionPT":200,"DeductionLWF":200,"NetAmount":90000,"VendorName":"AT & T","VendorAddress":"Chennai","EmplrName":"Sriv TCH","EmplrAddress":"Prince Info City-II,Chennai","Month":"Nov","EsicRegNo":"ESIC12345","EpfRegNo":"EPF12345","ProfTaxRegNo":"TAN12345"},{"SLNo":2,"FName":"Venkata","LName":"Ganesh","FatherName":"Madan Mohan","PFNum":"AEPF12355","ESINum":"ESI2345EPF","Daysworked":20,"Basicwage":30000,"EmpDA":10000,"EmpHRA":8000,"EmpOverTimeHrs":12,"EmpOverTimeWages":2500,"Gross":60000,"DeductionEPF":5000,"DeductionESIC":200,"DeductionPT":200,"DeductionLWF":200,"NetAmount":75000,"VendorName":"AT & T","VendorAddress":"RMZ Millenium,Chennai","EmplrName":"Sriv TCH","EmplrAddress":"Prince Info City-II,Chennai","Month":"Nov","EsicRegNo":"ESIC12345","EpfRegNo":"EPF12345","ProfTaxRegNo":"TAN12345"}];
	//$scope.vendorResults = {"vendorResults":[{"SLNo":1,"FName":"Venkata","LName":"Dinesh","FatherName":"Madan Mohan","PFNum":"AEPF123455","ESINum":"ESI!2345EPF","Daysworked":20,"Basicwage":50000,"EmpDA":10000,"EmpHRA":10000,"EmpOverTimeHrs":10,"EmpOverTimeWages":2000,"Gross":60000,"DeductionEPF":5000,"DeductionESIC":200,"DeductionPT":200,"DeductionLWF":200,"NetAmount":90000,"VendorName":"AT & T","VendorAddress":"Chennai","EmplrName":"Sriv TCH","EmplrAddress":"Prince Info City-II,Chennai","Month":"Nov","EsicRegNo":"ESIC12345","EpfRegNo":"EPF12345","ProfTaxRegNo":"TAN12345"},{"SLNo":2,"FName":"Venkata","LName":"Ganesh","FatherName":"Madan Mohan","PFNum":"AEPF12355","ESINum":"ESI2345EPF","Daysworked":20,"Basicwage":30000,"EmpDA":10000,"EmpHRA":8000,"EmpOverTimeHrs":12,"EmpOverTimeWages":2500,"Gross":60000,"DeductionEPF":5000,"DeductionESIC":200,"DeductionPT":200,"DeductionLWF":200,"NetAmount":75000,"VendorName":"AT & T","VendorAddress":"RMZ Millenium,Chennai","EmplrName":"Sriv TCH","EmplrAddress":"Prince Info City-II,Chennai","Month":"Nov","EsicRegNo":"ESIC12345","EpfRegNo":"EPF12345","ProfTaxRegNo":"TAN12345"}]};
	var vendorArraylist = [];
	//$scope.vendorArraylist = [];
	var baseURL = 'http://localhost:3030/rest/vendor/vendordetails';
	console.log(baseURL);
		$http({url:baseURL, method:'GET' }).then(function(response) {
			console.log("response.data ---",response.data);
		$scope.vendorResults = response.data;//.vendor;	
		/*console.log("$scope.vendorResults ---",$rootScope.vendorResults);
		console.log("response.data ---",response.data);
		//console.log("JSON.parse(response.data)---",JSON.parse(response.data));
		
		console.log("JSON.stringify ---",JSON.stringify({vendorsResult:response.data}));
		console.log("JSON.stringify response ---",JSON.stringify(response.data));
		//console.log("JSON.stringify response vendor---",JSON.stringify(response.data.vendor));
		//$rootScope.vendorResults = JSON.stringify(response.data);
		return JSON.stringify({vendorResults:response.data}); 
		//$scope.vendwwqq = JSON.parse(response.data);
		//console.log("JSON.parse(response.data) ---",JSON.parse(response.data));
		//console.log("fromJson(response.data) ---",angular.fromJson(response.data));
		//$rootScope.apply;
		var vendorResults1 = $scope.vendorResults;
		$scope.vendorArraylist.push(vendorResults1);
		console.log("$scope.vendorResults--"+$scope.vendorResults);
		console.log("vendorResults1--"+vendorResults1);
*/		//console.log("$scope.vendorArraylist--"+$scope.vendorArraylist);
		
		//$scope.temp = response.data;	
		//$location.path('/vendorcomplainces');

	
	});
	$location.path('/vendorcomplainces');
	
});



