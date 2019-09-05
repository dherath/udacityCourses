from torch import nn

class Network(nn.Module):
    def __intit__(self):
        super().__init__()

        #inputs to hidden layer linear transformation
        num_pixels = 28 * 28
        self.hidden1 = nn.Linear(num_pixels,256)
        self.hidden2 = nn.Linear(256,256)
        self.output = nn.Linear(256,10)

        # sigmoid and softmax activation f()
        self.sigmoid = nn.Sigmoid()
        self.softmax = nn.Softmax(dim=1)

    def forward(self,x):
        # Pass the input tensor through each of the oprations
        # the only problem is we cant see the weights
        x = self.hidden1(x)
        x = self.sigmoid(x)
        x = self.hidden2(x)
        x = self.sigmoid(x)
        x = self.output(x)
        x = self.softmax(x)

        return x

    


#---------------------------------------------------------
# Testing Phase

#model = Network()
#print(model)
