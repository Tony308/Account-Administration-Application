<template>
    <div id="accounts">
      <Navigation id = 'nav'/>
      <table class="accountsTable">
        <thead>
          <tr>
            <th><a> First Name</a></th> <th><a> Surname</a></th> <th><a>Account Number</a></th><th><a>Edit</a></th><th><a>Delete</a></th>
          </tr>
        </thead>
        <tr>
          <td></td> <td></td> <td></td>   <td><button>Edit</button></td> <td><button>Delete</button></td>
        </tr>
        <tr>
          <td></td>
        </tr>
      </table>

      <ul id = 'example'>
        <!--<li v-for="item in response.data">-->
          <!--{{item.}}-->
        <!--</li>-->
      </ul>
    </div>
</template>
<script>

import axios from 'axios'
import accounts from './Accounts.vue'
import Navigation from './Navigation'
export default {
  name: 'accounts',
  components: {Navigation},
  component: {
    'accounts': accounts
  },
  methods: {
    getAccounts () {
      axios.get('http://www.localhost:8080/get')
        .then(response => {
          // JSON responses are automatically parsed.
          this.response = response.data
          console.log(response.data)
        })
        .catch(e => {
          this.errors.push(e)
        })
      let data = this.response.data
      return data
    },
    deleteAccount () {
    },
    updateAccount () {
    },
    created () {
      axios.get(`http://jsonplaceholder.typicode.com/posts`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.posts = response.data
          console.log(this.posts)
        })
        .catch(e => {
          this.errors.push(e)
        })
    },
    mounted: function () {
      this.getAccounts()
      this.created()
    }
  }
}
</script>
<style scoped>
  .accountsTable {
    clear:both;
    width:100%;
    margin-top:6%;
    padding:auto;
    background-color: #FFFF;
  }
  #accounts{
    width:100%;
    margin:auto;
  }
  td{
    text-align:center;
    /*border: solid black 2px;*/

  }
  tr{
    border: solid black 2px;
  }

  table {
    border: solid black 2px;
  }
</style>
