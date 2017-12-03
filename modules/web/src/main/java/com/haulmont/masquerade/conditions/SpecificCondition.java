package com.haulmont.masquerade.conditions;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

/**
 * Implementation depends on Component.
 */
public class SpecificCondition extends Condition {
    public SpecificCondition(String name) {
        super(name);
    }

    @Override
    public boolean apply(WebElement element) {
        throw new RuntimeException("SpecificCondition must be checked ony in component implementations");
    }
}