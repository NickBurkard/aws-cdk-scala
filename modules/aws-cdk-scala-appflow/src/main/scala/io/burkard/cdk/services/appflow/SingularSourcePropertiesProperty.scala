package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SingularSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
