<template>
  <div class="book-container">
    <BookCard
      v-for="book in $store.state.books"
      v-bind:key="book.isbn"
      v-bind:book="book"
      v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'"
    />
  </div>

</template>

<script>
import BookCard from './BookCard.vue';

export default {
 components: {
   BookCard 
},
props:[]
}
</script>

<style>
.book-container {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
}
</style>