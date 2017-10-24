// Place your Spring DSL code here
beans = {
    someBean(demo.SomeBean) {
        someValue = 'Some Value'
    }

    somePostProcessor demo.SomePostProcessor
}
