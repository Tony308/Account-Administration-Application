<template xmlns:v-model="http://www.w3.org/1999/xhtml">
  <div id = "homepage">
    <div class="body">
    <navigation></navigation>
      <div class="form">
        <form id="accountForm" action="" method="post">
          <h3>Add An Account</h3>
          <fieldset>
            <input placeholder="Your first name" v-model="firstName" type="text" tabindex="1" required autofocus>
          </fieldset>
          <fieldset>
            <input placeholder="Your surname" v-model="surname" type="text" tabindex="2" required>
          </fieldset>
          <fieldset>
            <input placeholder="Account Number" v-model="accountNumber" name="accountNumberText" type="text" tabindex="3" required>
          </fieldset>
          <fieldset>
            <button name="submit" v-bind:onclick="createAccount" type="submit" tabindex="4" id="submit" data-submit="...Sending">Submit</button>
          </fieldset>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import Navigation from './components/Navigation.vue'
import axios from 'axios'
export default {
  name: 'Homepage',
  components: {
    'navigation': Navigation
  },
  methods: {
    getAccounts () {
      axios.get(`localhost:8080/get`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.response = response.data
        })
        .catch(e => {
          this.errors.push(e)
        })
    },
    createAccount () {

    },
    deleteAccount () {
    },
    updateAccount () {
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
  /* Dropdown button */
  #nav ul .dropbtn {
    font-size: 16px;
    border: none;
    outline: none;
    color: inherit;
    background-color: inherit;
    font-family: inherit; /* Important for vertical align on mobile phones */
    margin: 0; /* Important for vertical align on mobile phones */
  }
  /* Dropdown content (hidden by default) */
  .dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
  }

  /* Links inside the dropdown */
  .dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
  }

  /* Add a grey background color to dropdown links on hover */
  .dropdown-content a:hover {
    background-color: #ddd;
  }

  /* Show the dropdown menu on hover */
  .dropdown-content {
    display: block;
    text-decoration: none;
    font-family: "Roboto", Helvetica, Arial, sans-serif;
    font-weight: 700;
    text-transform: uppercase;
    font-size: 14px;
  }

  #title {
    color: #ffffff;
    text-decoration: none;
    display: block;
    padding: 15px 25px;
    font-family: "Roboto", Helvetica, Arial, sans-serif;
    font-weight: 700;
    text-transform: uppercase;
    font-size: 14px;
    position: relative;
    -webkit-transition: color .25s;
    -moz-transition: color .25s;
    -ms-transition: color .25s;
    -o-transition: color .25s;
    transition: color .25s;
  }

  #nav {
    background: #0a1c3a;
    width: 100%;
    text-align:center;
  }
  #nav ul {
    list-style: none;
    clear:both;
    margin:auto;
    line-height: 1;
    display: block;
    zoom: 1;
  }
  #nav ul:after {
    content: " ";
    display: block;
    font-size: 0;
    height: 0;
    clear: both;
    visibility: hidden;
  }
  #nav ul .dropbtn {
    display:inline-block;
    position:absolute;
  }

  #nav ul li {
    display: inline-block;
    padding: 0;
    margin: 0;
  }
  #nav.align-right ul li {
    float: right;
  }
  #nav.align-center ul {
    text-align: center;
  }
  #nav ul li a {
    color: #ffffff;
    text-decoration: none;
    display: block;
    padding: 15px 25px;
    font-family: "Roboto", Helvetica, Arial, sans-serif;
    font-weight: 700;
    text-transform: uppercase;
    font-size: 14px;
    position: relative;
    -webkit-transition: color .25s;
    -moz-transition: color .25s;
    -ms-transition: color .25s;
    -o-transition: color .25s;
    transition: color .25s;
  }
  #nav ul li a:hover {
    color: #333333;
    background-color:#92b3e8;
  }
  #nav ul li a:hover:before {
    width: 100%;
  }
  #nav ul li a:after {
    content: "";
    display: block;
    position: absolute;
    right: -3px;
    top: 19px;
    height: 6px;
    width: 6px;
    background: #ffffff;
    opacity: .5;
  }
  #nav ul li a:before {
    content: "";
    display: block;
    position: absolute;
    left: 0;
    bottom: 0;
    height: 3px;
    width: 0;
    background: #333333;
    -webkit-transition: width .25s;
    -moz-transition: width .25s;
    -ms-transition: width .25s;
    -o-transition: width .25s;
    transition: width .25s;
  }
  #nav ul li.last > a:after,
  #nav ul li:last-child > a:after {
    display: none;
  }
  #nav ul li.active a {
    color: #333333;
  }
  #nav ul li.active a:before {
    width: 100%;
  }
  #nav.align-right li.last > a:after,
  #nav.align-right li:last-child > a:after {
    display: block;
  }
  #nav.align-right li:first-child a:after {
    display: none;
  }
</style>
