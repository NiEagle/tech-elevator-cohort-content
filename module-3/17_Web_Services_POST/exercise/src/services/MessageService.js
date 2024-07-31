import axios from 'axios';

const http = axios.create({
  baseURL: import.meta.env.VITE_REMOTE_API
});

export default {

  get(id) {
    return http.get(`/messages/${id}`);
  },
  create(message) {
    return http.post(`/messages`, message);
  },
  updateMessage(message) {
    return http.put(`/messages/${message.id}`, message);
  },
  deleteMessage(message) {
    return http.delete(`/messages/${message.id}`);
  }


}
