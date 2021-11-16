package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsCloudMapInstanceAttributeProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
