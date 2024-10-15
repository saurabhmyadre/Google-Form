import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  baseUrl:string='http://localhost:8080/api/'

  constructor(private http:HttpClient) { }

  // postData(obj:any){
  //   return (this.http.post(this.baseUrl,obj,{responseType:'text'}));
  // }

  postData(obj:any){
    return (this.http.post(`${this.baseUrl}addUsers`,obj,{
      responseType:'text'
    }));
  }
}
