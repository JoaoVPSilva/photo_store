from django.db import models

class Users(models.Model): 
    id = models.AutoField(primary_key=True)
    name = models.CharField(max_length=200, null=False, blank= False)
    email = models.EmailField()
    
    def getAll(self):
        return self
    
    