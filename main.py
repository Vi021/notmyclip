import torch

print("Hello")

device = "cuda" if torch.cuda.is_available() else "cpu"

print('Use device:', device)