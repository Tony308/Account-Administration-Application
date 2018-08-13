import Vue from 'vue'

import Router from 'vue-router'
import Homepage from '../components/Homepage.vue'
import accounts from '../components/Accounts'
import AddAccountPage from '../components/AddAccountPage'
// import Navigation from  '../components/Navigation'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'homepage',
      component: Homepage
    },
    {
      path: '/get-accounts',
      name: 'get-accounts',
      component: accounts
    },
    {
      path: '/add-account',
      name: 'add-accounts',
      component: AddAccountPage
    },
    {
      path: '/dashboard',
      name: 'dashboard',
      component: Homepage
    }

  ]
})
