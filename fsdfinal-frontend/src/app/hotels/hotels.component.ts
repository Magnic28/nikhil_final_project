import { Component, OnInit } from '@angular/core';
import { HotelService } from '../service/hotel.service';
import { AllHotelsResponse } from '../interfaces/AllHotelsResponse';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
// import { AllHotelsResponse } from '../interfaces/AllHotelsResponse.ts';

@Component({
  selector: 'app-hotels',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './hotels.component.html',
  styleUrl: './hotels.component.css'
})
export class HotelsComponent implements OnInit {

  constructor(private hotelService: HotelService) { }

  allHotelResponse: AllHotelsResponse | undefined

filterCity: String ="abc"

  city = new FormControl("", [])

  filterForm = new FormGroup({
    city: this.city
  })

  ngOnInit(): void {

    this.getAllServices()

  }

  getAllServices() {
    this.hotelService.getAllHotels().subscribe((response) => {
      // console.log(response)
      this.allHotelResponse = response;
      console.log(this.allHotelResponse);
    })
  }

  filterResults() {

    this.allHotelResponse?.payload
    console.log(this.filterForm.value)
    if(this.filterForm.value.city){
      this.filterCity=this.filterForm.value.city
    }

    // for(allHotelResponse.payload)
  }

}
