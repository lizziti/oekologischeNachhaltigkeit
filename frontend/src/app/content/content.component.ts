import { Component, OnInit } from '@angular/core';
import {Post} from "./post/post";
import {DatabaseService} from "../database.service";

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.scss']
})
export class ContentComponent implements OnInit {
  posts: Post[] = [];
  constructor(private databaseService: DatabaseService) { }

  ngOnInit(): void {
    /*
    this.databaseService.getPosts().subscribe(
      posts => this.posts = posts
    );
    */
  }

}
