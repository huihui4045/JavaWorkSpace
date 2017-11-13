package demo;

import java.io.UnsupportedEncodingException;

/**
 * Created by gavin on 2017/10/25.
 */
public class Demo {

    public static void main(String[] args) {

        String m="0Coq1Uf8WYcCtFE3GsZgx65q9XgJu2ijCJmlUCk/6OA9NZ0HVQTGZ8nj6GBA7yZxut2+qhfuK4HC\n" +
                "upjxfyeqfZBBXS6JDo8gTdD6EG8QvooBw81Q4NdTEg==";

        String s1="0Coq1Uf8WYeY2moh/DNgZDbVVwxU1axsUvpA5GF0touj/fRwUdVw62m3lUcAl40B/aBlE/K3AAA4\n" +
                "UcJ42nTnaekp7wb72NBAgjylzKNExqVYIeoIvhaoc85IY/mElnWDHjSEUhNCvNsBhUJz49DJvXQY\n" +
                "bcSAwrN8REyJ13vHP/4J/LUAsOpWb+qibWdkwL7iyZRINPjLpsbz5qDNCV74Fp1q4Dq3JVqI6uT1\n" +
                "njfHOipL9rY+Ytgu4DleUVGo4AwzWzefNkuhG5o+3VK+YBj2L0qYsxCjDR8RAPazRBCYqEdbADj4\n" +
                "S/kGCYHJa+kWZ4FOoel2eUXm0pETnphN2SSg98GSfjbMAZU3E8fBEvoQvFoZfNnQ9zINtGJUs3rC\n" +
                "VpRjm+OgxK/9scjNgNZsko0N2NAxe6ErTsW9y7cRasfU/7flqn3qbA9uhWTiMwN/Xm3pL9qMa1J+\n" +
                "WmenKdaPa5e29jeK2qksS6vdZ0NZJsXLBIbIdYbuj28QfGnqTjSrvEas0V8dYr6ErI4xD/BNgoWs\n" +
                "2PV5txaCycXAhbfxlEO8AUngmqoXhvpE3i69o3DstKE8YTK2Esj2iWFTlvvoZFzpgui4GOXd60zm\n" +
                "EC5Wd4fMOHS30DDgsxL5A0HHnWseZuCZONReXkbT4+tCb+llpo7WvjvynzSf216o2QdtMVaqjksn\n" +
                "mK5DIbmLqNhA1JYyK+XvNlWeCTjthod6OCQ3qQda9gJzPdx14ZPLLszhLrRXIUXwdvm0co95VciS\n" +
                "3LQNtvbmukh4aLBXwhUxfzu/jP4fz8okoUL0Mmu5yw9xX9UqJWHOBKSqTVicPW8qKMCDRYoGRxe/\n" +
                "64GVZuHKH6AjICltc3tG0S6L0HIDgiKENFZhzczcOXkZmG5mqcJW4xDlwltk5rbZ2a3IL/SuXqQD\n" +
                "DP28Hqgz9Mw/eKqYyCeLz0pdAcHaxR6ssTeuV7DeG4VrkV7oJYc4auUl9MdEMgU0E9LbfbSvxGye\n" +
                "iicmEq64D8Wfpu8q58kDDKDzn5UHcm8Q/DPP4Ib8/JdA48Qq/Xu8yLpIJrgvGqxPepelfRm3HJvv\n" +
                "orJm4Uk4z3AbPUWN0+27ZhWkGH3Vyt3L+15BeF/GNq8H2/AgmfVwJ8nBIrMBBJ2HWRK9Q222TFMT\n" +
                "8dijGehuKTN1Wy0AhQFd8aS6pSjShCiVZl6C3sJX4pDkZDt2NKOkbLK4+L0u+9F1gvy95+ky7ly0\n" +
                "T6B8x/YV1pXxlbWKhBYW3vBvx+9NZDVJf8lQhy2oH+x4hld88Ms7coR9xpt/LPNGlg43AyVD6s0J\n" +
                "8wQT4LqXMr+YjwHB7S+JWqQPaC+ZjyAJdc1YeCXb/4Da8Pcr3qVQgBbe938DXPKPRb3RxbIvG0Jo\n" +
                "X1PxI9tu3d7CXKV+KpKOO9qzTNlFgUXTcR0ORbX54Jja+tvNyUvHmTrmgQg5BKjVlEO2F3jUhhD8\n" +
                "MyyF5Bb9tLFseYLakUVf8cxvMaQi78TXlMp5yMc+vUHIDOx7KCM0v7wbMzCBygWcTYTNqgEa5cEv\n" +
                "Ef8aYpmhQkhTlE8v0AsMgh5w8ngLbSQNqEa0wMoiSpT2xlWRuvKKuQVASlIaeVvhJtzpuduYR4Ce\n" +
                "r+oQU73EG4+RZ/qn3Xc0fe4pfXQvx7xz82/VZBMC442VMEwTp3+BSQcvjJ1zZh9jb1WRaRs0+zM6\n" +
                "0vVXZWhqpru+roeBT04KxNOkpVVBvKce6ZtKGxDt0tYoXYCthbssu5DHGNTomPZO/Rqc43IGY6k4\n" +
                "nmlGjacxyKpfbhelU2kDDRvdj/PXedD2SpSxB2pwGqMpFacv0rw8OZIcyX0E8j7HYQxO6M2XWitI\n" +
                "Q/oCenAn6M9kIvI25saTQP8P4esYizgWe7iCuEt47Ndab5Y/94gkh37CqEkCbGA4amE6ax+vMdMl\n" +
                "2t0PBXGCFPcvK6Tnt91FMtQLUIofSGLRc4GdaCTKq4lu4Wi7ibguoCQqDbSMJeCriMIsTVX7R1TJ\n" +
                "P0FVWfbJX1PkgzPI+y/nuAV/l0pAuzJgIe5xOlfkYOowW7k4QC9xMsHeqLyd+59TCDiUcUZN4DLl\n" +
                "n4MzW9nQGVMUlMFio50hcsFzKLbNe2mze5PoeTrLkwC3J9a7PFP8YGYrMpUqB8eYPlirQyv3Hqc9\n" +
                "C0KSY/pWZcLjEEiuQX+YC2KGM79KWpw1ypooWlJO5OvBfjIpvhn4HxIYYD2778mqgQQ8bcm6ZMo5\n" +
                "I0slP7KooI0dPW3uAKFpiOx4DEwV5nRnrafT7/PkbVjmDVB+XzLwlNKwzCO5eOVNEGvjTAP4E5yC\n" +
                "a1P/Vnx76ntUyAHcM/vXDTzUfc7l4zXXsSVHKconVmG6V88Cil8Mx/8Brkhyz6hWA+SGW5BYtsjG\n" +
                "cDX3EddLYwCA7TlyP+F01VpYwaCbZrTBhkY2iQRyf1UZLHiwf5WXutymcX/bCeh+6L0pdAB5OEmg\n" +
                "Mh+2YRfWWysHlkd9x2cUCAlvrOoCQ7RXZI4XMSBf0/TdbQP5JlfKN7n7nit25jomOTZYq/hgjdvZ\n" +
                "ELeEQwFKY1lYFdLXO/qrvwwWS41RVoJxHk2E5qBMdq1xHFCDp1fbCZGyO3Ov28DyH2AlyL7wbRTQ\n" +
                "5iwK+ICuP2TnjkwMIwhA3jGUyyHNWDAyn7rkcbv7Af91YfRU9OB6/JxYmFvU3hN8gNzsRmVdjE9M\n" +
                "EpUu/ykuAf4rOJ27YsPbcIPvF/BiLJuq76Y86fNNdrA6IwMmjnxIrbY/oAWLPF0/WCM/lLdMwhfZ\n" +
                "caBCRAeD0I7X2zU/to9TlBQeMevKXi0f/ZpUdCroH7FqMKAgKiuISMSCXIgrbbng8sKr5t3gb9tD\n" +
                "Ruy/kz4m5J3K0v8ZUmjip+bpbtN2KEuOFmXLj5OtaIaNyUEt08b8xaB1Wrxq1hARB00uHU/N4u7D\n" +
                "aSNb8AxP12xo3NmjEfw/a91fYr0XScqGmW2e2MQ018rQ2DhXcbap0SJ+5w4ORK6LyYCsqaKaDb4S\n" +
                "up7KjOx0uLpgidL6OMoC+Qbt7qvK9jU4gwTooOfvzfgJ4941M4T8rB1rwfpVoJETXPaaHzjz9fUR\n" +
                "DQXfmPYGMwSLh2QQ4U2OYoBE2yBHrsDYslYCR+PmWneUittKhpvbp0DPut6Ktl8vCYrXmGPCUN5I\n" +
                "xL1OslMHRDObrJ0HS3h+cxkq5EJi1QZiRfAkPY4+ty5KZ3L1jswMcR8e/yr3g+nRpFZOPzDMyoQr\n" +
                "i6Ng6MWwlB+Gv3w8Pi0KMPEzDXRM7kZeb8FIX3o1i1JcjxJrkYztoj2Wcodp0FZsLXlZ1DIe7sp4\n" +
                "mMJfDQtWJLlbPsVe/Y6gCt3xr1nFYJN05eQX1LZdMkvjmCQMvX9UhvzYnKMnZETOcAK4BzMRQMK8\n" +
                "gp+IPLEJrf3SqFa1Dz36+1qKtcnKjHwaeeePbLNb5Ezj8wWgS1aYMxqJQmGfH2axaf6O2cots+4d\n" +
                "kxMgdpHOgaJoz40yRpV6+h1UE6A+PMyKrl96AvmdNkc1/mAZsQN8Lz9ypW5254Js/d2dflrIUMPM\n" +
                "oqRjljsAtp8x9Ffg8/Mw3MRjDMkRyyVlGdWj/oSpDBb6fLXE+HsINHYWiFnEccPDFMqJ2b2TdQHU\n" +
                "zw==";

        byte[] decode = util.Base64.decode(s1, Base64.DEFAULT);

        String s = null;
        try {
            s = new String(decode,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        System.out.println(s);
    }
}
