angular.module('main').controller('ClienteController',['$scope', '$http', function ($scope, $http) {

    window.$scope = $scope;
    $scope.riscos = [];


    $scope.init = function() {
    	$scope.sucesso = false;
		$scope.alerta = false;
		$scope.erro = false;
        console.log('Iniciando Controller');
        $scope.pegarTipo();
    }

	$scope.pegarTipo = function() {
				$http({
					method:'GET',
					url:'/riscos'
				}).then(function successCallback(response) {
					console.log(response)
					$scope.riscos = response.data;
				  }, function errorCallback(response) { 
				  	$scope.erro = true;					 
				  })
	}



	$scope.cadastrar = function(clienteNome, clienteCredito, clienteTipoRisco) {
			$scope.sucesso = false;
			$scope.alerta = false;
			$scope.erro = false;
			if (clienteNome == undefined || clienteNome == "" 
				|| clienteCredito == undefined || clienteCredito == ""
			 	|| clienteTipoRisco == undefined || clienteTipoRisco == "" ) {
			 	$scope.alerta = true;
			} else {
				$http({
					method:'POST',
					url:'/cadastrar',
					data : {
						nome : clienteNome,
						credito : clienteCredito,
						risco : clienteTipoRisco
					} 
				}).then(function successCallback(response) {
					$scope.sucesso = true;
				  }, function errorCallback(response) { 
				  	$scope.erro = true;					 
				  })
			}
		}
}]);