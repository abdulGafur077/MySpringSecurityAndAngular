import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  api = 'api/resource';
  auth = 'auth/resource';
  title = 'Demo';
  greeting = {};
  constructor(private http: HttpClient) {
    http.get(this.auth).subscribe(data => this.greeting = data);
  }
}
