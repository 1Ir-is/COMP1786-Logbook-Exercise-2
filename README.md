# COMP1786 - Logbook - Exercise 2

An Android app that allows you to cycle through a series of images using "Next" and "Previous" buttons.

## Features

- Image slider with "Next" and "Previous" buttons.
- Displays a series of images stored in the `res/drawable` directory.
- Automatically hides the "Previous" button on the first image and the "Next" button on the last image.

## Usage

- When you launch the app, it will display the first image and the "Next" button.
- Click the "Next" button to cycle through the images.
- The "Previous" button will appear when you're not on the first image, allowing you to go back.
- The "Next" button will disappear on the last image to indicate that there are no more images to show.

## Customization

You can customize this app by adding your own images to the `res/drawable` directory and updating the `imageResources` array in the `MainActivity.java` file.

```java
private int[] imageResources = {R.drawable.images_image1, R.drawable.images_image2, R.drawable.images_image3};
```

## Screenshots

The UI for the image slider.

![Screenshot 2023-09-25 213502](https://github.com/1Ir-is/COMP1786-Logbook-Exercise-2/assets/93533202/911be84a-5bc6-4962-bab6-5eff76b19dff)
![Screenshot 2023-09-25 213525](https://github.com/1Ir-is/COMP1786-Logbook-Exercise-2/assets/93533202/e2b48c26-3dd2-4974-a361-edf2596f2619)
![Screenshot 2023-09-25 213538](https://github.com/1Ir-is/COMP1786-Logbook-Exercise-2/assets/93533202/17dec89b-e257-4c31-b70a-814be1a4b299)



