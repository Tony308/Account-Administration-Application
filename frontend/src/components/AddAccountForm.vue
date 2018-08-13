<template>
  <div class="body">
    <div class="form">
      <form id="accountForm" action="" method="post">
        <h3>Add An Account</h3>
        <fieldset>
          <input placeholder="Your first name"  type="text" tabindex="1" required autofocus v-model="firstName">
        </fieldset>
        <fieldset>
          <input placeholder="Your surname"  type="text" tabindex="2" required v-model="Surname">
        </fieldset>
        <fieldset>
          <input placeholder="Account Number" name="accountNumberText" type="text" tabindex="3" required v-model="accNumber">
        </fieldset>
        <fieldset>
          <button name="submit" type="submit" tabindex="4" id="submit" v-on:click="createAccount">Submit</button>
        </fieldset>
      </form>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'AddAccountForm',
  data () {
    return {
      id: 0,
      firstName: '',
      Surname: '',
      accNumber: '',
      url: 'http://www.localhost:8080/'
    }
  },
  methods: {
    createAccount () {
      axios.post('localhost:8080/post', {
        firstname: this.firstName,
        surname: this.Surname,
        accountNumber: this.accNumber
      })
        .then(function (response) {
          console.log(response)
        })
        .catch(function (error) {
          console.log(error)
        })
      this.getAccounts()
    }
  }
}
</script>

<style scoped>
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-font-smoothing: antialiased;
    -moz-font-smoothing: antialiased;
    -o-font-smoothing: antialiased;
    font-smoothing: antialiased;
    text-rendering: optimizeLegibility;
  }

  body {
    font-family: "Roboto", Helvetica, Arial, sans-serif;
    font-weight: 100;
    font-size: 12px;
    line-height: 30px;
    color: #777;
    background: #4CAF50;
  }
  .form {
    max-width: 400px;
    width: 100%;
    margin: 0 auto;
    position: relative;
  }

  #accountForm input[type="text"],
  #accountForm input[type="email"],
  #accountForm input[type="tel"],
  #accountForm input[type="url"],
  #accountForm textarea,
  #accountForm button[type="submit"] {
    font: 400 12px/16px "Roboto", Helvetica, Arial, sans-serif;
  }

  #accountForm {
    background: #F9F9F9;
    padding: 25px;
    margin: 150px 0;
    box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  }

  #accountForm h3 {
    display: block;
    font-size: 30px;
    font-weight: 300;
    margin-bottom: 10px;
  }

  #accountForm h4 {
    margin: 5px 0 15px;
    display: block;
    font-size: 13px;
    font-weight: 400;
  }

  fieldset {
    border: medium none !important;
    margin: 0 0 10px;
    min-width: 100%;
    padding: 0;
    width: 100%;
  }

  #accountForm input[type="text"],
  #accountForm input[type="email"],
  #accountForm input[type="tel"],
  #accountForm input[type="url"],
  #accountForm textarea {
    width: 100%;
    border: 1px solid #ccc;
    background: #FFF;
    margin: 0 0 5px;
    padding: 10px;
  }

  #accountForm input[type="text"]:hover,
  #accountForm input[type="email"]:hover,
  #accountForm input[type="tel"]:hover,
  #accountForm input[type="url"]:hover,
  #accountForm textarea:hover {
    -webkit-transition: border-color 0.3s ease-in-out;
    -moz-transition: border-color 0.3s ease-in-out;
    transition: border-color 0.3s ease-in-out;
    border: 1px solid #aaa;
  }

  #accountForm textarea {
    height: 100px;
    max-width: 100%;
    resize: none;
  }

  #accountForm button[type="submit"] {
    cursor: pointer;
    width: 100%;
    border: none;
    background: #4CAF50;
    color: #FFF;
    margin: 0 0 5px;
    padding: 10px;
    font-size: 15px;
  }

  #accountForm button[type="submit"]:hover {
    background: #43A047;
    -webkit-transition: background 0.3s ease-in-out;
    -moz-transition: background 0.3s ease-in-out;
    transition: background-color 0.3s ease-in-out;
  }

  #accountForm button[type="submit"]:active {
    box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.5);
  }

  #accountForm input:focus,
  #accountForm textarea:focus {
    outline: 0;
    border: 1px solid #aaa;
  }

  ::-webkit-input-placeholder {
    color: #888;
  }

  :-moz-placeholder {
    color: #888;
  }

  ::-moz-placeholder {
    color: #888;
  }

  :-ms-input-placeholder {
    color: #888;
  }

  .body form {
    margin:30px;
  }

</style>
