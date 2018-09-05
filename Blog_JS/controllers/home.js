const Article = require('./../models/index').Article;
const User = require('./../models/index').User;
const Sequzlize = require('sequelize');

module.exports = {
    index: (req, res) =>{

        Article.findAll (
            {limit: 6, include: [{
                model: User
            }]}).then(articles => { res.render('home/index', {articles: articles});
       });
    }
};






