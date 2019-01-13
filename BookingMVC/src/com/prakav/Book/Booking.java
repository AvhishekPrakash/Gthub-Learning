package com.prakav.Book;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Booking

{

	public Booking() {
		
		System.out.println("Created.."+this.getClass().getSimpleName());
	}
	@RequestMapping("/Booking.do")
	public String Book(HttpServletRequest request) {
		String HotelNameFromReq=request.getParameter("HotelNmae");
		String LocationFromReq=request.getParameter("location");
		String RoomTypeFromReq=request.getParameter("RoomType");
		String NoOfBedsFromReq=request.getParameter("NoofBeds");
		String DateFromReq=request.getParameter("Date");
		
		if(NoOfBedsFromReq!=null && !DateFromReq.isEmpty()){
			Integer bed= Integer.parseInt(NoOfBedsFromReq);
			System.out.println("NoOFBeds..."+ NoOfBedsFromReq);
		}
			if(HotelNameFromReq!=null && !HotelNameFromReq.isEmpty() && DateFromReq!=null && !DateFromReq.isEmpty()) {
				System.out.println("Booking Succesful");
				request.setAttribute("HotelNmae",HotelNameFromReq);
				request.setAttribute("DateFromReq", DateFromReq);
				
				return ("/Success.jsp");
				
			}	else {
					
					
				System.out.println("Hootel booking failed try fill all the details");
				request.setAttribute("fail", "Hootel booking failed try fill all the details");
				return "/Booking.jsp";
				
				
			}
	}
	}
				
	

