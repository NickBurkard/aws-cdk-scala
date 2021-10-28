package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsCloudMapInstanceAttributeProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
