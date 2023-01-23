import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, withDebugTracing} from "@angular/router";
import {Post} from "./post";
import {DatabaseService} from "../../database.service";

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.scss']
})
export class PostComponent implements OnInit {
  post!: Post;
  postId!: String | null;
  href!: string;

  constructor(private route: ActivatedRoute, private databaseService: DatabaseService) { }

  ngOnInit(): void {
    this.postId = this.route.snapshot.paramMap.get('post')!;
    this.href = window.location.href;
    this.databaseService.getPostById(this.postId).subscribe(
      (data: Post) =>
        this.post = {
          id: data.id,
          start_date: data.start_date,
          text: data.text,
          topic: data.topic
        }
    );
  }

}
