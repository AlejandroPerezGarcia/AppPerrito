package cl.desafiolatam.appperrito.model.api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IDogDataBase {
    @GET ("api/breed/list/all")
    Call<RazasLista> ListaRazas();

    }
