(function () {

    angular.module('revendedor').service('RevendedorService', function ($http, BASE_URL) {
    	                                  
		var apiPostNovo='/api/revendedor/novo';
		var apiGetListar='/api/revendedor/listar';
		  
		this.novo = function (revendedor) {
	      return $http.post(BASE_URL + apiPostNovo, revendedor);
	    };
	
	    this.listar = function () {
	      return $http.get(BASE_URL + apiGetListar);
	    };

    });

})();