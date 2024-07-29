import axios from 'axios';

axios.defaults.baseURL = 'http://localhost:3000'


export default {

  list() {
    return axios.get('/topics');
  },
  get(id) {
    return axios.get(`/topics/${id}`)
  }

}
