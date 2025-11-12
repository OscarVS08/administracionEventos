package com.ipn.mx.administracioneventos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdministracionEventosApplication implements CommandLineRunner {
    @Autowired
    private EmailService emailService;

    @Override
    public void run(String... args) throws Exception {
        String texto="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras lectus leo, volutpat vel neque id, molestie gravida ligula. Ut interdum dapibus dui, id semper sapien suscipit vulputate. Vestibulum eu lectus libero. Fusce eu dictum augue, sed eleifend libero. Phasellus fringilla at ipsum et ultricies. Vivamus nibh augue, vestibulum a aliquet quis, tempus commodo magna. Mauris sit amet mauris sapien. Integer semper felis dapibus rutrum convallis. Aliquam erat risus, dignissim eget magna a, congue facilisis est. Suspendisse scelerisque libero eget commodo tincidunt. Pellentesque lorem sem, auctor ac magna quis, convallis egestas justo. Nunc tincidunt orci vitae leo laoreet mollis. Quisque leo purus, pulvinar quis nibh vitae, blandit eleifend urna.\n" +
                "\n" +
                "Sed viverra, metus venenatis blandit tempus, tortor elit scelerisque ante, sit amet varius neque libero id mi. Sed at gravida lectus. Nam lobortis, ligula a hendrerit suscipit, sem nunc hendrerit mi, vel porta ipsum nulla eu elit. Ut viverra, quam eu pharetra convallis, risus arcu dignissim nisl, at pulvinar libero quam ac leo. Donec id neque convallis, sagittis mi at, tempor diam. Phasellus interdum imperdiet augue, a iaculis magna vulputate nec. Nunc nec magna sit amet dui varius luctus. In ut tincidunt nibh, at semper odio. Maecenas vitae malesuada felis, vitae egestas diam. Proin id turpis mattis justo ullamcorper suscipit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla dapibus feugiat felis non consequat. Proin sed tempor odio. Vestibulum sed pharetra lectus, sed pellentesque mi.\n" +
                "\n" +
                "In hac habitasse platea dictumst. Donec libero odio, porttitor ut egestas nec, tincidunt et velit. Nunc ultricies mauris ut velit tincidunt, at euismod arcu venenatis. Praesent vel iaculis nisl, ac hendrerit magna. Mauris vitae lorem ut nibh maximus venenatis sed et libero. Suspendisse sagittis iaculis urna nec sollicitudin. Sed erat ex, consectetur a facilisis sed, malesuada nec sapien. Phasellus eleifend rhoncus urna a dictum. Cras interdum et eros ut condimentum.";
        String to = "alberto010787yf@gmail.com";
        String subject = "Lorem ipsum dolor sit amet";

        emailService.enviarCorreo(to,subject,texto);

    }

    public static void main(String[] args) {
        SpringApplication.run(AdministracionEventosApplication.class, args);
    }

}
