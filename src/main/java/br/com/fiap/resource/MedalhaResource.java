package br.com.fiap.resource;

import br.com.fiap.business.PanamericanoBusiness;
import br.com.fiap.model.Medalha;
import br.com.fiap.util.QuadroTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.sql.SQLException;
import java.util.List;

@Path("/medalhas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MedalhaResource {

    private PanamericanoBusiness business = new PanamericanoBusiness();

    @POST
    public Response registrar(Medalha medalha) throws SQLException {
        business.registrarMedalha(medalha);
        return Response.ok("Medalha registrada com sucesso!").build();
    }

    @PUT
    public Response atualizar(Medalha medalha) {
        business.atualizarMedalha(medalha);
        return Response.ok("Medalha atualizada!").build();
    }

    @GET
    @Path("/quadro")
    public List<Medalha> quadro() {
        return business.listarQuadroMedalhas();
    }
}




