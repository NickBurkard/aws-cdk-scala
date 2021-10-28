package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ShutdownEventConfigurationProperty {

  def apply(
    executionTimeout: Option[Number] = None,
    delayUntilElbConnectionsDrained: Option[Boolean] = None
  ): software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty =
    (new software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder)
      .executionTimeout(executionTimeout.orNull)
      .delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
