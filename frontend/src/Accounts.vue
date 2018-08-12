<template>
    <div>
      <navigation></navigation>
      <table>
        <thead>
          <tr>
            <th><a> First Name</a></th> <th><a> Surname</a></th> <th><a>Account Number</a></th><th><a>Edit</a></th><th><a>Delete</a></th>
          </tr>
        </thead>
        <tr></tr>
      </table>
    </div>
</template>

<script>
import navigation from 'components/Navigation.vue'
export default {
  name: 'Accounts',
  components: {'navigation': navigation}
}
</script>
<style scoped>
</style>
