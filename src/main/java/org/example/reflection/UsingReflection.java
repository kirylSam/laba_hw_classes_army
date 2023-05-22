package org.example.reflection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Veteran;
import org.example.enums.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class UsingReflection {

    static Logger logger;

    public static void use(){
        //extract modifiers, return types, parameters
        //from
        //constructors and methods
        //using reflection - create an object and call its method
        logger = LogManager.getLogger("org.reflection.UsingReflection");
        /*Veteran newVeteran = new Veteran("Alex", "Johns", "1990-02-19");
        logger.info(newVeteran.prepareInfo());

        newVeteran.setAddress("Downing", "Maine", "US");
        newVeteran.setVeteranRank(VeteranRanks.CAPTAIN);
        newVeteran.setCombatantCommand(CombatantCommands.US_ARMY_CYBERCOMMAND, CommandHQs.WEISBADEN);
        newVeteran.setArmyComponent(ArmyComponents.ARMY_RESERVE);
        newVeteran.setRegiment(ArmyRegiments.RANGER_REGIMENT);
        newVeteran.setPension(100000);
        newVeteran.setMilitaryOccupationalCode(4);
        logger.info(newVeteran.prepareInfo());*/

        //getting the class obj
        Class<?> reflectionClass = Veteran.class;
        //ALL methods, including inherited
        Method[] allMethods = reflectionClass.getMethods();
        displayMethodsInfo(allMethods);

        //Constructors
        Constructor<?>[] constructors = reflectionClass.getConstructors();
        displayConstructorInfo(constructors);

        //Creating an object
        try {
            Constructor<?> declaredConstructor =
                    reflectionClass.getDeclaredConstructor(String.class, String.class, String.class);
            Object instance = declaredConstructor.newInstance("Name", "Surname", "DOB");

            //Calling a method on that object
            Method method = instance.getClass().getMethod("prepareInfo");
            Object resultOfInvoking = method.invoke(instance);
            if (resultOfInvoking instanceof String) {
                //if the return type of this method is a String
                //then we'll cast it
                String returnedValue = (String) resultOfInvoking;
                logger.info("[REFLECTION] The method returned: " + returnedValue);
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void displayConstructorInfo(Constructor<?>[] constructors) {
        for (Constructor constructor : constructors){
            //Modifiers
            int modifier = constructor.getModifiers();
            String constructorString = Modifier.toString(modifier);

            //Parameter types
            Class<?>[] parameterTypes = constructor.getParameterTypes();

            logger.info("[Reflection] Constructor: " + constructor.getName() + ", with modifier " + constructorString);
            logger.info("[Parameters]: ");
            for(Class<?> parameter : parameterTypes) {
                logger.info(parameter.getName());
            }
        }
    }

    private static void displayMethodsInfo(Method[] arrayOfMethods) {
        for (Method method : arrayOfMethods) {
            //Getting modifier
            int modifier = method.getModifiers();
            String modifiersString = Modifier.toString(modifier);

            //Getting method name
            String methodName = method.getName();

            //Getting parameter type
            Class<?>[] parameterTypes = method.getParameterTypes();

            //Getting return type
            Class<?> returnType = method.getReturnType();

            logger.info("[Reflection] Method Name: " + methodName + ", with modifier " + modifiersString);
            logger.info("[Parameters]: ");
            for(Class<?> parameter : parameterTypes) {
                logger.info(parameter.getName());
            }
            logger.info("[Return Type] " + returnType.getName());
        }
    }
}
