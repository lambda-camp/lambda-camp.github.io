/** @type {import('tailwindcss').Config} */
module.exports = {
  mode: 'jit',
  content: [
    './public/js/app.js',
    './public/js/index.css',
    './src/camp/lambda/**/*.cljs'
  ],
  plugins: [
    require("@tailwindcss/typography"),
    require('daisyui'),
  ],
  daisyui: {
    themes: ["lemonade"],
  }
}

