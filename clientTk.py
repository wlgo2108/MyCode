#!/usr/bin/env python
# coding=utf-8

from Tkinter import * 
from socket import * 

class Chat :
    def __init__(self) :
        window = Tk() 
        window.title("Chat") 
        self.text = Text(window)
        self.text.pack() 
        frame1 = Frame(window)
        frame1.pack() 
        label = Label(frame1,text = "Enter your Message :")
        self.Message = StringVar() 
        
