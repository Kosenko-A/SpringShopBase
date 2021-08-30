$scope.loadCart = function (page) {
    $http({
    url: contextPath + '/api/v1/cart',
    method: 'GET',
    params: {
         cartName: 'cart'
    }
    }).then (function (response) {
        $scope.cartDto = response.data;
    });
};

$scope.showCart = function (productId) {
    $http({
        url: contextPath + '/api/v1/cart',
        method: 'GET'
    }).then(function (response) {
        $scope.cartDto = response.data;
        $scope.cartSum = 0;
    })
}