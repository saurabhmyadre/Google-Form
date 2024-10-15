import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { UsersDetails } from '../users-details';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {


  addData: UsersDetails = <UsersDetails>{};

  stateList: any = [
    { sname: 'Arunachal Pradesh' },
    { sname: 'Andhra Pradesh' },
    { sname: 'Assam' },
    { sname: 'Bihar' },
    { sname: 'Chattisgarh' },
    { sname: 'Goa' },
    { sname: 'Gujrat' },
    { sname: 'Haryana' },
    { sname: 'Jammu and Kashmir' },
    { sname: 'Jharkhand' },
    { sname: 'Karnataka' },
    { sname: 'Kerala' },
    { sname: 'Manipur' },
    { sname: 'Meghalaya' },
    { sname: 'Maharashtra' },
    { sname: 'Mizoram' },
    { sname: 'Nagaland' },
  ]

  Email_Pattern = "^[_a-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


  constructor(private service: HttpService, private router: Router, private activatedroute: ActivatedRoute) { }

  ngOnInit(): void {
  }

  onSumbit() {

    let obj = {
      name: this.addData.name,
      contact: this.addData.contact,
      alternatecontact: this.addData.alternatecontact,
      email: this.addData.email,
      gender: this.addData.gender,
      city: this.addData.city,
      college: this.addData.college,
      percentage: this.addData.percentage,
      iseducationgap: this.addData.iseducationgap,
      technology: this.addData.technology,
      company: this.addData.company,
      ctc: this.addData.ctc,
      state: this.addData.state,
      project: this.addData.project,
      institute: this.addData.institute,
      isrelocate: this.addData.isrelocate,
      isapply: this.addData.isapply,
      isshortlisted: this.addData.isshortlisted
    }

    this.service.postData(obj)
      .subscribe((responce: any) => {
        // console.log(responce);
        this.router.navigate(['success'])
      })
  }



}
