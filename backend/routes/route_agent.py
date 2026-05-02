# backend/routes/route_agent.py
from fastapi import APIRouter, UploadFile, File, Form
from service.service_agent import process_query

router = APIRouter(prefix="/agent", tags=["Agent"])

@router.post("/query")
async def agent_query(
    file: UploadFile = File(...),
    prompt: str = Form("Describe the scene")
):
    image_bytes = await file.read()
    result = await process_query(image_bytes, prompt)
    return result
