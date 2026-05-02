from fastapi import UploadFile

async def process_face(file: UploadFile):
    # Placeholder for SCRFD + ArcFace pipeline
    return {
        "faces_detected": 1,
        "recognized": ["Chrisluiah"] if "known" else ["Unknown Person"],
        "confidence": 0.92
    }
