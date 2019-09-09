from torch import nn
import torch.nn.functional as F

import copy

class Network(nn.Module):
    def __init__(self):
        super(Network,self).__init__()

        #inputs to hidden layer linear transformation
        num_pixels = 28 * 28
        self.hidden1 = nn.Linear(num_pixels,256)
        self.hidden2 = nn.Linear(256,256)
        self.output = nn.Linear(256,10)

        # sigmoid and softmax activation f()
        # commented it out since F is imported
        #self.sigmoid = nn.Sigmoid()
        #self.softmax = nn.Softmax(dim=1)

    def forward(self,x):
        # Pass the input tensor through each of the oprations
        # the only problem is we cant see the weights -> maybe theer is a way
        #-- method 1 -----------
        #x = self.hidden1(x)
        #x = self.sigmoid(x)
        #x = self.hidden2(x)
        #x = self.sigmoid(x)
        #x = self.output(x)
        #x = self.softmax(x)

        #-- method 2 ----------- more concise
        x = F.sigmoid(self.hidden1(x))
        x = F.sigmoid(self.hidden2(x))
        x = F.softmax(self.output(x), dim=1)
        
        return x

#---------------------------------------------------------
# Testing Phase

# we typically use relu : apprently trains faster
model = Network()

# also try the deepcopy() thing if needed
# visualization did not work
init_weight_size = model.output.weight.data.shape
init_weight = model.output.weight.data.numpy()
print("init_weight: ",init_weight)
