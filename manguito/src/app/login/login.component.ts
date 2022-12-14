import { Component } from '@angular/core';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  user: string;
  password: string;
  

  constructor(public userService: UsersService) { }

  login() {
    console.log(this.user);
    console.log(this.password);
    const user = { email: this.user, password: this.password };
    this.userService.login(user).subscribe(data => {
      console.log(data);
    });
  }

}
