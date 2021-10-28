package io.burkard.cdk.services.fms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceTagProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty =
    (new software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
