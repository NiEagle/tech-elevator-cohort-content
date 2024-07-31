import axios from 'axios';

const http = axios.create({
  baseURL: import.meta.env.VITE_REMOTE_API
});

export default {

  list() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  },
  create(topic) {
    return http.post(`/topics`, topic);
  },
  updateTopic(topic) {
    return http.put(`/topics/${topic.id}`, topic);
  },
  deleteTopic(topic) {
    return http.delete(`/topics/${topic.id}`);
  }

}
