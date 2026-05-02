# backend/db/database.py

# Dummy implementation - In production use Vecs / pgvector
class VectorDB:
    def __init__(self):
        self.db = {}  # name -> embedding

    def store_embedding(self, name: str, embedding: list):
        self.db[name] = embedding
        print(f"Stored embedding for {name}")

    def find_match(self, query_embedding: list, threshold: float = 0.6):
        # Placeholder similarity search
        if not self.db:
            return None, 0.0
        # In real code: use cosine similarity
        best_match = list(self.db.keys())[0]
        return best_match, 0.85

vector_db = VectorDB()
