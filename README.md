# bottomSheetDemo

## About
This is a small and quick wrapper for layout that uses [BottomSheetBehavior](https://developer.android.com/reference/com/google/android/material/bottomsheet/BottomSheetBehavior.html)

## Set Up
1. Use [BottomSheetComponent](https://github.com/cyu813/bottomSheetDemo/blob/master/app/src/main/java/com/example/bottomsheetdemo/BottomSheetComponent.kt)
to create customizable bottom sheet. <br>
note : BottomSheetComponent must be a child of CoordinatorLayout, and must use the app:layout_behavior="android.support.design.widget.BottomSheetBehavior" flag <br>
2. add dismiss onClick event in your parent activity, to handle the "X" button dismiss event <br>
```
        fun dismiss(v : View) {
            BottomSheetBehavior.from(component).state = BottomSheetBehavior.STATE_HIDDEN
        }
```

## custom methods
BottomSheetComponent contains some wrapper methods for setting titles and subtitles for the textviews, also a setContent method to swap in any desired view(s) <br>
