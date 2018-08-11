<!-- Has the CSS to style the content. NOT sure what to tho...
Somehow incorporates index.js & main.js and is REQUIRED.
Edit: The root component
-->
<template>
  <navigation></navigation>
</template>

<script>
import Navigation from './Navigation.vue'
export default {
  name: 'app',
  data () {
    return {
      Navigation,
      msg: 'Welcome to your personal hell.!!!'
    }
  },
  components: {
    'navigation': Navigation
  }
}
</script>

<style>

</style>
