package br.com.digitalhouse.demo.service;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class CalculaIdadeService {

    public static int calculaIdade(Integer dia, Integer mes, Integer ano) throws ParseException {

        String dataString = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);

        Date dateAniversario = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(dateAniversario);
        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        dateOfBirth.add(Calendar.YEAR, age);

        if (today.before(dateOfBirth)) {
            age--;
        }
        System.out.println(age);

        return age;
    }

    public static int calculaIdadeStringUnica(Date dataNasc) throws ParseException {
        
        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(dataNasc);
        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        dateOfBirth.add(Calendar.YEAR, age);

        if (today.before(dateOfBirth)) {
            age--;
        }

        return age;
    }

}
