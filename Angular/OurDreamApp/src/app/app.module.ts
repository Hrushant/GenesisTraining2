import { Component, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SideNavigationComponent } from './side-navigation/side-navigation.component';
import { MainComponent } from './main/main.component';
import { SimpleInterestComponent } from './simple-interest/simple-interest.component';
import { FormsModule } from '@angular/forms';
import { ConditionComponent } from './condition/condition.component';
import { SwitchTestComponent } from './switch-test/switch-test.component';
import { LikeDisLikeComponent } from './like-dis-like/like-dis-like.component';
import { UploadingDownloadingComponent } from './uploading-downloading/uploading-downloading.component';
import { ForTestComponent } from './for-test/for-test.component';
import { AccountComponentComponent } from './account-component/account-component.component';
import { PayeeModule } from './payee/payee.module';
import { FlightsModule } from './flights/flights.module';
import { Statement } from '@angular/compiler';
import { StatementsModule } from './statements/statements.module';
import { CaveModule } from './jungle/cave/cave.module';
import { TreeModule } from './jungle/tree/tree.module';
import { SimpleInterestPipe } from './simple-interest.pipe';
import { MultiplicationTableComponent } from './multiplication-table/multiplication-table.component';
import { CalculateAveragePipe } from './calculate-average.pipe';
import { SimpleInterestPipePipe } from './simple-interest-pipe.pipe';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { ArrayComponent } from './array/array.component';
import { FundsTransferPageComponent } from './funds-transfer-page/funds-transfer-page.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { ProfileComponent } from './profile/profile.component';
import { CareerComponent } from './career/career.component';
import { RouterModule, Routes } from '@angular/router';
import { MaterialModule } from './material/material.module';
import { TemplateFormComponent } from './template-form/template-form.component';
import { ObserverDemoComponent } from './observer-demo/observer-demo.component';
import { HttpClientModule } from '@angular/common/http';


const appRoutes: Routes = [                    //Global Array
  {path : '',component: HomeComponent},        //localhost:4200
  {path : 'Home',component: HomeComponent},     //localhost:4200/Home
  {path : 'About',component: AboutUsComponent},   //localhost:4200/AboutUs
  {path : 'Profile',component: ProfileComponent}, //localhost:4200/Profile
  {path : 'Career',component: CareerComponent}    //localhost:4200/Career
]

@NgModule({        //decorator to describe the details 
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SideNavigationComponent,
    MainComponent,
    SimpleInterestComponent,
    ConditionComponent,
    SwitchTestComponent,
    LikeDisLikeComponent,
    UploadingDownloadingComponent,
    ForTestComponent,
    AccountComponentComponent,
    SimpleInterestPipe,
    MultiplicationTableComponent,
    CalculateAveragePipe,
    SimpleInterestPipePipe,
    LoginComponent,
    RegistrationComponent,
    HomeComponent,
    ArrayComponent,
    FundsTransferPageComponent,
    AboutUsComponent,
    ContactUsComponent,
    ProfileComponent,
    CareerComponent,
    TemplateFormComponent,
    ObserverDemoComponent   //registrered here as a part
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,   //importing a module for [(ngModel)]
    PayeeModule,
    FlightsModule,
    StatementsModule,
    CaveModule,
    TreeModule,
    RouterModule.forRoot(appRoutes),
    MaterialModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent] //it identifies the component to load during the startup
})
export class AppModule { }  //default module of any angular app
