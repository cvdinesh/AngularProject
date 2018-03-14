//var myapp = angular.module('myloginapp',['ngRoute'],['pdfmake']);
var myapp = angular.module('myloginapp',['ngRoute']);

myapp.config(function($routeProvider, $locationProvider){
	$locationProvider.hashPrefix('');	
	$routeProvider
		.when('/', {
			templateUrl: 'login.html',
			controller: 'loginCtrl'
		})
		.when('/home', {
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
		.when('/employee25details', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},
			templateUrl: 'employee25details.html',
			controller: 'employee25detailsCtrl'
		})
		.when('/employee26details', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},
			templateUrl: 'employee26details.html',
			controller: 'employee26detailsCtrl'
		})
		.when('/employeeQdetails', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},
			templateUrl: 'employeeFormQdetails.html',
			controller: 'employeeQdetailsCtrl'
		})
		.when('/vendorcomplainces', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},
			templateUrl: 'vendorcomplainces.html',
			controller: 'vendordetailsCtrl'
		})
		
		.when('/employeedetails', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},
			templateUrl: 'employeedetails.html',
			controller: 'employeedetailsCtrl'
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
		.when('/createemployee', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
				 }
				}			
			},
			templateUrl: 'createemployee.html',
			controller: 'createCtrl'
		})
		.when('/searchemployee/:empNo', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
			    }
				}			
		    },
			templateUrl: 'employeedetail.html',
			controller: 'employeedetailCtrl'
		})		
		.when('/searchemployee', {
			resolve : {
				"check": function($location, $rootScope) {
				 if(!$rootScope.loggedIn) {		 
				 	$location.path('/');
			    }
				}			
		    },
			templateUrl: 'searchemployee.html',
			controller: 'searchemployeeCtrl'
		})						
		.otherwise({
			redirectTo:'/'
		});
});

myapp.controller('loginCtrl',function($scope, $location, $rootScope, $http){
	
	$scope.submit = function(){
		 
		console.log("inside click");
        console.log($scope.username);
        console.log($scope.password);
        
		var name = $scope.username;
		var pass = $scope.password;
		var baseurl ="http://amazon-adbs-2514:8080/SrivAWS_SERVER/rest/"; //Added Amazon url
		//var baseurl ="http://localhost:8080/SrivAWS_SERVER/rest/";
					
		$http({method:'GET', url:baseurl+'login/loggedinuser/'+name+'/'+pass}).then(function(response) {
			console.log("Logged In Details ---",response.data);
			if(response.data !=null){
				$rootScope.loggedIn = true;
				$location.path('/home');	
			}else{
				$location.path('/login');
				alert("Wrong Credentials");
			}
			
			//$scope.employeeResult = response.data;
		}/*,(function(response){
			$location.path('/login');
			alert("Wrong Credentials");
			//{{ PostDataResponse }}alert("Wrong Credentials");			
		})*/);
		
       
		
/*		if($scope.username == 'admin' && $scope.password == 'admin' ) {
			$rootScope.loggedIn = true;
			$location.path('/home');
		}
		else {
			$location.path('/login');
			alert("Wrong Credentials");
		}		
*/	
		
	};		
}); 


myapp.controller('homeCtrl',function($scope, $http, $location, $routeParams, $rootScope) {
	
	$scope.generatereport = function() 
	{
		
		$location.path('/employeereports');		
	}
	
	$scope.createemployee = function()
	{			
		$location.path('/createemployee');		
	}
		
	
	$scope.searchemployee = function()
	{		
		$location.path('/searchemployee');		
	}
	
});


myapp.controller('employeereportsCtrl',function($scope, $http, $location, $routeParams) {	
	
	$scope.vendorreport = function() 
	{
		
		$location.path('/vendorcomplainces');		
	}
	
	$scope.generate25report = function() 
	{
		
		$location.path('/employee25details');		
	}
	
	$scope.generate26report = function()
	{			
		$location.path('/employee26details');		
	}
		
	
	$scope.generateQreport = function()
	{		
		$location.path('/employeeQdetails');		
	}
	
});



myapp.controller('employee25detailsCtrl',function($scope, $http, $location, $routeParams) {	
	
	//$http({url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	//$http({url:'http://srivemployeeproject-env.us-east-1.elasticbeanstalk.com/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	$http({url:'http://srivserver-env.us-east-1.elasticbeanstalk.com/rest/employee/employeedetails', method:'GET'}).then(function(response) {	
		console.log("employee25details---",response.data.employee);		
		$scope.employeesResult = response.data.employee;
	});
	
});

myapp.controller('vendordetailsCtrl',function($scope, $http, $location, $routeParams) {	
	
	//$http({url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	//$http({url:'http://srivemployeeproject-env.us-east-1.elasticbeanstalk.com/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	//$http({url:'http://srivawsserver-env.us-east-1.elasticbeanstalk.com/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	$http({url:'http://localhost:8080/SrivAWS_SERVER/rest/vendor/vendordetails', method:'GET'}).then(function(response) {
	  //$http({url:'http://srivawsserver-env.us-east-1.elasticbeanstalk.com/rest/vendor/vendordetails', method:'GET'}).then(function(response) {
		console.log("vendordetails---",response.data.vendor);
		console.log("vendordetailsCtrl---",response.data.vendor);
		console.log("vendordetailsCtrl--no vendor---",response.data);
		$scope.vendorsResult = response.data.vendor;
		
		$scope.generatePDF = function(){
		//html2canvas(document.getElementById("htmlconvertpdf"), {
			 html2canvas(document.body, {
		        onrendered: function (canvas) {
		        	//var img = canvas.toDataURL("image/png");
		        	/* var doc = new jsPDF();
		        	doc.addImage(img,'JPEG',15,15,200,180);
		        	doc.setFontSize(20);
		        	doc.setFontStyle('italic');	        	
		        	doc.save('test.pdf'); */
		            var img = canvas.toDataURL();
		            var docDefinition = new jsPDF();
		            docDefinition.addImage(img,'JPEG',15,15,180,180);
		            /* var docDefinition = {
		                content: [{
		                    image: vendorsResult,
		                    width: 400,
		                }]
		            };*/
		            //pdfMake.createPdf(docDefinition).download("Score_Details.pdf");
		            
		            docDefinition.save('test.pdf'); 
		        }
		    });
		}
	});
	
});


myapp.controller('employee26detailsCtrl',function($scope, $http, $location, $routeParams) {	
	
	//$http({url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	//$http({url:'http://srivemployeeproject-env.us-east-1.elasticbeanstalk.com/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	$http({url:'http://srivserver-env.us-east-1.elasticbeanstalk.com/rest/employee/employeedetails', method:'GET'}).then(function(response) {
		console.log("employee26details---",response.data.employee);		
		$scope.employeesResult = response.data.employee;
	});
	
});

myapp.controller('employeeQdetailsCtrl',function($scope, $http, $location, $routeParams) {	
	
	//$http({url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	//$http({url:'http://srivemployeeproject-env.us-east-1.elasticbeanstalk.com/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	$http({url:'http://srivserver-env.us-east-1.elasticbeanstalk.com/rest/employee/employeedetails', method:'GET'}).then(function(response) {
		console.log("employeeQdetails---",response.data.employee);		
		$scope.employeesResult = response.data.employee;
	});
	
});



myapp.controller('employeedetailsCtrl',function($scope, $http, $location, $routeParams) {	
	
	//$http({url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	//$http({url:'http://srivemployeeproject-env.us-east-1.elasticbeanstalk.com/SrivAWS_SERVER/rest/employee/employeedetails', method:'GET'}).then(function(response) {
	$http({url:'http://srivserver-env.us-east-1.elasticbeanstalk.com/rest/employee/employeedetails', method:'GET'}).then(function(response) {
		console.log("employeedetails---",response.data.employee);		
		$scope.employeesResult = response.data.employee;
	});
	
});


myapp.controller('createCtrl',function($scope, $http, $location, $rootScope) {	
	
	/*$scope.reset = function() { 
		$scope.empNo = undefined;
		empform.empDOB = null;
		empform.empFName = null;
		empform.empLName = null;
		//alert("12312312");
		//$scope.empform.reset();
		//alert("empno-----------"+$scope.empform.empNo);
		alert("empno-----------"+$scope.empNo);
		//angular.copy({},empform);   
	}*/
	
	$scope.generateemployee = function()
	{
		if($scope.empNo ==" " || $scope.empFName ==" " || $scope.empLName ==" " || $scope.empDOB ==" " || $scope.empGender ==" "|| $scope.age ==" "||
				$scope.perAddr ==" " || $scope.localAddr ==" " || $scope.fatherName ==" " || $scope.empDOJ ==" " ||$scope.empDesignation ==" " || 
				$scope.basicSalary ==" " || $scope.empHRA ==" " || $scope.convAllow ==" " || $scope.medicalAllow ==" " || $scope.specAllow ==" " || $scope.phone ==" ")
		{
			alert("Insufficient Data!");
		}else
		{
		var empNo = $scope.empNo;
		var empFName = $scope.empFName;
		var empLName = $scope.empLName;
		var empDOB = $scope.empDOB;
		var empGender = $scope.empGender;
		var age = $scope.age;
		var perAddr = $scope.perAddr;
		var localAddr = $scope.localAddr;
		var fatherName = $scope.fatherName;
		var empDOJ = $scope.empDOJ;
		var empDesignation = $scope.empDesignation;
		var basicSalary = $scope.basicSalary;
		var empHRA = $scope.empHRA;
		var convAllow = $scope.convAllow;
		var medicalAllow = $scope.medicalAllow;
		var specAllow = $scope.specAllow;
		var phone = $scope.phone;
		$http({method:'POST',					
				   //url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/createemployee/'+empNo+'/'+empFName+'/'+empLName+'/'+empDOB+'/'+empGender+'/'+age+'/'+perAddr+'/'+localAddr+'/'+fatherName+'/'+empDOJ+'/'+empDesignation+'/'+basicSalary+'/'+empHRA+'/'+convAllow+'/'+medicalAllow+'/'+specAllow+'/'+phone,
			url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/createemployee/'+empNo+'/'+empFName+'/'+empLName+'/'+empDOB+'/'+empGender+'/'+age+'/'+perAddr+'/'+localAddr+'/'+fatherName+'/'+empDOJ+'/'+empDesignation+'/'+basicSalary+'/'+empHRA+'/'+convAllow+'/'+medicalAllow+'/'+specAllow+'/'+phone,		   
				}).then(function(response) {
				   		        //alert("go to searchemployee");							
								$location.path('/searchemployee/'+empNo);
					});
		}
	}
});


myapp.controller('employeedetailCtrl',function($scope, $http, $location, $routeParams) {	

	var empNo = $routeParams.empNo;
	console.log("empNo=---------",empNo);
	//$http({method:'GET', url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/searchemployee/'+empNo, }).then(function(response) {
	$http({method:'GET', url:'http://localhost:8080/SrivAWS_SERVER/rest/employee/searchemployee/'+empNo, }).then(function(response) {
		console.log("employeedetailCtrl",response.data);
		console.log("response.data=---------",response.data);
		$scope.employeeResult = response.data;
	});
	
});


myapp.controller('searchemployeeCtrl',function($scope, $http, $location, $routeParams) {	
	
	//$scope.message = 'testing';
	
	$scope.searchemployeeNo = function()
	{
		var empNo = $scope.empNo;
		console.log("empNo----",empNo);
		$location.path('/searchemployee/'+empNo);			
		
	}
	
});

