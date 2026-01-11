#User function Template for python3

def cat_hat(str):
    c=0
    h=0
    for i in range(0,len(str)-2):
        s=str[i:i+3]
        if s=="hat":
            h=h+1
        if s=="cat":
            c=c+1
    if c==h:
        return True
    return False