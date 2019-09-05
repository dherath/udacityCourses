import torch

# usefull for computer vision problems
from torchvision import datasets, transforms

# mnist example

# defines a transform to normalize data
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
    return 1/(1+torch.exp(-x))

# flatten the input image


