
# react-native-justified-text

## Getting started

`$ npm install react-native-justified-text --save`

### Mostly automatic installation

`$ react-native link react-native-justified-text`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-justified-text` and add `RNJustifiedText.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNJustifiedText.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNJustifiedTextPackage;` to the imports at the top of the file
  - Add `new RNJustifiedTextPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-justified-text'
  	project(':react-native-justified-text').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-justified-text/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-justified-text')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNJustifiedText.sln` in `node_modules/react-native-justified-text/windows/RNJustifiedText.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNJustifiedText;` to the usings at the top of the file
  - Add `new RNJustifiedTextPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNJustifiedText from 'react-native-justified-text';

// TODO: What to do with the module?
RNJustifiedText;
```
  