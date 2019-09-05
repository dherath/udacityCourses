import torch

# usefull for computer vision problems
from torchvision import datasets, transforms

# mnist example

# defines a transform to normalize data, MNIST data has only one channel
transform = transforms.Compose([transforms.ToTensor(),
                                transforms.Normalize((0.5,),(0.5,))
])

# obtaining the MNIST datasets

trainset = datasets.MNIST('MNIST_data/',download=True,train=True,transform=transform)
trainloader = torch.utils.data.DataLoader(trainset,batch_size=64,shuffle=True)

dataiter = iter(trainloader)
images, labels = dataiter.next()
#---------------------------------------

def activation(x):
    """ sigmoid function """
    return 1/(1+torch.exp(-x))

def softmax(x):
    """ softmax function """
    return torch.exp(x)/torch.sum(torch.exp(x),dim=1).view(-1,1)

# flatten the input image
#print(images.shape)
inputs = images.view(images.shape[0],-1) # [64,1,28,28] -> [64, 28x28]

# paramters
num_pixels = 28*28

w1 = torch.randn(num_pixels,256)
b1 = torch.randn(256)

w2 = torch.randn(256,256)
b2 = torch.randn(256)

w3 = torch.randn(256,10)
b3 = torch.randn(10)

# hidden layer outputs

h1 = activation(torch.mm(inputs,w1)+b1)
h2 = activation(torch.mm(h1,w2)+b2)

out = torch.mm(h2,w3) + b3

prob = softmax(out)

print(prob.sum(dim=1))
