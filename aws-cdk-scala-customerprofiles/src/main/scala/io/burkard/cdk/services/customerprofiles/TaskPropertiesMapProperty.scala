package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TaskPropertiesMapProperty {

  def apply(
    property: Option[String] = None,
    operatorPropertyKey: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty.Builder)
      .property(property.orNull)
      .operatorPropertyKey(operatorPropertyKey.orNull)
      .build()
}
