<template>
    <div id="accounts">
      <Navigation id = 'nav'/>
      <table class="accountsTable">
        <thead>
          <tr>
            <th><a> First Name</a></th> <th><a> Surname</a></th> <th><a>Account Number</a></th><th><a>Edit</a></th><th><a>Delete</a></th>
          </tr>
        </thead>
        <tr v-for="item in tuples" v-on:key="id-rows">
          <td> {{item.firstname}}</td>
          <td> {{item.surname}}</td>
          <td> {{item.accountNumber}} </td>
          <td> <button v-on:click="updateAccount(item.id)">Edit</button></td>
        <td><button v-on:click="deleteAccount(item.id)">Delete</button></td>
        </tr>
      </table>
    </div>
</template>
<script>
import axios from 'axios'
import accounts from './Accounts.vue'
import Navigation from './Navigation'
import form from './AddAccountForm'

export default {
  name: 'accounts',
  data () {
    return {
      url: 'http://www.localhost:8080/',
      tuples: [],
      firstName: '',
      Surname: '',
      accNumber: ''
    }
  },
  components: {
    'accounts': accounts,
    'account_form': form,
    'Navigation': Navigation
  },
  mounted: function () {
    this.getAccounts()
  },
  methods: {
    getAccounts () {
      console.log('Hello world')
      axios.get('http://www.localhost:8080/get')
        .then(response => {
          // JSON responses are automatically parsed.
          this.tuples = response.data
          console.log(response.data)
        })
        .catch(e => {
          this.errors.push(e)
        })
    },
    deleteAccount (id) {
      axios.delete('http://www.localhost:8081/' + id)
        .then(response => {
          this.response = response.data
          console.log(response.data)
        })
    },
    updateAccount (id) {
      axios.put(this.url + id, {
        firstname: this.firstName,
        surname: this.Surname,
        accountNumber: this.accNumber
      })
        .then(response => {
          this.response = response.data
          console.log(response.data)
        })
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
