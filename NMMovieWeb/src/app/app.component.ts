import { Component, OnInit } from '@angular/core';
import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'NMMovieWeb';

  constructor(private http:HttpClient) {}

  ngOnInit() {
       console.log(this.getMovieDetails());
  }
  
  getMovieDetails() {
    
    return this.http.get('http://localhost:8080/movies/title/Jaws').subscribe(data => {
      console.log(data);
    });
 
}

}
