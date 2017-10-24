package postprocessordemo

import demo.SomeBean

class BootStrap {

    SomeBean someBean

    def init = { servletContext ->
        log.info "The Value: ${someBean.someValue}"
    }

    def destroy = {
    }
}
