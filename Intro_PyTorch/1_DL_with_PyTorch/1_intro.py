# importing pytorch
import torch

def activation(x):
    """
    sigmoid activation function [output will be between 0 and 1]
    @param x: torch.Tensor
    """
    return 1/(1+torch.exp(-x))

#------- testing phase ------------

# setting the manual seed
seed_value = 7
torch.manual_seed(seed_value)

input_values = torch.randn((1,5))
weights = torch.randn_like(input_values) # creates as to the same dimension of input_values
bias = torch.randn((1,1)) # a single bias value


output = torch.mm(input_values,torch.transpose(weights,0,1))+ bias
activated_output = activation(output)

print("input values: ",input_values)
print("calculated output: ",output)
print("activated output: ",activated_output)
