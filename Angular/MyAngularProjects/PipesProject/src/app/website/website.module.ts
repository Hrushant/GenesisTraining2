import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginFormComponent } from './login-form/login-form.component';
import { RegistrationFormComponent } from './registration-form/registration-form.component';
import { HomeComponent } from './home/home.component';
import {FormsModule} from '@angular/forms'


@NgModule({
  declarations: [
    LoginFormComponent,
    RegistrationFormComponent,
    HomeComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    LoginFormComponent,
    RegistrationFormComponent,
    HomeComponent
  ]
})
export class WebsiteModule { }
