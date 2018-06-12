import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {ServiceWorkerModule} from '@angular/service-worker';
import {environment} from '../environments/environment';
import {HeaderComponent} from './decorator/header/header.component';
import {FooterComponent} from './decorator/footer/footer.component';
import {Routing} from './routing';
import { StartComponent } from './pages/start/start.component';
import { LoginComponent } from './pages/login/login.component';
import { HomeComponent } from './pages/home/home.component';
import {
    MatButtonModule, MatCardModule, MatIconModule, MatListModule, MatSidenavModule,
    MatToolbarModule
} from '@angular/material';

@NgModule({
    declarations: [
        AppComponent,
        HeaderComponent,
        FooterComponent,
        StartComponent,
        LoginComponent,
        HomeComponent
    ],
    imports: [
        BrowserModule,
        Routing,
        ServiceWorkerModule.register('/ngsw-worker.js', { enabled: environment.production }),
        MatToolbarModule,
        MatButtonModule,
        MatSidenavModule,
        MatIconModule,
        MatListModule,
        MatCardModule,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
