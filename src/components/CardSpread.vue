<template>
  <div class="main">
    <div class="spread-options">
      <button class="button is-primary" @click="oneCard">One Card</button>

      <button class="button is-primary" @click="threeCards">Three Cards</button>

      <button class="button is-primary" @click="tenCards">Ten Cards</button>
    </div>

    <div class="spread" id="spread1" style="display: none">
      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>
    </div>

    <div class="spread" id="spread3" style="display: none">
      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>
    </div>

    <div class="spread" id="spread10" style="display: none">
      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>

      <div class="card-div">
        <div class="card">
          <img class="logo" src="../assets/tarot-logo.png" />
        </div>
      </div>
    </div>

    <div class="clear">
      <button class="button is-small is-dark">Clear</button>
    </div>
  </div>
</template>

<script>
// import axios from 'axios';

export default {
  name: "card-spread",
  data: () => ({
      cardDivs: [],
      drawnCards: []
  }),
  methods: {
      oneCard() {
          const oneCard = document.getElementById("spread1");
          const threeCards = document.getElementById("spread3");
          const tenCards = document.getElementById("spread10");

          oneCard.style.display = "flex";
          threeCards.style.display = "none";
          tenCards.style.display = "none";

          // axios.get('https://rws-cards-api.herokuapp.com/api/v1/cards/random')
          //   .then(response => {
          //     this.drawnCards = response.data.cards;
          //   });
      },

      threeCards() {
          const oneCard = document.getElementById("spread1");
          const threeCards = document.getElementById("spread3");
          const tenCards = document.getElementById("spread10");

          oneCard.style.display = "none";
          threeCards.style.display = "flex";
          tenCards.style.display = "none";
      },

      tenCards() {
          const oneCard = document.getElementById("spread1");
          const threeCards = document.getElementById("spread3");
          const tenCards = document.getElementById("spread10");

          oneCard.style.display = "none";
          threeCards.style.display = "none";
          tenCards.style.display = "flex";
      }
  }
};
</script>

<style>
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
}

.card-div {
    display: flex;
    background-color: midnightblue;
    height: 50vh;
    width: 15vw;
    justify-content: center;
    align-items: center;
    border-radius: 8%;
    border: solid;
    border-color: #ebebeb;
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

</style>