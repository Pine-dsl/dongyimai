app.controller('loginController',function($scope,loginService){

    $scope.getUserName=function(){
        loginService.getUserName().success(
            function(response){
                $scope.loginName = response.userName
            }
        )
    }

})