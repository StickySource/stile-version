package net.stickycode.stile.version.component;

import net.stickycode.exception.Preconditions;
import net.stickycode.stile.version.VersionComponent;

class StringVersionComponent
    extends VersionComponent<String> {

  private final String value;

  public StringVersionComponent(String value) {
    this.value = Preconditions.notBlank(value, "String versions cannot be blank");
  }

  @Override
  protected String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }

}
