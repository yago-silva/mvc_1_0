package br.com.devmedia.mvc.validation;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class MapeadorExcecoesDeValidacao 
				implements ExceptionMapper<ConstraintViolationException>{

	@Override
	public Response toResponse(ConstraintViolationException exception) {
		return Response
				.status(Status.BAD_REQUEST)
				.entity("produto/erro.jsp")
				.build();
	}
}