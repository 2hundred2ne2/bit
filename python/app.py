from flask import Flask

#
app=Flask(__name__) # main

print(__name__)

@app.route('/')
def index():
    return 'Hello_Python'

@app.route('/hello')
def hello():
    return '<h1>/hello 요쳥의 응답입니다.</h1>'

if __name__=='__name__':
    app.run(debu=Trust,port=8000)
    