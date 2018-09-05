const Issue = require('../models').Issue;

module.exports = {
    index: (req, res) => {
        Issue.findAll().then(issues=> {
            res.render('issue/index', {'issues': issues})
        })
    },
	
    createGet: (req, res) => {
        res.render('issue/create')
    },
	
    createPost: (req, res) => {
        let issue = req.body.issue;

        console.log()

        Issue.create(issue).then(()=> res.redirect('/'))
    },
	
    editGet: (req, res) => {
        let issueId= req.params.id;


        Issue.findById(issueId).then(issue=>{
            res.render('issue/edit', {'issue':issue});
        })

    },

    editPost: (req, res) => {
        let iss= req.body.issue;
        let issueId= req.params.id;


        Issue.findById(issueId).then(issue=>{
            issue.updateAttributes(iss).then(()=> {res.redirect('/');})
        });
    },

    deleteGet: (req, res) => {
        let issueId= req.params.id;


        Issue.findById(issueId).then(issue=>{
            res.render('issue/delete', {'issue':issue});
        })
    },
	
    deletePost: (req, res) => {
        let issueId= req.params.id;

        Issue.findById(issueId).then(issue=>{
            issue.destroy().then(()=> {res.redirect('/');})
        })
    }
};