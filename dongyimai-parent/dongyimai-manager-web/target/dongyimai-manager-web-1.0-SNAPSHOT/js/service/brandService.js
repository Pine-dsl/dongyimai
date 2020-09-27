app.service('brandService',function($http){

    this.findAll=function(){
        return $http.get('../brand/findAll.do')
    }

    this.findPage=function(page,rows){
        return $http.get('../brand/findPage.do?page='+page+'&rows='+rows)
    }

    this.addOneBrand=function(entity){
        return $http.post('../brand/addOneBrand.do',entity)
    }

    this.updateOneBrand=function(entity){
        return $http.post('../brand/updateOneBrand.do',entity)
    }

    this.findOneBrand=function(id){
        return $http.get('../brand/findOneBrand.do?id='+ id)
    }

    this.deleteManyBrand=function(ids){
        return $http.post('../brand/deleteManyBrand.do',ids)
    }

    this.search=function(page,rows,searchEntity){
        return $http.post('../brand/search.do?page='+page+"&rows="+rows, searchEntity)
    }

    this.selectBrandList=function(){
        return $http.get("../brand/selectBrandList.do");
    }
})