import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormComponent } from './form/form.component';
import { FormsModule } from '@angular/forms';
import{HttpClientModule} from "@angular/common/http";
import { SuccessComponent } from './success/success.component'; 

@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    SuccessComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule // isse hame khud se import karna hota hai 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
