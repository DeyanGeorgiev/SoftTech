const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    return sequelize.define('Issue', {
        title: {
            type: Sequelize.STRING,
            allowNull: false,

        },

        content: {
            type: Sequelize.TEXT,
            allowNull: false,

        },

        priority: {
            type: Sequelize.INTEGER,
            allowNull: false,


        },




    });
};