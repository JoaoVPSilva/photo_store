from django.db import models
from .produtos import Produto

class Carrinho(models.Model):   
    produto = models.ForeignKey(Produto, on_delete=models.CASCADE)
    quantidade = models.PositiveIntegerField()
    usuario = models.CharField(max_length=200, blank=True, null=True)
    
    def __str__(self):
        return f'{self.produto.nome} - {self.quantidade}'