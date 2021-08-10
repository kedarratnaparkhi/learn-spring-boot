package com.kedar.junitandmockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Iterator;
import java.util.Properties;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestAdvancedFeatures {

    // Learned from https://www.vogella.com/tutorials/Mockito/article.html

    @Mock
    private Database database;

    @Mock
    private Iterator<String> values;

    @Mock
    Properties properties;

    @Mock
    Properties properties2;

    @Test
    public void testMockInMethodParam(@Mock Comparable<String> testString){
        when(testString.toString()).thenReturn("Hellow wordly!");
        Assertions.assertEquals("Hellow wordly!", testString.toString());
    }

    @Test
    void testWhenThenReturn(){
        when(database.isAvailable()).thenReturn(true);
        Assertions.assertTrue(database.isAvailable());
    }

    @Test
    void testWhenThenReturnChain(){
        when(values.next()).thenReturn("First").thenReturn("Second");
        String result = values.next()+values.next();
        Assertions.assertEquals("FirstSecond", result.toString());

    }

    @Test
    void testDoReturnWhen(){
        doReturn("20").when(properties).get("totalCount");
        String valueone = (String) properties.get("totalCount");
        when(properties2.get("totalCount")).thenReturn("20");
        String valuetwo = (String)properties2.get("totalCount");

        Assertions.assertEquals(valueone, valuetwo);
    }

    @Test
    void testDoThrowWhen(){
        doThrow(new IllegalArgumentException()).when(properties).get("name");

        Assertions.assertThrows(IllegalArgumentException.class, () -> properties.get("name"));
    }

    @Test
    void testVerifyCalls(){

        when(properties.get("name")).thenReturn("kedar");
        String name = (String)properties.get("sdsd");
        verify(properties, atMostOnce()).get(anyString());
        String name2 = (String)properties.get("name");
        verifyNoMoreInteractions(properties);
    }

    @Test
    void testCaptureArguments(){

    }

    @Test
    void testWhenThenAnswer(){

    }
}
