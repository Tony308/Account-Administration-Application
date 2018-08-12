import Vue from 'vue'
import App from './App'
import router from './router'
import Navigation from './components/Navigation.vue'
import Homepage from './Homepage'
import Account from './Accounts.vue'

Vue.config.productionTip = false
/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: h => h(App),
  router,
  components: { App, Navigation, Homepage, Account },
  template: '<App/>'
})
