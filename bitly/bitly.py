import random

map={}

def post_url(url,id=None):
    if id is not None:
        id = random.randint(1000,10000)
    if id in map:
        return 409, "Conflict, id " + id + "already exists"
    map[id]=url
    return 201, "Shortened URL with id " + id


def get_url(id):
    if id in map:
        return 302, "Found " + id + "=> "+ map[id]
    return 404, "Not Found"

