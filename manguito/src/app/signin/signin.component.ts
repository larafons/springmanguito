import { Component } from '@angular/core';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent {
  email: string;
  password: string;

  constructor(public userService: UsersService) { }

  login() {
    const user = { email: this.email, password: this.password };
    this.userService.login(user).subscribe(data => {
      console.log(data);
    });
  }

}

