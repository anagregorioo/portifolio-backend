# Exercício 10: Modelagem REST

# Serviço Escolhido:

* Aplicativo de música

# Equipe

Ana Carolina

Anna Clara

Gabriel Antonin

### Casos de uso:

- Acessar informações de uma música

- Manipular informações de uma música

- Acessar informações de uma playlist

- Manipular informações de uma playlist


### Recursos

- musicas
- playlists

### Endpoints

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros esperados |
| --- | --- | --- | --- | --- | --- |
| Retornar uma música | `GET /musicas/{musica-id}` | `GET` | Vazio | `200 OK` | `404 Not Found` - música não foi encontrada. | 
| Inserir uma nova música | `POST /musicas/{musica-id}` | `POST` | `{"nome": "Man in the Box", "artista": "Alice in Chains", "album": "Facelift", "duracao": "264", "ano": "1990", "genero":"Rock"}` | `201 Created` | `404 Not Found - música não foi encontrada.` |
| Atualizar música | `PUT /musicas/{musica-id}` | `PUT` | `{"nome": "Man in the Box (Remastered 2024)"}` | `200 OK` | `404 Not Found` - música não foi encontrada.
| Deletar música | `DELETE /musicas/{muisca-id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` - música não foi encontrada. |
| Retornar uma playlist | `GET /playlists/{playlist-id}` | `GET` | Vazio | `200 OK` | `404 Not Found` playlist não foi encontrada. |
| Criar uma nova playlist | `POST /playlists/{playlist-id}` | `POST` | `{ "nome": "Playlist 1", "descricao": "Minha primeira playlist", "creatorId": "3", "data_criacao", "2018-09-25"}` | `201 Created` | `404 Not Found` - playlist não foi encontrada
| Editar playlist | `PUT /playlists/{playlist-id}` | `PUT` | `{ "nome": "Playlist 1!!" }` | `200 OK` | `404 Not Found` - playlist não encontrada. |
| Excluir playlist | `DELETE /playlists/{playlist-id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` - playlist não foi encontrada. |
| Adicionar música à playlist | `POST /playlists/{playlist-id}/musicas` | `POST` | `{ "musicaId": "125", "nome": "Paranoid Android", "artista": "Radiohead", "album": "OK Computer", "duracao": "377" }` | `201 Created` | `404 Not Found` - playlist não encontrada |
| Excluir música da playlist | `DELETE /playlists/{playlist-id}/musicas/{musica-id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` - playlist ou música não encontrada |
