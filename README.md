# Vision Aid - Intelligent Assistive System for the Visually Impaired

**Mini Project**  
Rajagiri School of Engineering & Technology (Autonomous)  
Submitted in March 2026

## Overview
Vision Aid is an AI-powered assistive application designed to enhance independence and safety for visually impaired individuals. The system provides real-time face recognition, scene understanding, and contextual audio guidance.

## Key Features
- Real-time camera streaming from Android device
- Face Detection using **SCRFD** model
- Face Recognition using **ArcFace** embeddings
- Efficient storage and retrieval of facial features using **Vector Database**
- Contextual scene understanding and intelligent responses powered by **Gemini API**
- Voice-based feedback for easy accessibility
- Manage registered faces (add, view, delete)

## System Architecture
- **Frontend**: Android Application (Kotlin)
- **Backend**: FastAPI (Python)
- **Computer Vision**: SCRFD (Face Detection) + ArcFace (Recognition)
- **Database**: Vector Database (Vecs / PostgreSQL with pgvector)
- **Multimodal AI**: Google Gemini API
- **Output**: Text-to-Speech

## Tech Stack
- Android (Kotlin + CameraX)
- FastAPI
- ONNX Models (SCRFD & ArcFace)
- Gemini API
- Vector Database

## Team
- Chrisluiah Jiji (U2308018)
- Jyolsana J (U2308040)
- K N Harigovind (U2308041)
- Rohith Suresh (U2308058)

**Project Guide**: Ms. Sreeja K Soman

## How to Run
1. Clone the repository
2. Open the `app` folder in Android Studio
3. Run the backend:
   ```bash
   cd backend
   uvicorn app:app --reload
