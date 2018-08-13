<template>
  <div id = "homepage">
    <router-view/>
    <Navigation></Navigation>
    <account-form/>
  </div>
</template>

<script>
import Navigation from './Navigation'
import accountForm from './AddAccountForm'
export default {
  name: 'Homepage',
  components: {
    'Navigation': Navigation,
    'accountForm': accountForm
  }

}
</script>

<style scoped>

</style>
