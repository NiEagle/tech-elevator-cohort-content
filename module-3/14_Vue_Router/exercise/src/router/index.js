import { createRouter as _createRouter, createWebHistory } from 'vue-router';
import HomeView from "../views/HomeView.vue";
import MyBooksView from "../views/MyBooksView.vue";

const routes = [ {
  path: '/',
  name: 'Home',
  component: HomeView}
  ,{
  path: '/myBooks',
  name: 'MyBooks',
  component: MyBooksView
}
];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
