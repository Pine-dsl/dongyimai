app.controller('brandController',function ($scope,$controller,brandService) {

    $controller('baseController',{$scope:$scope})//继承

    $scope.findAll = function(){
        brandService.findAll.success(
            function(response){
                $scope.list=response
            }
        )
    }

    //分页
    $scope.findPage=function(page,rows){
        brandService.findPage(page,rows).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        )
    }

    $scope.save=function(){
        if ($scope.entity.id == null){
            brandService.addOneBrand($scope.entity).success(
                function(response){
                    if (response.success == true){
                        $scope.reloadList()
                    }else{
                        alert(response.message)
                    }
                }
            )
        }else{
            brandService.updateOneBrand($scope.entity).success(
                function(response){
                    if (response.success == true){
                        $scope.reloadList()
                    }else{
                        alert(response.message)
                    }
                }
            )
        }

    }

    $scope.findOneBrand=function(id){
        brandService.findOneBrand(id).success(
            function(response){
                $scope.entity=response
            }
        )
    }

    $scope.deleteManyBrand=function(){
        brandService.deleteManyBrand($scope.ids).success(
            function(response){
                if (response.success == true){
                    $scope.reloadList()
                }else{
                    alert(response.message)
                }
            }
        )
    }

    $scope.searchEntity={};//定义搜索对象
    //条件查询
    $scope.search=function(page,rows){
        brandService.search(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.paginationConf.totalItems=response.total;//总记录数
                $scope.list=response.rows;//给列表变量赋值
            }
        );
    }

})