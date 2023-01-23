import { Injectable } from '@angular/core';
import {Post} from "./content/post/post";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class DatabaseService {
  url = 'http://localhost:8080';
  posts!: Post[];
  constructor(private http: HttpClient) { }

  public getPosts() {
    return this.http.get<Post[]>(this.url + '/getProjects');
  }

  public getPostById(id: String) {
    return this.http.get<Post>(this.url + '/getProject/' + id);
  }
}
