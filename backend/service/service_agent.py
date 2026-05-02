import os
# from google.generativeai import GenerativeModel  # uncomment when using real Gemini

async def process_query(image_bytes, user_prompt: str):
    """Send image + prompt to Gemini for contextual guidance"""
    # Placeholder response
    return {
        "response": "You are in your room. There is a chair in front and a known person (Chrisluiah) on your left.",
        "guidance": "Walk forward carefully. Say hi to Chrisluiah."
    }
