import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HotelsComponent } from "./hotels/hotels.component";


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HotelsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'fsdfinal-frontend';
}
