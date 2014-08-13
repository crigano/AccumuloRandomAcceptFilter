AccumuloRandomAcceptFilter Class
================================

The Accumulo Random Accept Filter Class provides filtering random samples of Key/Value pairs.

It has been used to create training, testing and cross-validation sets for machine learning as well as sample large data sets to gain an understanding of the underlying data set characteristics before consuming entire sets.

By using a set seed a deterministic/repeatable number of samples are guaranteed making experiments repetable. There is also the option of not setting the seed as the situation dictates. 

It should be noted that the exact number of samples may not be returned in all cases.

There is a JUnit Test included to illustrate usage and accuracy.

I would like to thank Ben Tse and other stack overflow contributors in developing this class (see http://stackoverflow.com/questions/21503594/i-am-looking-at-writing-an-accumulo-iterator-to-return-a-random-sample-of-a-perc)
