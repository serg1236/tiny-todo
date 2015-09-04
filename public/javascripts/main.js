require.config({
	waitSeconds: 20,
	
	paths:{
		
		angular: '../vendor/angular/angular',
		angularCookies: '../vendor/angular/angular-cookies',
		domReady: '../vendor/requirejs/domReady'
	}, 
	shim:{
		
		angular:{
			exports: 'angular'
		},
		
		angularCookies:{
			deps: ['angular']
		}

		
	},
	
	deps: ['./bootstrap']
});