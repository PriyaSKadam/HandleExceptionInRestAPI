package in.priya.rest;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.priya.exception.AppExcepInfo;
import in.priya.exception.NoUserFoundException;


@RestControllerAdvice
public class ExceptionHandlerClass {
	
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<String> exceptionMessage(Exception e)
	{
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value= Exception.class)
	public ResponseEntity<AppExcepInfo> exceptionMessage1(Exception e)
	{
		AppExcepInfo ex=new AppExcepInfo();
		ex.setExCode("SBEXC001");
		ex.setExMsg(e.getMessage());
		ex.setExDate(LocalDate.now());
		
		return new ResponseEntity<AppExcepInfo>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value= NoUserFoundException.class)
	public ResponseEntity<AppExcepInfo> exceptionMessage2(Exception e)
	{
		AppExcepInfo ex=new AppExcepInfo();
		ex.setExCode("SBEXC002");
		ex.setExMsg(e.getMessage());
		ex.setExDate(LocalDate.now());
		
		return new ResponseEntity<AppExcepInfo>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
