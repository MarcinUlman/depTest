module dep.test {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.web;
    requires spring.beans;
    requires thymeleaf.spring5;
    requires thymeleaf;
    requires com.fasterxml.jackson.databind;

    requires module;
    requires spring.webmvc;

    opens dev.ulman.deptest to spring.core;
    opens dev.ulman.deptest.controllers.mvc.config to spring.core;
    exports dev.ulman.deptest.controllers.mvc.config to spring.beans, spring.context;
    exports dev.ulman.deptest to spring.beans, spring.context;

    exports dev.ulman.deptest.controllers.mvc;
    exports dev.ulman.deptest.controllers.rest;
}