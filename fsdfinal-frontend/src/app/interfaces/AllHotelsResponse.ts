export interface AllHotelsResponse {
  payload: Payload[]
  message: string
}

export interface Payload {
  id: number
  name: string
  roomPrice: number
  imageUrl: string
  description: string
  rating: number
  city: string
  email: string
  wifi: boolean
  gym: boolean
  pool: boolean
  isactive: any
}
