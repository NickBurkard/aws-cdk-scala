package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagFormatProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty =
    (new software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
