package codewar.level6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayDiffRemoveTest {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, ArrayDiffRemove.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, ArrayDiffRemove.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, ArrayDiffRemove.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, ArrayDiffRemove.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, ArrayDiffRemove.arrayDiff(new int [] {}, new int[] {1,2}));
        assertArrayEquals(new int[] {1, 2}, ArrayDiffRemove.arrayDiff(new int [] {1, -2, 2}, new int[] {-2}));
    }


}
