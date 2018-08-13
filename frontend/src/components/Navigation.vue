<template>
  <div id="nav">
    <ul>
      <li id="title">Account Application</li>
      <li><router-link to="/dashboard" replace> Dashboard</router-link></li>
      <div class="dropbtn">
        <li class="last"><a href="#">Account</a></li>
        <div class="dropdown-content">
          <router-link to="/get-accounts" replace>            Show All Accounts          </router-link>
          <router-link to="/add-account" replace>Add Account</router-link>
        </div>
      </div>
    </ul>

  </div>
</template>
<script>
export default {
  name: 'Navigation',
  methods: {
    goToAccounts () {

    }
  }
}
</script>
<style scoped>

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
    font-family: 'Open Sans', sans-serif;
    font-weight: 700;
    text-transform: uppercase;
    font-size: 14px;
  }

  #title {
    color: #ffffff;
    text-decoration: none;
    display: block;
    padding: 15px 25px;
    font-family: 'Open Sans', sans-serif;
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
    font-family: 'Open Sans', sans-serif;
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
