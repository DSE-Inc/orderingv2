angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8082/user/get').
        then(function(response) {
            $scope.user = response.data;
        });
});