import { createRouter as _createRouter, createWebHistory } from 'vue-router';
import ProductView from '../views/ProductView.vue';
import ProductDetailView from '../views/ProductDetailView.vue';


const routes = [{
  path:'/',
  name: 'products',
  component: ProductView
  },{
  path: '/products/:id',
  name: 'product-detail',
  component: ProductDetailView
  }

];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
