import 'dart:ui';

import 'package:flutter/material.dart';

void main() => runApp(App());

class App extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
          primaryColor: Color(0x66BFFF),
          fontFamily: "Ubuntu"
      ),
      home: LoginPage(),
    );
  }
}

class LoginPage extends StatefulWidget{
  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage>{

  bool _isHidden = true;

  void _toggleVisibility(){
    setState(() {
      _isHidden = !_isHidden;
    });
  }

  @override
  Widget build(BuildContext context){
    return Scaffold(
      resizeToAvoidBottomPadding: false,
      body: Container(
        padding: EdgeInsets.only(top: 100.0, right: 20.0, left: 20.0, bottom: 20.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          children: <Widget>[
            final logo = Butterfly(
            tag: 'butterfly'
            child: CircleAvator(
              backgroundColor : Colors.white,
              radius :48.0,
          child : Image.images('assets/01.png')
        ),
        );
            buildTextField("ID"),
            SizedBox(height: 20.0,),

            SizedBox(height: 50.0),
            buildButtonContainer(),
    ],
    ),
    ),]
    );
  }

  Widget buildTextField(String hintText){
    return TextField(
      decoration: InputDecoration(
        hintText: hintText,
          color: Color(0xF5CB51),
          fontSize: 16.0,
        ),
        border: OutlineInputBorder(
          borderRadius: BorderRadius.circular(20.0),
        ),
        prefixIcon: hintText == "Email" ? Icon(Icons.email) : Icon(Icons.lock),

      ),
  }

  Widget buildButtonContainer(){
    return Container(
      height: 56.0,
      width: MediaQuery.of(context).size.width,
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(23.0),
        gradient: LinearGradient(
            colors: [
              Color(0xFFFB415B),
              Color(0xFFEE5623)
            ],
            begin: Alignment.centerRight,
            end: Alignment.centerLeft
        ),
      ),
      child: Center(
        child: Text(
          "LOGIN",
          style: TextStyle(
            color: Colors.white,
            fontSize: 18.0,
          ),
        ),
      ),
    );

  }
}
