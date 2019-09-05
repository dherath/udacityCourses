# importing pytorch
import torch
import numpy as np


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


#output = torch.mm(input_values,torch.transpose(weights,0,1)) + bias
#activated_output = activation(output)

#----- other ways to do this --------

# tensor.shape()

output = torch.mm(input_values,weights.view(5,1)) + bias
activated_output = activation(output)

print("--------------------------------")

print("input values: ",input_values)
print("calculated output: ",output)
print("activated output: ",activated_output)

#----- multi layer neural network ---------------------------------------

print("--------------------------------")


input_values = torch.randn((1,3))

n_input = input_values.shape[1] #the number of input units = 3
n_hidden = 2 # number of hidden units
n_output = 1 # number of output units

# weights

w1 = torch.randn(n_input,n_hidden)
w2 = torch.randn(n_hidden,n_output)

# biases

b1 = torch.randn((1,n_hidden))
b2 = torch.randn((1,n_output))


# outputs

o1 = activation( torch.mm(input_values,w1) + b1)
o2 = activation( torch.mm(o1,w2) + b2)

print(o2)
#----------------------------------------------

print("--------------------------------")

print("numpy <-> pytorch")

a = np.random.rand(4,3)
print("a",a)

b = torch.from_numpy(a)
print("b",b)

c = b.numpy()

print("c",c)
