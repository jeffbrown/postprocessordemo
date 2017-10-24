package demo

import org.springframework.beans.BeansException
import org.springframework.beans.MutablePropertyValues
import org.springframework.beans.PropertyValue
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor

class SomePostProcessor implements BeanDefinitionRegistryPostProcessor{
    @Override
    void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        BeanDefinition definition = registry.getBeanDefinition('someBean')
        MutablePropertyValues values = definition.getPropertyValues()
        PropertyValue value = values.getPropertyValue('someValue')
        def originalValue = value.getValue()

        // this is where you could do your decrypting...
        values.addPropertyValue('someValue', "MODIFIED: ${originalValue}".toString())
    }

    @Override
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
