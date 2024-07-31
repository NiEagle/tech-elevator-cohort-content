<template>
  <div>
    <div class="card" style="width: 18rem;">
  <img class="card-img-top" v-bind:src="player.imageUrl" alt="player image">
  <div class="card-body">
    <h5 class="card-title">{{ player.fullName }}</h5>
    <p class="card-text">{{ player.firstName }} is a {{ player.positions[0] }} and has a salary of {{ player.salary }} </p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
  </div>
</template>

<script>
export default {
    props: [
      'player'
    ]

}
</script>

<style>

</style>