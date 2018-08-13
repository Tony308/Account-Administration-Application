<template>
  <div id="AddAccount">
    <Navigation/>
    <accounts-form/>
    <router-view/>
  </div>
</template>

<script>
import form from '../components/AddAccountForm'
import Navigation from '../components/Navigation'
export default {
  name: 'AddAccountPage',
  components: {
    'accounts-form': form,
    'Navigation': Navigation
  },
  methods: {
    createAccount () {
    }
  }
}
</script>

<style scoped>

</style>
