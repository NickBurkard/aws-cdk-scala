package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DurationProperty {

  def apply(
    unit: String,
    value: Number
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty.Builder)
      .unit(unit)
      .value(value)
      .build()
}
