class BinarySearch {
    public static int binarySearch(int[] arr, int search) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) { // Use <= instead of < for correct termination condition
            int mid = (first + last) / 2;

            if (arr[mid] == search) {
                return mid; // Found the element, return its index
            } else if (arr[mid] < search) {
                first = mid + 1; // Search in the right half
            } else {
                last = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 7, 9, 14, 22, 34};
        System.out.println(binarySearch(arr, 5));
    }
}


// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/amarpisal8/DSA-Binary-Search.git
// git push -u origin main