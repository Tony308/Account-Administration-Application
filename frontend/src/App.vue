<!-- Has the CSS to style the content. NOT sure what to tho...
Somehow incorporates index.js & main.js and is REQUIRED.
Edit: The root component
-->

<template>
<Homepage>
</Homepage>
</template>

<script>
import Homepage from './Homepage'
import Navigation from './components/Navigation'
export default {

  name: 'app',
  components: {
    'Homepage': Homepage,
    'Navigation': Navigation
  },
  data () {
    return {msg: 'better fucking work shits gonna go down'
    }
  }
}
</script>

<style>
</style>
