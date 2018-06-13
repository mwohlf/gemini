import {ModuleWithProviders} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ErrorHandler} from '@angular/router/src/router';

import {StartComponent} from './pages/start/start.component';
import {LoginComponent} from './pages/login/login.component';
import {HomeComponent} from './pages/home/home.component';


const APP_ROUTES: Routes = [
    { path: 'login', component: LoginComponent },
    { path: 'home', component: HomeComponent },

    { path: '**', component: StartComponent },
];

export const errorHandler: ErrorHandler = (error: any) => {
    console.error("routing failed, error");
    console.error(error);
};

export const Routing: ModuleWithProviders = RouterModule.forRoot(
    APP_ROUTES,
    {
        enableTracing: false,   // <-- debugging purposes only
        //  errorHandler: errorHandler
    }
);
