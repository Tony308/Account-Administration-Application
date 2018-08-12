import Vue from 'vue'
import Router from 'vue-router'
import homepage from '../Homepage.vue'
import navigation from '../components/Navigation.vue'

Vue.use(Router)
export default new Router({
  routes: [
    {
      path: '/',
      name: 'homepage',
      components: {
        homepage,
        navigation
      }
    }
  ]
})
