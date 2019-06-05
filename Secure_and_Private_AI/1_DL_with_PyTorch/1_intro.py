import torch

# sigmoid activation function
def activation(x):
    """
    Sigmoid activation function
    @param x: torch.Tensor
    """
    return 1/(1+torch.exp(-x))


#---------------------------------

torch.manual_seed(7) #set the random seed to 7

features = torch.randn((1,5)) # [1,5] i.e 5 normal variables, the input data
weights = torch.randn_like(features) # 5 weights to match the #features
bias = torch.randn((1,1)) # the bias value

output = activation(torch.sum(features*weights)+bias)
#output2 = activation(torch.sum(torch.mm(features,weights.flip(0)),bias))

output2 = activation((features*weights).sum()+ bias)

output3 = activation(torch.sum(torch.mm(features,weights.view(5,1)))+bias)


#--------- torch.matmul() --------



print(output)
print(output2)
print(output3)
#print("output: "+output+" output2: "+output2)
