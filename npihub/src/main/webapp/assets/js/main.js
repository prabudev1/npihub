var app = angular.module("myApp", []);

app.directive('myEnter', function () {
    return function (scope, element, attrs) {
        element.bind("keydown keypress", function (event) {
            if(event.which === 13) {
                scope.$apply(function (){
                    scope.$eval(attrs.myEnter);
                });
                event.preventDefault();
            }
        });
    };
});

app.controller("myCtrl", function($scope, $log, $window) {
	
	$scope.onSearch = function() {
		$window.location.href ="./providers-list.html?q=" + $scope.searchVal;
	}
	
});

app.controller("npiDataCntrl", function($scope, $log, $window, $http, $location) {
	$scope.npi = {};
	$scope.loading = true;
	
//	var npiId = $location.search().nid;
//  alert(npiId);
    
    var npiId = getUrlParameter("nid");
    
    function getUrlParameter(name) {
        name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
        var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
        var results = regex.exec(location.search);
        return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
    };
    
    if (npiId != undefined) {
    	
	    $http({
	        method: 'GET',
	        url: 'http://localhost:9097/npi/getNpiInfo?nid=' + npiId
	    }).then(function (response){
	    	 $scope.npi = response.data;
	    }, function (error){
	    	 alert("Poda vennai vetti");
	    }).finally(function() {
	        $scope.loading = false;
	    });
	}
	
});


app.controller("npiListCntrl", function($scope, $log, $window, $http, $location) {
	$scope.npi = {};
	$scope.loading = true;
	$scope.npiListLength = 0;
	
    var npiId = getUrlParameter("q");
    
    function getUrlParameter(name) {
        name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
        var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
        var results = regex.exec(location.search);
        return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
    };
    
    if (npiId != undefined) {
    	
	    $http({
	        method: 'GET',
	        url: 'http://localhost:9097/npi/getNpiList?q=' + npiId + "&i=1&r=100"
	    }).then(function (response){
	    	 $scope.npiList = response.data;
	    	 $scope.npiListLength = $scope.npiList.length;
	    }, function (error){
	    	 alert("Poda vennai vetti");
	    }).finally(function() {
	        $scope.loading = false;
	    });
	}
    
    $scope.showNpiData = function(npi) {
		$window.location.href ="./provider-info.html?nid=" + npi.npi;
	}
	
});