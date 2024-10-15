import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormComponent } from './form/form.component';
import { SuccessComponent } from './success/success.component';

const routes: Routes = [
  {
    path:"", component:FormComponent
  },
  {
    path:"success", component:SuccessComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
