package org.springfitnesscenter.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springfitnesscenter.contoller.ClientController;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.exception_handler.HandlerExceptions;
import org.springfitnesscenter.service.serviceMySql.impl.ClientServiceMySql;
import org.springfitnesscenter.util.ClientUtil;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientControllerTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Mock
    ClientServiceMySql clientServiceMySql;

    @InjectMocks
    ClientController cLientController;


    MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);

        mockMvc = MockMvcBuilders
                .standaloneSetup(cLientController)
                .setControllerAdvice(HandlerExceptions.class)
                .build();
    }

    @Test
    public void shouldSaveValidClient() throws Exception {
        Mockito.doNothing().when(clientServiceMySql).save(ArgumentMatchers.any(Client.class));

        Client client = ClientUtil.creatClient();

        String json = OBJECT_MAPPER.writeValueAsString(client);

        mockMvc.perform(post("/client/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    public void shouldSaveNotValidClient() throws Exception {
        Mockito.doNothing().when(clientServiceMySql).save(ArgumentMatchers.any(Client.class));

        Client client = ClientUtil.creatClient();
        client.setName("MishaClient1");

        String json = OBJECT_MAPPER.writeValueAsString(client);

        mockMvc.perform(post("/client/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    public void shouldUpdateAClient() throws Exception {
        Mockito.doNothing().when(clientServiceMySql).update(ArgumentMatchers.any(Client.class));

        Client client = ClientUtil.creatClient();

        String json = OBJECT_MAPPER.writeValueAsString(client);

        mockMvc.perform(put("/client/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldGetClient() throws Exception {
        Client client = ClientUtil.creatClient();

        client.setId(5);

        Mockito.when(clientServiceMySql.findById(ArgumentMatchers.anyInt())).thenReturn(client);

        mockMvc.perform(get("/client/{id}", 1))
                .andDo(print())
                .andExpect(status().is(200))
                .andExpect(jsonPath("id").value(5));
    }

    @Test
    public void shouldDeleteClient() throws Exception {

        Mockito.doNothing().when(clientServiceMySql).deleteById(ArgumentMatchers.anyInt());

        mockMvc.perform(delete("/client/{id}", 2))
                .andDo(print())
                .andExpect(status().is(200));
    }

}