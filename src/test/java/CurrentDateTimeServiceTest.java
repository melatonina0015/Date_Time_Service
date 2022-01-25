import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import pl.to.lab10.CurrentDateTimeProvider;
import pl.to.lab10.CurrentDateTimeService;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CurrentDateTimeServiceTest {

    @Rule
    public MockitoRule initRule = MockitoJUnit.rule();

    @InjectMocks
    CurrentDateTimeService service;
    @Mock
    CurrentDateTimeProvider provider;


    @Test
    public void currentDateTimeServiceTest(){
        when(provider.currentDateTime()).thenReturn("1.1.2000");
        Assert.assertEquals("Current date is 1.1.2000", service.display());
    }
}
