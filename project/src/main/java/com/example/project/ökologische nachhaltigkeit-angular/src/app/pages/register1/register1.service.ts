import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

@Injectable()
export class Register1Service {
    private url: string;

    constructor(private http: HttpClient) {
        this.url = 'http://localhost:8080';
    }

    public register(user: User)
}

@Injectable()
export class UserService {

    private usersUrl: string;

    constructor(private http: HttpClient) {
        this.usersUrl = 'http://localhost:8080/users';
    }

    public findAll(): Observable<User[]> {
        return this.http.get<User[]>(this.usersUrl);
    }

    public save(user: User) {
        return this.http.post<User>(this.usersUrl, user);
    }
}