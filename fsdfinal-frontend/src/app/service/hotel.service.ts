import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
// import { AllHotelsResponse } from '../interfaces/AllHotelsResponse.ts';

@Injectable({
  providedIn: 'root'
})
export class HotelService {

  constructor(private httpClient: HttpClient) { }

  // getAllHotelsURL="http://localhost:8080/api/v1/hotels"
  getAllHotelsURL = "/api/v1/hotels"
  // /api/v1/

  getAllHotels(): Observable<any> {
    return this.httpClient.get(this.getAllHotelsURL)
  }
}
