package ee.tlu.sergei.klassitoo0215;
import static org.mockito.Mockito.*;
public class Proov1 {
    public static void main(String[] args) {
        Vagun v1= mock(Vagun.class);
        when(v1.kysiAsukoht()).thenReturn(7);
        System.out.println(v1.kysiAsukoht());
        System.out.println(v1.kysiAsukoht());
        verify(v1, times(2)).kysiAsukoht();
        when(v1.edasi(anyInt())).thenCallRealMethod();
        when(v1.edasi(1)).thenReturn(1);
        when(v1.edasi(2)).thenReturn(2);
        when(v1.tagasi(anyInt())).thenReturn(-2);
        System.out.println(v1.edasi(2));
        System.out.println(v1.edasi(5));
        System.out.println(v1.tagasi(3));
    }
}
