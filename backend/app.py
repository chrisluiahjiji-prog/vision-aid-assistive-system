from fastapi import FastAPI
from routes import route_face, route_agent

app = FastAPI(title="Vision Aid API")

app.include_router(route_face.router)
app.include_router(route_agent.router)

@app.get("/")
def home():
    return {"message": "Vision Aid Backend Running ✅"}
