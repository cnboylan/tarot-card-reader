<template>
  <div class="main">
    <div class="spread-options">
      <button class="button is-primary" @click="oneCard">One Card</button>

      <button class="button is-primary" @click="threeCards">Three Cards</button>

      <button class="button is-primary" @click="tenCards">Ten Cards</button>
    </div>

    <div class="spread" id="spread">
      <div id="container" v-for="card in drawnCards" :key="card">
        <div v-show="!flipped" class="card-back" @click="flipCard">
          <div class="card">
            <img class="logo" src="../assets/tarot-logo.png" />
          </div>
        </div>

        <transition name="flip">
          <div v-show="flipped" class="card-front">
            <div class="card" id="front">
              <img class="face" :src='"../assets/img/" + card + ".jpg"' />
            </div>
          </div>
        </transition>
      </div>
    </div>

    <div class="clear">
      <button class="button is-small is-dark" @click="clearCards">Clear</button>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "card-spread",
  data: () => ({
    cardDivs: [],
    drawnCards: [],
    flipped: false
  }),
  methods: {
    oneCard() {

      this.flipped = false;
      this.drawnCards = [];

      axios.get("http://localhost:8080/api/v1/cards/random").then(response => {
        let reading = response.data.cards;
        reading.forEach(element => {
          this.drawnCards.push(element.name_short);
        });
      });
    },

    threeCards() {

      this.flipped = false;
      this.drawnCards = [];

      axios
        .get("http://localhost:8080/api/v1/cards/random?n=3")
        .then(response => {
          let reading = response.data.cards;
          reading.forEach(element => {
            this.drawnCards.push(element.name_short);
          });
        });
    },

    tenCards() {

      this.flipped = false;
      this.drawnCards = [];

      axios
        .get("http://localhost:8080/api/v1/cards/random?n=10")
        .then(response => {
          let reading = response.data.cards;
          reading.forEach(element => {
            this.drawnCards.push(element.name_short);
          });
        });
    },

    flipCard() {
      this.flipped = true;
    },

    clearCards() {
      this.drawnCards = [];
    }
  }
};
</script>

<style>
.flip-enter-active {
  transition: all 0.6s ease;
}

.flip-enter {
  transform: rotateY(90deg);
  opacity: 0;
}

.flip-leave {
  display: none;
}

.main {
  background-image: url(../assets/night-sky.jpg);
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
  background-attachment: fixed;
  height: 100vh;
}

.spread-options {
  height: 20vh;
  width: 75vw;
  display: flex;
  align-items: center;
  justify-content: space-around;
  margin: 0 auto;
}

.spread {
  display: flex;
  flex-wrap: wrap;
  overflow: scroll;
  justify-content: space-around;
  height: 60vh;
  width: 75vw;
  align-items: center;
  margin: 0 auto;
}

.card {
  display: flex;
  justify-content: center;
  align-items: center;
  border-radius: 8%;
  cursor: pointer;
}

.card-back,
.card-front {
  display: flex;
  justify-content: center;
  align-items: center;
}

.card-back {
  background-color: midnightblue;
  height: 50vh;
  width: 15vw;
  border-radius: 8%;
  border: solid;
  border-color: #ebebeb;
}

.card-front {
  background-color: white;
  border-radius: 8%;
  border: solid;
  border-color: #fff;
}

.face {
  border-radius: 12%;
  height: 48.5vh;
  width: 14vw;
}

.clear {
  display: flex;
  justify-content: center;
}

.logo {
  display: flex;
  width: 12vw;
  height: 24vh;
  background-color: midnightblue;
}

.primary {
  color: #117182;
}
</style>