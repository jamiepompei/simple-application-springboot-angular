import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs';


//encapsulates within a reusable component all the functionality needed to consume the REST
//controller API that was implemented in Spring Boot 

@Injectable()
export class UserService {

  private usersUrl: string;


  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users'
   }

   public findAll(): Observable<User[]> {
     return this.http.get<User[]>(this.usersUrl);
   }

   public save(user: User){
     return this.http.post<User>(this.usersUrl, user);
   }
}
