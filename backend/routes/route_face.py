from fastapi import APIRouter, UploadFile, File
from service.service_face import process_face

router = APIRouter(prefix="/face", tags=["Face"])

@router.post("/detect")
async def detect_face(file: UploadFile = File(...)):
    """Detect and recognize faces in uploaded image"""
    result = await process_face(file)
    return result

@router.post("/register")
async def register_person(name: str, file: UploadFile = File(...)):
    """Register new person"""
    # TODO: Save embedding to vector DB
    return {"status": "success", "message": f"Person {name} registered"}
