import Vue from 'vue'
import App from './App.vue'
import './../node_modules/bulma/css/bulma.css'
import axios from 'axios'

Vue.config.productionTip = false
Vue.prototype.$http = axios;
Vue.prototype.axios = axios;

new Vue({
  render: h => h(App),
}).$mount('#app')
