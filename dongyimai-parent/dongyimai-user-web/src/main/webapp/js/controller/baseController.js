app.controller('baseController',function($scope){

    $scope.reloadList=function(){
        //切换页码
        $scope.search( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
    }

    // 分页控件
    $scope.paginationConf = {
        currentPage: 1, // 当前页
        totalItems: 10, // 总的记录数
        itemsPerPage: 10, // 每一页显示的记录数
        perPageOptions: [10, 20, 30, 40, 50], // 用户可选的每页显示的记录数
        onChange: function () { // 以上所有的属性一旦发生修改则调用该方法
            $scope.reloadList();//重新加载
        }
    }

    $scope.ids = []
    $scope.updateSelection = function($event, id) {
        if($event.target.checked){//如果是被选中,则增加到数组,$event为事件对象
            $scope.ids.push(id);
        }else{
            var idx = $scope.ids.indexOf(id);
            $scope.ids.splice(idx, 1);//删除
        }
    }

    $scope.list=[]
    $scope.isAllSelected = function() {
        if ($scope.ids.length == $scope.list.length) {
            return true;
        } else {
            return false;
        }
    }

    // 全选
    $scope.selectAll = function($event){
        if($event.target.checked){
            $scope.ids = [];
            // 全选状态
            for(var i = 0; i < $scope.list.length; i++){
                $scope.ids.push($scope.list[i].id);
            }
        }else{
            // 全不选状态
            $scope.ids = [];
        }
    }

    // 查看当前选项的状态
    $scope.isSelected = function(id){
        if($scope.ids.indexOf(id) >= 0){
            return true;
        }else{
            return false;
        }
    }

})