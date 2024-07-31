<template>
  <div id="container">
    <router-link v-bind:to="{ name: 'home' }">
      <img src="https://res.cloudinary.com/drr6cwmiz/image/upload/v1721948001/logo-transparent_p8qays.png" alt="">
    </router-link>
  
    <nav>
      <router-link v-bind:to="{ name: 'home' }">
        <button type="button" class="btn btn-outline-primary">Home</button>
      </router-link>
      <router-link v-bind:to="{ name: 'about' }">
        <button type="button" class="btn btn-outline-primary">About</button>
      </router-link>
      <router-link v-bind:to="{ name: 'search' }">
        <button type="button" class="btn btn-outline-primary">Roster</button>
      </router-link>
      <router-link v-bind:to="{ name: 'addplayer' }">
        <button type="button" class="btn btn-outline-primary">Add Player</button>
      </router-link>
      <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token == ''">
        <button type="button" class="btn btn-outline-primary">Login</button>
      </router-link>
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">
        <button type="button" class="btn btn-outline-primary">Logout</button>
      </router-link>
    </nav>


  </div>
</template>

<script>
export default {

  data() {
    return {
      title: 'Java Juggernauts'
    }
  }

}
</script>

<style scoped>
#siteTitle {
  text-align: center;
}

a {
  margin-left: 5px;
}

img {
  width: 30%;
  height: auto;
}

#container {
  display: flex;
  justify-content: space-around;
  align-items: center;
  width: 100%;
  background-color: rgb(161, 244, 52);
  border-bottom: 10px solid rgb(55, 85, 19);
}

nav {
  margin: 5px;
  padding: 13px 25px;

  color: white;
}</style>