app.filter("trustHTML",['$sce',function($sce){ // $sce提供了一种将可能存在风险的内容标记为可信任的内容
    return function(data){
        // 将data 转为html可以解析的内容
        return $sce.trustAsHtml(data);
    }
}])

app.controller('searchController',function($scope,$location,searchService){

    $scope.searchMap={'keywords':'','category':'','brand':'','spec':{},'price':'','pageNo':1,'pageSize':40,'sortField':'','sort':''};//搜索对象
    //添加搜索项
    $scope.addSearchItem=function(key,value){
        $scope.searchMap.pageNo=1;
        if(key=='category' || key=='brand' || key=='price'){//如果点击的是分类或者是品牌
            $scope.searchMap[key]=value;
        }else{
            $scope.searchMap.spec[key]=value;
        }
        $scope.search()
    }

    //移除复合搜索条件
    $scope.removeSearchItem=function(key){
        $scope.searchMap.pageNo=1;
        if(key=="category" ||  key=="brand" || key=='price'){//如果是分类或品牌
            $scope.searchMap[key]="";
        }else{//否则是规格
            delete $scope.searchMap.spec[key];//移除此属性
        }
        $scope.search()
    }

    //加载查询字符串
    $scope.loadkeywords=function(){
        $scope.searchMap.keywords=  $location.search()['keywords'];
        $scope.search();
    }

    //搜索
    $scope.search=function(){
        searchService.search( $scope.searchMap ).success(
            function(response){
                $scope.resultMap=response;//搜索返回的结果
                buildPageLabel()
            }
        );
    }

    //判断关键字是不是品牌
    $scope.keywordsIsBrand=function(){
        for(var i=0;i<$scope.resultMap.brandList.length;i++){
            if($scope.searchMap.keywords.indexOf($scope.resultMap.brandList[i].text)>=0){//如果包含
                return true;
            }
        }
        return false;
    }

    // 按击回车进行搜索
    $scope.keyboardSearch = function($event){
        // alert($event.keyCode);
        if($event.keyCode==13) {
            searchService.search($scope.searchMap).success(
                function (response) {
                    $scope.resultMap = response;
                }
            )
        }
    }

    //根据页码查询
    $scope.queryByPage = function(pageNo){
        if(pageNo < 1 || $scope.searchMap.pageNo < 1){
            $scope.searchMap.pageNo = 1; // 最小值越界
        }else if(pageNo > $scope.resultMap.totalPages || $scope.searchMap.pageNo > $scope.resultMap.totalPages){
            $scope.searchMap.pageNo = $scope.resultMap.totalPages; // 最大值越界
        }else{
            $scope.searchMap.pageNo = parseInt(pageNo);
        }
        $scope.search();
    }

    //设置排序规则
    $scope.sortSearch=function(sortField,sort){
        $scope.searchMap.sortField=sortField;
        $scope.searchMap.sort=sort;
        $scope.search();
    }

    //构建分页标签(totalPages为总页数)
    buildPageLabel=function(){
        $scope.pageLabel=[];//新增分页栏属性
        var maxPageNo= $scope.resultMap.totalPages;//得到最后页码
        var firstPage=1;//开始页码
        var lastPage=maxPageNo;//截止页码
        $scope.firstDot=true;//前面有点
        $scope.lastDot=true;//后边有点
        if($scope.resultMap.totalPages> 5){  //如果总页数大于5页,显示部分页码
            if($scope.searchMap.pageNo<=3){//如果当前页小于等于3
                lastPage=5; //前5页
                $scope.firstDot=false;//前面没点
            }else if( $scope.searchMap.pageNo>=lastPage-2  ){//如果当前页大于等于最大页码-2
                firstPage= maxPageNo-4;		 //后5页
                $scope.lastDot=false;//后边没点
            }else{ //显示当前页为中心的5页
                firstPage=$scope.searchMap.pageNo-2;
                lastPage=$scope.searchMap.pageNo+2;
            }
        }else{
            $scope.firstDot=false;//前面无点
            $scope.lastDot=false;//后边无点
        }
        //循环产生页码标签
        for(var i=firstPage;i<=lastPage;i++){
            $scope.pageLabel.push(i);
        }
    }
});